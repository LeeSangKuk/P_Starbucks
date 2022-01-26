package com.team.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.team.domain.BoardDTO;
import com.team.service.BoardService;

@Controller
@RequestMapping("board")
public class BoardController {
	@Autowired
	private BoardService service;
	
	
	
	@GetMapping("write")
	public void write() {
		System.out.println("글쓰기 화면");
	}
	
	@PostMapping("write")
	public void PostWrite(BoardDTO board) {
		System.out.println("글쓰기 버튼을 눌렀습니다.");
		service.write(board);
	}
}
