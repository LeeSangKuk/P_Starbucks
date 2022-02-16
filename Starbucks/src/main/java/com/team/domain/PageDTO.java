package com.team.domain;

public class PageDTO {
	private int startPage;
	private int endPage;
	private boolean prev;
	private boolean next;
	
	private int total; // 총 게시물 수
	
	private Criteria cri;
	/*
		private String search;
		private String keyword;
		private int pageNum;
		private int amount;
	 */
	
	// 생성자 만들기
	public PageDTO(Criteria cri, int total) {
		this.cri=cri;
		this.total=total;
		
		// 현재 페이지 번호가 필요해서 Criteria를 포함시켰음
		// (int)(Math.ceil)(현재페이지번호/10.0)*10 => ceil은 올림 함수
		// 계산된 식을 endPage에 저장(전체 건수를 고려하지 않음)
		// 첫페이지 ~ 마지막 전 페이지만 계싼
		this.endPage = (int)(Math.ceil(cri.getPageNum()/10.0))*10;
		
		// startPage는 endPage - 9
		// 10-9=1, 20-9=11...
		this.startPage = endPage-9;
		
		//-------------------------------------------
		
		// 맨 마지막 페이지는 
		// board 테이블의 전체 건수를 고려 => 총 갯수가 140개라 14페이지인 경우 등
		// 전체 건수를 고려한 endPage -> realPage
		// (int)(Math.ceil((전체 건수*1.0)/10) -> 소수점까지 계산되게 하기 위해서 1.0 지정 => 실제 페이지 번호
		int realEnd = (int)(Math.ceil((total*1.0)/cri.getAmount()));
		
		// realEnd < endPage => realEnd 값을 endPage에 저장
		if(realEnd < endPage) {
			this.endPage = realEnd;
		}
		
		this.prev = this.startPage > 1;
		this.next = this.endPage < realEnd;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public boolean isPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public Criteria getCri() {
		return cri;
	}

	public void setCri(Criteria cri) {
		this.cri = cri;
	}

	@Override
	public String toString() {
		return "PageDTO [startPage=" + startPage + ", endPage=" + endPage + ", prev=" + prev + ", next=" + next
				+ ", total=" + total + ", cri=" + cri + "]";
	}
	

	
	
	
}
