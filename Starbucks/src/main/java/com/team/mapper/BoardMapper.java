package com.team.mapper;

import com.team.domain.BoardDTO;

public interface BoardMapper {
	// 1.글쓰기 DB 설계
	public void write(BoardDTO board);
}
