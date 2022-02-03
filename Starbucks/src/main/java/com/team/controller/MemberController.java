package com.team.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
	public void PostMember(MemberDTO mdto) {
		System.out.println("PostMember"+mdto);
		mservice.insert(mdto);
	}
	
	// 로그인 화면 띄우기
	@GetMapping("login")
	public void login() {
		System.out.println("login.jsp");
	}
}
