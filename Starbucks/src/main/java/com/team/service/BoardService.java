package com.team.service;

import java.util.ArrayList;

import com.team.domain.BoardDTO;

public interface BoardService {
	// 1.글쓰기 설계
	public void write(BoardDTO board);
	
	// 2.목록 설계
	public ArrayList<BoardDTO> list();
	
	// 3.상세페이지 설계
	public BoardDTO detail(BoardDTO board);
}