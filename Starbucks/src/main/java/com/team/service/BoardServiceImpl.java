package com.team.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team.domain.BoardDTO;
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
	public ArrayList<BoardDTO> list(){
		return bmapper.list();
	}
	
	// 3.상세페이지 구현
	public BoardDTO detail(BoardDTO board) {
		return bmapper.detail(board);
	}
}
