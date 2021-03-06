package com.lol.java.user;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("userDAO")
public class UserDAOImpl implements UserDAO{

	@Autowired
	private SqlSessionTemplate mybatis;

	@Override
	public int sign_up(UserVO vo) {

		return mybatis.insert("userMapper.sign_up",vo);
	}

	@Override
	public UserVO idCheck_Login(UserVO vo) {
		
		return mybatis.selectOne("userMapper.idCheck_Login",vo);
	}
	
	@Override
	public String idCheck(String user_id) {

		return mybatis.selectOne("userMapper.userIdCheck",user_id);
	}

	@Override
	public String tier_info(int user_no) {
		
		return mybatis.selectOne("userMapper.tier_info", user_no);
	}

	@Override
	public void ban(UserVO vo) {
		
		mybatis.update("userMapper.ban", vo);
	}

	@Override
	public String user_id_check(UserVO vo) {
		
		return mybatis.selectOne("userMapper.user_id_check",vo);
	}

	@Override
	public String user_pwd_check(UserVO vo) {
		
		return mybatis.selectOne("userMapper.user_pwd_check",vo);
	}
}


//	@Override
//	public String summoner_idCheck(String summoner_id) {
//		
//		return mybatis.selectOne("userMapper.summonerIdCheck",summoner_id);
//	}