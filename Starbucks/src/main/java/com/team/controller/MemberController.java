package com.team.controller;


import java.util.Properties;
import java.util.Random;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import com.team.domain.MemberDTO;
import com.team.service.MemberService;

@RequestMapping("member")
@Controller
public class MemberController {
	
	@Autowired
	MemberService mservice;
	
	
	// by수진, 회원가입 화면 띄우기
	@GetMapping("join")
	public void join() {
		System.out.println("join.jsp");
	}
	
	// by수진, 2022-02-17 pm 3:00
	// 회원가입시 사용할 아이디에 대한 유효성검사를 할 때 ajax를 통하여 db에서 select 후 있으면 1 없으면 0
	@ResponseBody
	@PostMapping("checkId")
	public int checkId(MemberDTO mdto) {
		int cnt = mservice.checkId(mdto);
		System.out.println("controller: "+cnt);
		if(cnt == 0) 
			return cnt;
		else 
			return cnt;

	}

//	@ResponseBody
//	@PostMapping("confirmEmail")
//		public String SendMail(String mail) {
//			Random random=new Random();  //난수 생성을 위한 랜덤 클래스
//			String key="";  //인증번호 
//
//			SimpleMailMessage message = new SimpleMailMessage();
//			message.setTo(mail); //스크립트에서 보낸 메일을 받을 사용자 이메일 주소 
//			//입력 키를 위한 코드
//			for(int i =0; i<3;i++) {
//				int index=random.nextInt(25)+65; //A~Z까지 랜덤 알파벳 생성
//				key+=(char)index;
//			}
//			int numIndex=random.nextInt(9999)+1000; //4자리 랜덤 정수를 생성
//			key+=numIndex;
//			message.setSubject("인증번호 입력을 위한 메일 전송");
//			message.setText("인증 번호 : "+key);
//			message.
//	        return key;
//		}
//	
//	public static void gmailSend() {
//		
//		//1. 발신자의 메일계정과 비밀번호 설정
//		final String user = "hansuzin98@gmail.com"; //발신자의 이메일 아이디를 입력 
//		final String password = "password"; //발신자 이메일의 패스워드를 입력
//		
//		
//		/*
//		 * 
//		 * properties : 파일 읽기 클래스
//		 * mail.smtp.host : 이메일 발송 처리담당 SMTP서버
//		 * 		gmail을 SMTP서버로 사용할 경우 smtp.gmail.com으로 설정, naver를 SMTP서버로 사용할 경우 smtp.naver.com
//		 * mail.smtp.port : SMTP서버와 통신하는 포트
//		 * 		gmail일 경우 465 , naver의 경우 587 
//		 * 		주의 ! 구글과 네이버의 경우 Properties설정 값이 다르다!
//		 * */
//		
//		
//		//2. Property에 SMTP 서버 정보 설정
//		Properties prop = new Properties(); 
//		prop.put("mail.smtp.host", "smtp.gmail.com"); 
//		prop.put("mail.smtp.port", 465); 
//		prop.put("mail.smtp.auth", "true"); 
//		prop.put("mail.smtp.ssl.enable", "true"); 
//		prop.put("mail.smtp.ssl.trust", "smtp.gmail.com");
//		
//		
//		/*
//		 * getDefaultInstance() [Session클래스의 메서드]: 파라미터로 전달받은 Properties에 저장되어 있는 속성값을 사용하여 세션을 생성
//		 * */
//		
//		//3. SMTP 서버정보와 사용자 정보를 기반으로 Session 클래스의 인스턴스 생성
//		//Properties에 저장돼있는 설정 값을 getDefaultInstance() 메소드로 설정값을 저장하여 세션 생성
//		
//        Session session = Session.getDefaultInstance(prop, new javax.mail.Authenticator() {
//            protected PasswordAuthentication getPasswordAuthentication() {
//                return new PasswordAuthentication(user, password);
//            }
//        });
//        
//        
//        //4. Message 클래스의 객체를 사용하여 수신자와 내용, 제목의 메세지 작성
//        //5. Transport 클래스를 사용하여 작성한 메세지 전달
//        try {
//            MimeMessage message = new MimeMessage(session);
//            message.setFrom(new InternetAddress(user));
//
//            //수신자메일주소
//            message.addRecipient(Message.RecipientType.TO, new InternetAddress("ktko@ktko.com")); 
//
//            // Subject
//            message.setSubject("제목을 입력하세요"); //메일 제목을 입력
//
//            // Text
//            message.setText("내용을 입력하세요");    //메일 내용을 입력
//
//            // send the message
//            Transport.send(message); ////전송
//            System.out.println("message sent successfully...");
//        } catch (AddressException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (MessagingException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//
//
//
//        
//        
//		
//	}




	// by수진, 
	// mdto : 회원가입 화면을 통해 얻어진 데이터 insert
	@PostMapping("join") 
	public String postJoin(MemberDTO mdto) {
		System.out.println("postJoin"+mdto);
		mservice.postJoin(mdto);
		
		return "redirect:/member/login"; // 회원가입 완료시 로그인 화면으로 이동
	}
	
	// by수진, 로그인 화면 띄우기
	@GetMapping("login")
	public void login() {
		System.out.println("login.jsp");
	}
	
	/*
	 * session : 로그인했을때 정보가 저장된채로 다른 페이지를 이동하더라도 로그인정보가 홈페이지에 계속 유지 ,
				우리가 만든 게시판은 새로고침할때마다 데이터가 리셋됐는데 게시판과 달리 데이터가 홈페이지에 계속 유지되도록 하는 기능
		session.invalidate(); : 로그아웃
	 * */
	
	// by수진, 로그인 하기 
	// mdto: input값에 입력한 아이디와 비밀번호를 db에서 select
	// session: 세션객체를 통하여 로그인 성공시 로그인 된 채로 메인페이지 이동
	@ResponseBody
	@PostMapping("postLogin")
	public int postLogin(MemberDTO mdto,HttpSession session) {
		System.out.println("mdto : "+mdto);
		
		int loginCheck=mservice.postLogin(mdto); // 로그인성공 = 1 로그인실패 = 0
		MemberDTO getLogin=mservice.getLogin(mdto); // 로그인시 회원정보 가져오기
		
		if(loginCheck==1) {	// 변수값이 1이면
			System.out.println("session:"+loginCheck);
			session.setAttribute("login", getLogin);// 세션객체(sesiion)  login변수에 getLogin값을 저장(setAttribute)
			
			return loginCheck; // js로 리턴
		}else {// 변수값이 1이 아니면
			System.out.println("session else:"+loginCheck);
			return loginCheck; // js로 리턴
		}
			
	}
	
	@GetMapping("logout")
	public String postLogout(MemberDTO mdto,HttpSession session) {
		session.invalidate();
		System.out.println("logout");
		
		return "redirect:../main";
	}
	
	
	
	
	
	//2022-02-17 am 11:58 깃허브 테스트 by수진
	
}
