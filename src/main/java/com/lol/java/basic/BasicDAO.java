package com.lol.java.basic;

import java.util.List;

public interface BasicDAO {

	// 포인트 지급 시스템
	// 채택 시간 가져오기
	List<BasicVO> choice_time();
	// 전적에서 필요한 정보 가져오기
	List<BasicVO> record_time(BasicVO basicVO);
	// 채택 목록 가져오기
	List<BasicVO> taking_choice(BasicVO basicVO);
	// 포인트 주기
	void giving_point(BasicVO basicVO);
	// 헤더 포인트
	BasicVO header_point(Object user_no);
	// 헤더 친구
	List<BasicVO> getfriends(Object user_no);
	// 헤더 차단
	List<BasicVO> getbanned(Object user_no);
	// 레벨 포인트
	String level_point(Object user_no);
}
