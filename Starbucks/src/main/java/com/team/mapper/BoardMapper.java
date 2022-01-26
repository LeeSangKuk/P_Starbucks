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
	
	// * 글 목록에서 제목을 클릭했을 때 조회수 +1 *
	public void cntupdate(BoardDTO board);
	
	// 4.글 수정 DB 설계
	public void modify(BoardDTO board);
	
	// 5.글 삭제 DB 설계
	public void remove(BoardDTO board);
}
