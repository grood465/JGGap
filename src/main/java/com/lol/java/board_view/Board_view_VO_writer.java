package com.lol.java.board_view;

import lombok.Data;

@Data
public class Board_view_VO_writer {

	/* User_info */
	private int user_no;
	private String summoner_id;
	private float honor_rate;
	private int site_level;
	private int ban;

	/* Lol_info */
	private String solo_tier;
	private String solo_tier_grade;
	private String free_tier;
	private String free_tier_grade;
}
