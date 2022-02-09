package com.team.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.team.domain.AttachFileDTO;
import com.team.domain.BoardDTO;
import com.team.domain.Criteria;
import com.team.mapper.AttachMapper;
import com.team.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService{
	@Autowired
	private BoardMapper bmapper;
	
	@Autowired 
	private AttachMapper amapper; // 파일 첨부
	
	// 1.글쓰기 구현
	@Transactional
	public void write(BoardDTO board) {
		
		if(board.getAttachList() != null) {
			// 제목과 내용을 board 테이블에 insert
			bmapper.insertSelectKey(board);
			
			// 파일명,파일경로,파일타입, uuid 값을 attach 테이블에 insert
			// BoardDTO에 있는 attachList를 가져와서 반복문으로 실행하여 attach 변수에 저장
			board.getAttachList().forEach(attach->{
				attach.setBno(board.getBno());
				System.out.println("attach 테이블의 bno = " + board.getBno());
				amapper.insert(attach);
			});
		}else {
			bmapper.write(board);
		}

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
	
	// 7. 게시판 상세페이지에 업로드 된 이미지를 화면에 보여주기 위한 데이터 list
	public ArrayList<AttachFileDTO> fileList(int bno){
		return amapper.fileList(bno);
	}
}
