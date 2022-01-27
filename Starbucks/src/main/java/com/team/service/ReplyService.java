package com.team.service;

import java.util.ArrayList;

import com.team.domain.ReplyDTO;

public interface ReplyService {
	// 1.댓글 쓰기 설계
	public int write(ReplyDTO rdto);
	
	// 2.댓글 목록 리스트 설계
	public ArrayList<ReplyDTO> list(int bno);
	
	// 3.댓글 수정 버튼을 클릭하면 수정 화면 뜨게 ~ 설계
	public ReplyDTO detail(int rno);
	
	// 4.댓글 수정 화면에서 재등록 버튼을 누르면 ~ 설계
	public int update(ReplyDTO rdto);
	
	// 5.댓글 삭제 설계
	public int remove(ReplyDTO rdto);
}
