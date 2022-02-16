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

	// 로그인하기 구현
	@Override
	public int postLogin(MemberDTO mdto) {
		System.out.println("service:"+mdto);
		return mmapper.postLogin(mdto);
	}

	// 로그인 하기 구현(회원정보)
	@Override
	public MemberDTO getLogin(MemberDTO mdto) {
		// TODO Auto-generated method stub
		return mmapper.getLogin(mdto);
	}


}
