package com.team.mapper;

import java.util.ArrayList;

import com.team.domain.BoardDTO;

public interface BoardMapper {
	// 1.글쓰기 DB 설계
	public void write(BoardDTO board);
	
	// 2.목록 DB 설계
	public ArrayList<BoardDTO> list();
	
	// 3.상세페이지 DB 설계
	public BoardDTO detail(BoardDTO board);
}
