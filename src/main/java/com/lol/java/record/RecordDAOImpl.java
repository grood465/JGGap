package com.lol.java.record;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("recordDAO")
public class RecordDAOImpl implements RecordDAO{

	@Autowired
	private SqlSessionTemplate mybatis;

	// 전적 회원,롤 정보 가져오기
	@Override
	public RecordVO record_user(RecordVO recordVO) {
		return mybatis.selectOne("RecordDAO.record_user",recordVO);
	}
	
	@Override
	public RecordVO record_lol_info(RecordVO recordVO) {
		return mybatis.selectOne("RecordDAO.record_lol_info", recordVO);
	}
	
	// 롤 전적 가져오기
	@Override
	public List<RecordVO> record_score(RecordVO recordVO) {
		return mybatis.selectList("RecordDAO.record_score",recordVO);
	}
	
	// 전적 더보기 버튼
	@Override
	public List<RecordVO> record_more(HashMap<String, Object> record) {
		return mybatis.selectList("RecordDAO.record_more", record);
	}

	// 시각화를 위한 데이터 가져오기
	// 20판 전체승률
	@Override
	public List<RecordVO> record_chart(String summoner_id) {
		return mybatis.selectList("RecordDAO.record_chart", summoner_id);
	}

	// 20판 챔피언별승률
	@Override
	public List<RecordVO> record_champion_rate(String summoner_id) {
		return mybatis.selectList("RecordDAO.record_champion_rate", summoner_id);
	}

	// 20판 라인별승률
	@Override
	public List<RecordVO> record_lane_rate(String summoner_id) {
		return mybatis.selectList("RecordDAO.record_lane_rate", summoner_id);
	}
	
}
