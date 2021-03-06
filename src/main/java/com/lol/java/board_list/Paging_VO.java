package com.lol.java.board_list;

import java.util.List;

import lombok.Data;

@Data
public class Paging_VO {
		
	// 현재페이지, 시작페이지, 끝페이지, 게시글 총 갯수, 페이지당 글 갯수, 마지막페이지, SQL쿼리에 쓸 start, end
	private int nowPage, startPage, endPage, total, cntPerPage, lastPage, start, end;
	private int cntPage = 5;
	private String searchCondition;
	private String searchKeyword;
	
	private String[] search_check_map;
	private String[] search_check_mode;
		
	public Paging_VO() {
	}
	
	public Paging_VO(String[] search_check_map, String[] search_check_mode, String searchCondition, String searchKeyword) {
		setSearch_check_map(search_check_map);
		setSearch_check_mode(search_check_mode);
		setSearchCondition(searchCondition);
		setSearchKeyword(searchKeyword);
	}
	
	
	public Paging_VO(int total, int nowPage, int cntPerPage, String searchCondition, String searchKeyword, String[] search_check_map, String[] search_check_mode) {
		setNowPage(nowPage);
		setCntPerPage(cntPerPage);
		setTotal(total);
		setSearchCondition(searchCondition);
		setSearchKeyword(searchKeyword);
		setSearch_check_map(search_check_map);
		setSearch_check_mode(search_check_mode);
		calcLastPage(getTotal(), getCntPerPage());
		calcStartEndPage(getNowPage(), cntPage);
		calcStartEnd(getNowPage(), getCntPerPage());
	}
	
	public Paging_VO(int total, int nowPage, int cntPerPage) {
		setNowPage(nowPage);
		setCntPerPage(cntPerPage);
		setTotal(total);
		calcLastPage(getTotal(), getCntPerPage());
		calcStartEndPage(getNowPage(), cntPage);
		calcStartEnd(getNowPage(), getCntPerPage());
	}
	
	// 제일 마지막 페이지 계산
	public void calcLastPage(int total, int cntPerPage) {
		setLastPage((int) Math.ceil((double)total / (double)cntPerPage));
	}
	
	// 시작, 끝 페이지 계산
	public void calcStartEndPage(int nowPage, int cntPage) {
		setEndPage(((int)Math.ceil((double)nowPage / (double)cntPage)) * cntPage);
		if (getLastPage() < getEndPage()) {
			setEndPage(getLastPage());
		}
		setStartPage(getEndPage() - cntPage + 1);
		if (getStartPage() < 1) {
			setStartPage(1);
		}
	}
	
	// DB 쿼리에서 사용할 start, end값 계산
	public void calcStartEnd(int nowPage, int cntPerPage) {
		setEnd(nowPage * cntPerPage);
		setStart(getEnd() - cntPerPage + 1);
	}

	@Override
	public String toString() {
		return "PagingVO [nowPage=" + nowPage + ", startPage=" + startPage + ", endPage=" + endPage + ", total=" + total
				+ ", cntPerPage=" + cntPerPage + ", lastPage=" + lastPage + ", start=" + start + ", end=" + end
				+ ", cntPage=" + cntPage + ", searchCondition=" + searchCondition + ", searchKeyword=" + searchKeyword + ", search_check_map=" + search_check_map + ", search_check_mode=" + search_check_mode + "]";
	}
}

