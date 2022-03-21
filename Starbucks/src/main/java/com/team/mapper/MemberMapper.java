package com.team.mapper;

import com.team.domain.MemberDTO;

public interface MemberMapper {

	/* ----------------------- 회원가입 ----------------------- */
	
	// 회원가입 하기 설계
	public void postJoin(MemberDTO mdto);
	
	// 회원가입시 아이디 중복체크 설계
	public int checkId(MemberDTO mdto);
	
	/* ----------------------- 로그인 ----------------------- */
	
	// 로그인하기 설계
	public int postLogin(MemberDTO mdto);
	
	// 로그인하기 설계 (회원정보)
	public MemberDTO sessionLogin(MemberDTO mdto);
	
	/* ----------------------- 아이디 찾기 ----------------------- */
	
		// 본인 인증 설계
	public int personal_confirm(MemberDTO mdto);
	
	// 아이디 찾기 설계(회원아이디 안내)
	public MemberDTO findIdCheck(MemberDTO mdto);
	
	/* ----------------------- 비밀번호 찾기 ----------------------- */
	
	// 아이디 존재 유무 확인 설계
	public int findPw_userId(MemberDTO mdto);
	
	// 이메일 마스킹 처리 설계
	public String mask_email(MemberDTO mdto);

	// 비밀번호 재설정 설계
	public int resetPw(MemberDTO mdto);
}
