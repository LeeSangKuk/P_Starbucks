package com.team.service;

import java.util.ArrayList;

import com.team.domain.BoardDTO;
import com.team.domain.Criteria;

public interface BoardService {
	// 1.글쓰기 설계
	public void write(BoardDTO board);
	
	// 2.목록 설계
	public ArrayList<BoardDTO> list(Criteria cri);
	
	// 3.상세페이지 설계
	public BoardDTO detail(BoardDTO board);
	
	// 4.글 수정 설계
	public void modify(BoardDTO board);
	
	// 5.글 삭제 설계
	public void remove(BoardDTO board);
}
