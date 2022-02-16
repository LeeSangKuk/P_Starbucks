package com.team.domain;

public class Criteria {
	private String search; // 검색 타입
	private String keyword; // 검색어
	private int pageNum; // 페이지 번호
	private int amount; // 한 페이지 게시물 수 
	
	// 생성자
	Criteria(){
		this(1,10);
	}
	
	Criteria(int pageNum, int amount){
		this.pageNum=pageNum;
		this.amount=amount;
	}
	
	
	
	public String getSearch() {
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "Criteria [search=" + search + ", keyword=" + keyword + ", pageNum=" + pageNum + ", amount=" + amount
				+ "]";
	}
	
	
}
