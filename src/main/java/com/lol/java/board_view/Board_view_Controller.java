package com.lol.java.board_view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

// 구인게시판(작성, 상세) 페이지
@Controller
@RequestMapping("/board_view")
public class Board_view_Controller {
 
	@Autowired
	private Board_view_Service board_view_Service;
	

	@RequestMapping("/{path}.do")
	public String viewPage(@PathVariable String path) {
		return "board_view/"+path;
	}
	
}