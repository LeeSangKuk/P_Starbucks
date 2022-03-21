package com.team.controller;

import java.util.Random;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MailController {
	// by수진,
	// 이메일 인증번호 요청 메서드
	@Autowired
	private JavaMailSender mailSender;
	
	@ResponseBody
	@PostMapping("sendMail")
    public String sendMailTest(@RequestBody String email) throws Exception{
        System.out.println("sendMailTest 실행");
        
		Random random=new Random();  //난수 생성을 위한 랜덤 클래스
		String key="";  //인증번호 

		//입력 키를 위한 코드
		for(int i =0; i<3;i++) {
			int index=random.nextInt(25)+65; //A~Z까지 랜덤 알파벳 생성
			key+=(char)index;
		}
		int numIndex=random.nextInt(9999)+1000; //4자리 랜덤 정수를 생성
		key+=numIndex;
		System.out.println("key : "+key);
		
        String subject = "Starbucks Korea 인증번호 안내";
        String content = "입력하실 번호는 "+key+"입니다.";
        String from = "hansuzin98@gmail.com";
        String to = email;
        
        try {
            System.out.println("sendMailTest try 실행");
            MimeMessage mail = mailSender.createMimeMessage();
            MimeMessageHelper mailHelper = new MimeMessageHelper(mail,true,"UTF-8");
            // true는 멀티파트 메세지를 사용하겠다는 의미
            
            /*
             * 단순한 텍스트 메세지만 사용시엔 아래의 코드도 사용 가능 
             * MimeMessageHelper mailHelper = new MimeMessageHelper(mail,"UTF-8");
             */
            System.out.println("sendMailTest 선언 종료");
            mailHelper.setFrom(from);
            // 빈에 아이디 설정한 것은 단순히 smtp 인증을 받기 위해 사용 따라서 보내는이(setFrom())반드시 필요
            // 보내는이와 메일주소를 수신하는이가 볼때 모두 표기 되게 원하신다면 아래의 코드를 사용하시면 됩니다.
            //mailHelper.setFrom("보내는이 이름 <보내는이 아이디@도메인주소>");
            System.out.println(from);
            System.out.println(to);
            mailHelper.setTo(to);
            System.out.println(to);
            mailHelper.setSubject(subject);
            System.out.println(subject);
            mailHelper.setText(content, true);
            System.out.println(content);
            // true는 html을 사용하겠다는 의미입니다.
            
            /*
             * 단순한 텍스트만 사용하신다면 다음의 코드를 사용하셔도 됩니다. mailHelper.setText(content);
             */
            mailSender.send(mail); //전송
            System.out.println(mail);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        return key;
        
    }
}
