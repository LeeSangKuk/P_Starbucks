package com.team.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.team.domain.BoardDTO;
import com.team.domain.Criteria;
import com.team.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService{
	@Autowired
	private BoardMapper bmapper;
	
	// 1.글쓰기 구현
	public void write(BoardDTO board) {
		bmapper.write(board);
	}
	
	// 2.목록 구현
	public ArrayList<BoardDTO> list(Criteria cri){
		return bmapper.list(cri);
	}
	
	// 3.상세페이지 구현
	@Transactional
	public BoardDTO detail(BoardDTO board) {
		// 조회수 +1
		bmapper.cntupdate(board);
		
		// 상세페이지 select
		return bmapper.detail(board);
	}
	
	// 4.글 수정 구현
	public void modify(BoardDTO board) {
		bmapper.modify(board);
	}
	
	// 5.글 삭제 구현
	public void remove(BoardDTO board) {
		bmapper.remove(board);
	}
	
	// 6.게시판 페이징에 쓰일 데이터 건수
	public int getTotalCount(Criteria cri) {
		return bmapper.getTotalCount(cri);
	}
}
