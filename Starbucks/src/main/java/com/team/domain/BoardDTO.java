package com.team.domain;

import java.util.ArrayList;

public class BoardDTO {
	// 게시글 번호
	private int bno;
	// 게시글 제목
	private String title;
	// 게시글 내용
	private String content;
	// 게시글 작성자
	private String writer;
	// 게시글 작성일자
	private String regdate;
	// 게시글 조회수
	private int cnt;
	
	// BoardDTO에 AttachFileDTO 포함시키기
	private ArrayList<AttachFileDTO> attachList;

	// getter/setter
	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public ArrayList<AttachFileDTO> getAttachList() {
		return attachList;
	}

	public void setAttachList(ArrayList<AttachFileDTO> attachList) {
		this.attachList = attachList;
	}

	@Override
	public String toString() {
		return "BoardDTO [bno=" + bno + ", title=" + title + ", content=" + content + ", writer=" + writer
				+ ", regdate=" + regdate + ", cnt=" + cnt + ", attachList=" + attachList + "]";
	}
	
	

	
	
	
	
	
}
