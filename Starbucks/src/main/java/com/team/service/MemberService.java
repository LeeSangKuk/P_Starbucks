package com.team.service;

import org.springframework.ui.Model;

import com.team.domain.MemberDTO;

public interface MemberService {
	
	// 회원가입 하기 설계
	public void postJoin(MemberDTO mdto);
	
	// 회원가입시 아이디 중복체크
	public int checkId(MemberDTO mdto);
	
	// 로그인 하기 설계
	public int postLogin(MemberDTO mdto);
	
	// 로그인 하기 설계(회원정보)
	public MemberDTO getLogin(MemberDTO mdto);

	// 아이디찾기 설계
	public int postFindId(MemberDTO mdto);
	
	// 아이디찾기 설계(회원정보)
	public MemberDTO getFindId(MemberDTO mdto);
	
	// 비밀번호찾기 설계
	public int postFindPw(MemberDTO mdto);
	
	// 비밀번호찾기 설계(회원정보)
	public MemberDTO getFindPw(MemberDTO mdto);
}
