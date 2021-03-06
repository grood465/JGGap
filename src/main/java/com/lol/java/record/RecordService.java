package com.lol.java.record;

import java.util.HashMap;
import java.util.List;

public interface RecordService {
	
	// 전적 회원,롤 정보 가져오기
	RecordVO record_user(RecordVO recordVO);
	
	RecordVO record_lol_info(RecordVO recordVO);
	
	// 롤 전적 가져오기
	List<RecordVO> record_score(RecordVO recordVO);
	
	// 전적 더보기 버튼
	List<RecordVO> record_more(HashMap<String, Object> record);

	// 시각화를 위한 데이터 가져오기
	// 20판 전체승률
	List<RecordVO> record_chart(String summoner_id);
	
	// 20판 챔피언별승률
	List<RecordVO> record_champion_rate(String summoner_id);
	
	// 20판 라인별승률
	List<RecordVO> record_lane_rate(String summoner_id);

	


}
