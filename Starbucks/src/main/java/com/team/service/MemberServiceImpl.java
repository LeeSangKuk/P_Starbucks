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
	
	// 회원가입 하기 구현
	@Override
	public void postJoin(MemberDTO mdto) {
		System.out.println("서비스1");
		mmapper.postJoin(mdto);
		System.out.println("서비스2");
	}
	
	// 회원가입시 아이디 중복체크 구현
	@Override
	public int checkId(MemberDTO mdto) {
		return mmapper.checkId(mdto);
	}

	// 로그인하기 구현
	@Override
	public int postLogin(MemberDTO mdto) {
		System.out.println("service:"+mdto);
		return mmapper.postLogin(mdto);
	}

	// 로그인 하기 구현(회원정보)
	@Override
	public MemberDTO getLogin(MemberDTO mdto) {
		return mmapper.getLogin(mdto);
	}
	
	// 아이디 찾기 구현
	@Override
	public int postFindId(MemberDTO mdto) {
		return mmapper.postFindId(mdto);
	}
	
	// 아이디 찾기 (회원정보) 구현
	@Override
	public MemberDTO getFindId(MemberDTO mdto) {
		return mmapper.getFindId(mdto);
	}

	// 비밀번호 찾기 구현
	@Override
	public int postFindPw(MemberDTO mdto) {
		return mmapper.postFindPw(mdto);
	}
	
	@Override
	public MemberDTO postFindPw_data(MemberDTO mdto) {
		return mmapper.postFindPw_data(mdto);
	}

	// 비밀번호 찾기 (회원정보_이메일) 구현
	@Override
	public String getFindPw_email(MemberDTO mdto) {
		return mmapper.getFindPw_email(mdto);
	}

	// 비밀번호 찾기 (회원정보_아이디) 구현
	@Override
	public String getFindPw_id(MemberDTO mdto) {
		return mmapper.getFindPw_id(mdto);
	}

	@Override
	public void resetPw(MemberDTO mdto) {
		System.out.println("service Impl : resetPw");
		mmapper.resetPw(mdto);
	}






}
