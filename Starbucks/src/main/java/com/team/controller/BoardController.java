package com.team.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.team.domain.AttachFileDTO;
import com.team.domain.BoardDTO;
import com.team.domain.Criteria;
import com.team.domain.PageDTO;
import com.team.service.BoardService;

@Controller
@RequestMapping("board")
public class BoardController {
	@Autowired
	private BoardService service;
	// BoardService service = new BoardService;
	
	// write.jsp(글쓰기 화면) 띄우기
	@GetMapping("write")
	public void write() {
		// 콘솔 테스트
		System.out.println("글쓰기 화면");
		
	}
	
	
	// 글쓰기 버튼을 누르면 글 목록 화면으로 이동
	@PostMapping("write")
	public String PostWrite(BoardDTO board) {

		service.write(board);
		
		// 콘솔 테스트
		System.out.println("글쓰기 버튼을 눌렀습니다.");
		
		return "redirect:/board/list";
	}
	
	/* list.jsp(글 목록 화면) 띄우기 
	 * 
		1. cri - 페이징 처리 변수(파라미터)
		2. model list - ${list}
		3. int total - 총 게시글 수
		4. pageMaker - 페이징처리를 위한 메서드
	*/
	
	@GetMapping("list")
	public void list(Criteria cri, Model model) {
		
		model.addAttribute("list", service.list(cri));
		
		int total = service.getTotalCount(cri);
		System.out.println("total = " + total);
		model.addAttribute("pageMaker", new PageDTO(cri, total));
		
		// 콘솔 테스트
		System.out.println("목록 화면");
	}
	
	// 글 목록 화면에서 제목을 누르면 detail.jsp(상세페이지) 실행
	@GetMapping("detail")
	public void detail(BoardDTO board, Model model) {
		model.addAttribute("detail",service.detail(board));
	}
	
	//---------------------------------------------
	// * 파일 업로드 관련 *
	// 게시판 상세페이지에서 이미지를 클릭하기 위한 select된 결과를 javascript로...
	@GetMapping(value="fileList/{bno}", produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<ArrayList<AttachFileDTO>> fileList(@PathVariable int bno){
		// 통신 상태가 정상적이면 select된 결과를 보내라
		System.out.println("fileList");
		return new ResponseEntity<>(service.fileList(bno), HttpStatus.OK);
	}
	//---------------------------------------------
	
	// detail.jsp(상세페이지)에서 글 수정 버튼을 누르면 수정 화면으로 이동
	@GetMapping("modify")
	public void modify(BoardDTO board, Model model) {
		model.addAttribute("detail", service.detail(board));
		
		// 콘솔 테스트
		System.out.println("글 수정 화면으로 이동");
	}
	
	// modify.jsp(글 수정 화면)에서 수정 버튼을 누르면 수정이 완료되고,해당 상세페이지 보여주기
	@PostMapping("modify")
	public String PostModify(BoardDTO board, RedirectAttributes rttr) {
		service.modify(board);
		
		// 수정 후 내가 수정한 글 상세페이지을 보여주기 위해서
		rttr.addAttribute("bno", board.getBno());
		
		
		// 콘솔 테스트
		System.out.println("수정 완료");
		
		return "redirect:/board/detail";
	}
	
	// 글 삭제버튼을 클릭하면 글이 삭제되고,글 목록 보여주기
	@GetMapping("remove")
	public String remove(BoardDTO board) {
		System.out.println("글 삭제 버튼을 눌렀습니다.");
		
		service.remove(board);
		
		return "redirect:/board/list";
	}
	

	
	
}
