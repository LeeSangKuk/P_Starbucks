package com.team.service;

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
}
