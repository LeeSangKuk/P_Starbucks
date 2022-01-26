package com.team.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	// write.jsp(글쓰기 화면) 띄우기
	@GetMapping("write")
	public void write() {
		
		System.out.println("글쓰기 화면");
	}
	
	// 글쓰기 버튼을 누르면 글 목록 화면으로 이동
	@PostMapping("write")
	public String PostWrite(BoardDTO board) {
		System.out.println("글쓰기 버튼을 눌렀습니다.");
		service.write(board);
		
		return "redirect:/board/list";
	}
	
	// list.jsp(글 목록 화면) 띄우기
	@GetMapping("list")
	public void list(Model model) {
		
		System.out.println("목록 화면");
		model.addAttribute("list", service.list());
	}
	
	// 글 목록 화면에서 제목을 누르면 detail.jsp(상세페이지) 실행
	@GetMapping("detail")
	public void detail(BoardDTO board, Model model) {
		model.addAttribute("detail",service.detail(board));
	}
	
	
}
