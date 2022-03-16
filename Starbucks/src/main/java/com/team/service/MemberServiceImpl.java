package com.team.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.team.domain.MemberDTO;
import com.team.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	MemberMapper mmapper;
	
	/* ----------------------- 회원가입 ----------------------- */
	
	// 회원가입 하기 구현
	@Override
	public void postJoin(MemberDTO mdto) {
		mmapper.postJoin(mdto);
	}
	
	// 회원가입시 아이디 중복체크 구현
	@Override
	public int checkId(MemberDTO mdto) {
		return mmapper.checkId(mdto);
	}

	/* ----------------------- 로그인 ----------------------- */
	
	// 로그인하기 구현
	@Override
	public int postLogin(MemberDTO mdto) {
		System.out.println("service:"+mdto);
		return mmapper.postLogin(mdto);
	}

	// 로그인 하기 구현(회원정보)
	@Override
	public MemberDTO sessionLogin(MemberDTO mdto) {
		return mmapper.sessionLogin(mdto);
	}
	
	/* ----------------------- 아이디 찾기 ----------------------- */
	
		// 본인 인증 구현
	@Override
	public int personal_confirm(MemberDTO mdto) {
		return mmapper.personal_confirm(mdto);
	}
	
	// 아이디 찾기 구현(회원아이디 안내)
	@Override
	public MemberDTO findIdCheck(MemberDTO mdto) {
		return mmapper.findIdCheck(mdto);
	}

	/* ----------------------- 비밀번호 찾기 ----------------------- */
	
	// 아이디 존재 유무 확인 구현
	@Override
	public int findPw_userId(MemberDTO mdto) {
		return mmapper.findPw_userId(mdto);
	}

	// 이메일 마스킹 처리 구현
	@Override
	public String mask_email(MemberDTO mdto) {
		return mmapper.mask_email(mdto);
	}

	// 비밀번호 재설정 구현
	@Override
	public int resetPw(MemberDTO mdto) {
		return mmapper.resetPw(mdto);
	}






}
