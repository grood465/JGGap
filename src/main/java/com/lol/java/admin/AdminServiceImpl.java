package com.lol.java.admin;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("adminService")
public class AdminServiceImpl implements AdminService{

	@Autowired
	AdminDAO adminDAO;

	@Override
	public List<AdminVO> user_list(Paging_VO vo) {

		return adminDAO.user_list(vo);
	}

	@Override
	public int member_count() {
		
		return adminDAO.member_count();
	}

	@Override
	public void grant(AdminVO vo) {
		
		adminDAO.grant(vo);
	}

	@Override
	public int conversion(String user_id) {
		
		return adminDAO.conversion(user_id);
	}

	@Override
	public int report_count() {
		
		return adminDAO.report_count();
	}

	@Override
	public List<AdminVO> report_list(Paging_VO vo) {
		
		return adminDAO.report_list(vo);
	}

	@Override
	public int overlap_check(AdminVO vo) {
		
		return adminDAO.overlap_check(vo);
	}

	@Override
	public void accepted(AdminVO vo) {
		
		adminDAO.accepted(vo);
	}
	
}
