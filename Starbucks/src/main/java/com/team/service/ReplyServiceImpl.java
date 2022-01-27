package com.team.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team.domain.ReplyDTO;
import com.team.mapper.ReplyMapper;

@Service
public class ReplyServiceImpl implements ReplyService{
	@Autowired
	private ReplyMapper rmapper;
	
	// 1.댓글 쓰기 설계된 것을 구현
	public int write(ReplyDTO rdto) {
		return rmapper.write(rdto);
	}
	
	// 2.댓글 목록 리스트 설계된 것을 구현
	public ArrayList<ReplyDTO> list(int bno) {
		return rmapper.list(bno);
	}
	
	// 3.댓글 수정 버튼을 클릭하면 수정 화면 뜨게 ~ 구현
	public ReplyDTO detail(int rno) {
		return rmapper.detail(rno);
	}
	
	// 4.댓글 수정 화면에서 재등록 버튼을 누르면 ~ 구현
	public int update(ReplyDTO rdto) {
		return rmapper.update(rdto);
	}
	
	// 5.댓글 삭제 구현
	public int remove(ReplyDTO rdto) {
		return rmapper.remove(rdto);
	}
}
