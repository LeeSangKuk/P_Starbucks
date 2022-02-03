package com.team.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team.domain.MemberDTO;
import com.team.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	MemberMapper mmapper;
	
	public void insert(MemberDTO mdto) {
		mmapper.insert(mdto);
	}

}
