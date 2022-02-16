package com.team.service;

import org.springframework.ui.Model;

import com.team.domain.MemberDTO;

public interface MemberService {
	
	// 회원가입 하기 설계
	public void postJoin(MemberDTO mdto);
	
	// 로그인 하기 설계
	public int postLogin(MemberDTO mdto);
	
	// 로그인 하기 설계(회원정보)
	public MemberDTO getLogin(MemberDTO mdto);

}
