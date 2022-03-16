package com.team.controller;



import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	/* ----------------------- 회원가입 ----------------------- */
	
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
		return cnt;
	}

	// by수진, 
	// 회원가입 화면을 통해 얻어진 데이터 insert
	@PostMapping("join") 
	public String postJoin(MemberDTO mdto) {
		mservice.postJoin(mdto);
		
		return "redirect:/member/login"; // 회원가입 완료시 로그인 화면으로 이동
	}

	/* ----------------------- 로그인 ----------------------- */
	// by수진, 로그인 화면 띄우기
	@GetMapping("login")
	public void login() {
		System.out.println("login.jsp");
	}
	
	/*
	 * session : 다른 페이지를 이동하더라도 정보가 홈페이지에 계속 유지 
		session.invalidate(); : 로그아웃
	 * */
	
	// by수진, 로그인 하기 
	// mdto: input값에 입력한 아이디와 비밀번호를 db에서 select
	// session: 세션객체를 통하여 로그인 성공시 로그인 된 채로 메인페이지 이동
	@ResponseBody
	@PostMapping("postLogin")
	public int postLogin(MemberDTO mdto,HttpSession session) {
		
		int cnt=mservice.postLogin(mdto); // 로그인성공 = 1 로그인실패 = 0
		MemberDTO data=mservice.sessionLogin(mdto); // 로그인시 회원정보 가져오기
		
		if(cnt==1) {	// 변수값이 1이면
			System.out.println("session:"+cnt);
			session.setAttribute("login", data);// 세션객체(sesiion)  login변수에 getLogin값을 저장(setAttribute)
			
			return cnt; // js로 리턴
		}else {// 변수값이 1이 아니면

			return cnt; // js로 리턴
		}
			
	}
	
	// 로그아웃 메서드
	@GetMapping("logout")
	public String postLogout(MemberDTO mdto,HttpSession session) {
		session.invalidate(); // 로그아웃
		System.out.println("logout");
		
		return "redirect:../main";
	}
	
	
	
	
	/* ----------------------- 아이디 찾기 ----------------------- */
	
	// by수진, 2022-03-04 am09:14
	// findId.jsp 메서드 추가
	@GetMapping("findId")
	public void findId() {
		System.out.println("findId.jsp");
	}
	
		/* 본인인증 -> 아이디/비밀번호 찾기에서  공통으로 쓰임 */
	// by수진, 2022-03-04 am10:48
	// member_personalConfirm.js 본인인증 ajax를 통하여 회원 이름과 이메일의 존재유무 확인
	@ResponseBody
	@PostMapping("personal_confirm")
	public int personal_confirm(MemberDTO mdto, Model model) {
		int cnt = mservice.personal_confirm(mdto);
		return cnt;
	}
		/* 본인인증 후 아이디 안내 -> 아이디/비밀번호 찾기에서  공통으로 쓰임 */
	// by수진, 2022-03-16 pm02:21
	// find.Id.jsp form에서 제출 성공시 findIdCheck.jsp에 아이디를 안내하는 메서드
	@PostMapping("findIdCheck")
	public String findIdCheck(MemberDTO mdto, Model model) {
		MemberDTO data = mservice.findIdCheck(mdto);
		model.addAttribute("MemberDTO", data);
		
		return "member/findIdCheck";
	}
	
	/* ----------------------- 비밀번호 찾기 ----------------------- */
	
	// by수진, 2022-03-11 pm02:18
	// findPw.jsp 메서드 추가
	@GetMapping("findPw")
	public void findPw() {
		System.out.println("findPw.jsp");
	}
	
	// by수진, 2022-03-11 pm02:40
	// findPw.jsp ajax를 통하여 입력받은 아이디의 존재유무 확인
	@ResponseBody
	@PostMapping("findPw_userId")
	public int findPw_userId(MemberDTO mdto) {
		int cnt = mservice.findPw_userId(mdto);
		return cnt;  // 입력한 아이디가 존재하면 1 존재하지않으면 0 	
	}
	
	// by수진, 2022-03-16 pm02:30
	// findPw.jsp에서 받아온 아이디를 검색하여 해당 아이디의 이메일를 마스킹처리하여 안내하는 메서드 추가
	@PostMapping("findPw2")
	public String mask_email(MemberDTO mdto, Model model) {
		String mask_email = mservice.mask_email(mdto);
		model.addAttribute("mask_email", mask_email);
		
		return "member/findPw2";
	}

	// by수진, 2022-03-16 pm02:21
	// findPw2.jsp form에서 제출 성공시 findPw3.jsp에 아이디를 안내하는 메서드
	@PostMapping("resetPw_userId")
	public String resetPw_userId(MemberDTO mdto, Model model) {
		MemberDTO data = mservice.findIdCheck(mdto);
		model.addAttribute("MemberDTO", data);
		
		return "member/findPw3";
	}

	// by수진, 2022-03-14 pm04:17
	// resetPw.js ajax를 통하여 재설정한 비밀번호를 db에 가져가 기존 비밀번호에서 업데이트 하는 메서드 추가
	@ResponseBody
	@PostMapping("resetPw")
	public int resetPw(MemberDTO mdto) {
		return mservice.resetPw(mdto);
	}

	
}
