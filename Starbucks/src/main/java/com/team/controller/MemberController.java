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

	// by수진, 2022-03-04 am09:14
	// findId.jsp 메서드 추가
	@GetMapping("findId")
	public void findId() {
		System.out.println("findId.jsp");
	}
	
	// by수진, 2022-03-04 am10:48
	// findMember.js ajax를 통하여 회원 이름과 이메일의 존재유무 확인
	@ResponseBody
	@PostMapping("postFindId")
	public int personal_confirm(MemberDTO mdto, Model model) {
		int cnt = mservice.postFindId(mdto);
		return cnt;
	}
	
	// by수진, 2022-03-16 pm02:21
	// find.Id.jsp form에서 제출 성공시 findIdCheck.jsp에 아이디를 안내하는 메서드
	@PostMapping("findIdCheck")
	public String inform_id(MemberDTO mdto, Model model) {
		MemberDTO userId = mservice.getFindId(mdto);
		model.addAttribute("MemberDTO", userId);
		System.out.println(userId);
		
		return "member/findIdCheck";
	}
	
	// by수진, 2022-03-11 pm02:18
	// findPw.jsp 메서드 추가
	@GetMapping("findPw")
	public void findPw() {
		System.out.println("findPw.jsp");
	}
	
	// by수진, 2022-03-11 pm02:40
	// findPw.js ajax를 통하여 회원의 아이디를 확인하고 이메일을 가져오는 메서드 추가
	@ResponseBody
	@PostMapping("postFindPw")
	public int postFindPw(MemberDTO mdto) {
		int cnt = mservice.postFindPw(mdto); // 입력한 아이디가 존재하면 1 존재하지않으면 0 	
		return cnt;
	}
	
	
	// by수진, 2022-03-11 pm03:28
	// findPw2.jsp 메서드 추가
	@GetMapping("findPw2")
	public void findPw2() {
		System.out.println("findPw2.jsp");
	}
	
	// by수진, 2022-03-16 pm02:30
	// findPw.jsp에서 받아온 아이디를 db에서 검색하여 해당되는 이메일 마스킹처리하여 안내하는 메서드 추가
	@PostMapping("findPw2")
	public String postFindPw2(MemberDTO mdto, Model model) {
		String mask_email = mservice.getFindPw_email(mdto);
		model.addAttribute("mask_email", mask_email);
		
		return "member/findPw2";
	}
	
	// by수진, 2022-03-14 am10:10
	// findPw3.jsp 메서드 추가
	@GetMapping("findPw3")
	public void findPw3() {
		System.out.println("findPw3.jsp");
	}	
	
	// by수진, 2022-03-16 pm02:21
	// findId.jsp form에서 제출 성공시 findIdCheck.jsp에 아이디를 안내하는 메서드
	@PostMapping("findPwCheck")
	public String inform_pw(MemberDTO mdto, Model model) {
		MemberDTO userId = mservice.getFindId(mdto);
		model.addAttribute("MemberDTO", userId);
		System.out.println(userId);
		
		return "member/findPw3";
	}

	// by수진, 2022-03-14 pm04:17
	// findMember.js ajax를 통하여 재설정한 비밀번호를 확인하고 DB에서 비밀번호 업데이트를 하는 메서드 추가
	@ResponseBody
	@PostMapping("resetPw")
	public int resetPw(MemberDTO mdto) {
		System.out.println("춍춍 가지고가쟈"+mdto);
		return mservice.resetPw(mdto);
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
	
	
	
	
	
	//2022-02-17 am 11:58 깃허브 테스트 by수진
	
}
