package com.team.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
