package com.team.mapper;

import java.util.ArrayList;

import com.team.domain.BoardDTO;
import com.team.domain.Criteria;

public interface BoardMapper {
	// 1.글쓰기 DB 설계
	public void write(BoardDTO board);
	public void insertSelectKey(BoardDTO board);
	
	// 2.목록 DB 설계
	public ArrayList<BoardDTO> list(Criteria cri);
		
	// 3.상세페이지 DB 설계
	public BoardDTO detail(BoardDTO board);
	
	// * 글 목록에서 제목을 클릭했을 때 조회수 +1 *
	public void cntupdate(BoardDTO board);
	
	// 4.글 수정 DB 설계
	public void modify(BoardDTO board);
	
	// 5.글 삭제 DB 설계
	public void remove(BoardDTO board);
	
	// 6. 페이징에 쓰일 전체 건수
	public int getTotalCount(Criteria cri);
}
