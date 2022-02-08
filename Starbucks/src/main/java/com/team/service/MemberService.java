package com.team.service;

import com.team.domain.MemberDTO;

public interface MemberService {
	
	// 회원가입 하기 설계
	public void postJoin(MemberDTO mdto);
	
	// 로그인 하기 설계
	public MemberDTO postLogin(MemberDTO mdto);

}
