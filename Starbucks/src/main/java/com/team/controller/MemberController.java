package com.team.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;

import com.team.domain.MemberDTO;
import com.team.service.MemberService;

@RequestMapping("member")
@Controller
public class MemberController {
	
	@Autowired
	MemberService mservice;
	
	
	// 회원가입 화면 띄우기
	@GetMapping("join")
	public void join() {
		System.out.println("join.jsp");
	}
	
	// 회원가입 화면을 통해 얻어진 데이터 insert
	@PostMapping("join") 
	public String postJoin(MemberDTO mdto) {
		System.out.println("PostJoin"+mdto);
		mservice.postJoin(mdto);
		
		return "redirect:/member/login";
	}
	
	// 로그인 화면 띄우기
	@GetMapping("login")
	public void login() {
		System.out.println("login.jsp");
	}
	

	@ResponseBody
	@PostMapping("postLogin")
	public int postLogin(MemberDTO mdto,HttpSession session) {
		System.out.println("mdto : "+mdto);
		
		int loginCheck=mservice.postLogin(mdto); // 로그인성공 = 1 로그인실패 = 0
		MemberDTO getLogin=mservice.getLogin(mdto); // 로그인정보
		
		// session : 로그인했을때 정보가 저장된채로 다른 페이지를 이동하더라도 로그인정보가 홈페이지에 계속 유지 ,
					//하지만 우리가 만든 게시판은 새로고침할때마다 데이터가 리셋됐는데 게시판과 달리 데이터가 홈페이지에 계속 유지되도록 하는 기능
		// session.invalidate(); : 로그아웃
		// session영역에 login이라는 변수에 값이 있으면 로그인 된 채로
		if(loginCheck==1) {	// 변수값이 1이면
			System.out.println("session:"+loginCheck);
			session.setAttribute("login", getLogin);// 세션객체(sesiion)에  login변수에 login값을 저장(setAttribute)
			
			return loginCheck;
		}else {// 변수값이 1이 아니면
			System.out.println("session else:"+loginCheck);
			return loginCheck;
		}
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}