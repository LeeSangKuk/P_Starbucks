package com.team.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team.domain.MemberDTO;
import com.team.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	MemberMapper mmapper;
	
	// 회원가입 하기 구현
	@Override
	public void postJoin(MemberDTO mdto) {
		mmapper.postJoin(mdto);
	}

	// 로그인하기 구현
	@Override
	public MemberDTO postLogin(MemberDTO mdto) {
		return mmapper.postLogin(mdto);
	}

}
