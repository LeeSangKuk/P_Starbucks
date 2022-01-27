package com.team.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.team.domain.ReplyDTO;
import com.team.service.ReplyService;

@RestController
@RequestMapping("replies")
public class ReplyController {
	// 서비스 파트 추가
	@Autowired
	private ReplyService rservice;
	
	// 댓글 쓰기를 하기 위한 RequestMapping
	
	@PostMapping(value="new", consumes="application/json", produces= {MediaType.TEXT_PLAIN_VALUE})
	public ResponseEntity<String> create(@RequestBody ReplyDTO rdto){
		System.out.println("ReplyDTO = " + rdto);
		
		
		// insert 성공시 ReplyServiceImpl.java로부터 1
		// insert 실패시 ReplyServiceImpl.java로부터 0
		// 값을 리턴 받는다
		int result = rservice.write(rdto);
		System.out.println("ReplyDTO = " + rdto);
		// insert가 정상적으로 처리되었을 때,
		// insert가 비정상적으로 처리되었을 때
		return result==1? new ResponseEntity<>("success", HttpStatus.OK)
				: new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@GetMapping(value="list/{bno}", produces= {MediaType.APPLICATION_JSON_UTF8_VALUE})
	public ResponseEntity <ArrayList <ReplyDTO>> getList(@PathVariable int bno){
		System.out.println(bno);
		return new ResponseEntity<>(rservice.list(bno), HttpStatus.OK);
	}
	
	@GetMapping(value="{rno}", produces= {MediaType.APPLICATION_JSON_UTF8_VALUE})
	public ResponseEntity <ReplyDTO> getDetail(@PathVariable int rno){
		System.out.println(rno);
		rservice.list(rno);
		return new ResponseEntity<>(rservice.detail(rno), HttpStatus.OK);
	}
	
	// 댓글 수정 버튼 누르고 재등록 버튼 눌렀을 때
	@PutMapping(value="update", consumes="application/json", produces= {MediaType.TEXT_PLAIN_VALUE})
	public ResponseEntity<String> update(@RequestBody ReplyDTO rdto){
		
		System.out.println("rdto = " + rdto);

		return rservice.update(rdto)==1? new ResponseEntity<>("success", HttpStatus.OK)
				: new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	// 댓글 삭제 버튼을 클릭하면
	@DeleteMapping(value="remove", consumes="application/json", produces= {MediaType.TEXT_PLAIN_VALUE})
	public ResponseEntity<String> remove(@RequestBody ReplyDTO rdto){

		System.out.println("rdto = " + rdto);

		return rservice.remove(rdto)==1? new ResponseEntity<>("success", HttpStatus.OK)
				: new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
