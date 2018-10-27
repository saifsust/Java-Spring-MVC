package com.application.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.web.servlet.ModelAndView;

public interface Directory {

	public final int HOME = 1;
	public final int ABOUT = 2;
	public final int SERVICE = 3;
	public final int WORK = 4;
	public final int DEFAULT = 1;
	public final String RDIR = "redirect:/";
	public final String USR = "users/";
	public final String ADM = "admin/";
	public final String PAGE = "page";
	public final String STORE = "H://Mycompany//storage//";
	public final String STORE_PROFILE = STORE + "profile//";
	public final String STORE_PROJECT = STORE + "project//";
	public final String STORE_HOME = STORE + "home//";
	public final String _HOME = "home";
	public final String _PROFILE = "profile";
	public final String _PROJECT = "project";

	public void setDataSource(DataSource dataSource);

	public ModelAndView view(HttpServletRequest request, HttpServletResponse response);

	public String direct();

	public String back();
}
