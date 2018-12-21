package com.application.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.application.dao.HomeDao;
import com.application.dao.PageDao;
import com.application.interfaces.Defualt;
import com.application.interfaces.Query;
import com.application.migrations.InstallMigrations;
import com.application.viewLogic.HomeView;

@Controller("userHomeController")
public class UserHomeController implements Defualt {
	private ModelAndView mnv;
	private JdbcTemplate jdbcTemplate;

	@Autowired
	@Override
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)

	@Override
	public ModelAndView view(HttpServletRequest request, HttpServletResponse response) {

		installDatabase();

		try {

			HomeDao homeDao = new HomeDao();
			// System.out.println(homeDao.getRowById(1, jdbcTemplate).get("header_img"));
			request.setAttribute("header", HomeView.view(homeDao.getRowById(1, jdbcTemplate)));
			// PageDao pageDao = new PageDao();

			// System.out.println(pageDao.getRowById(1,
			// jdbcTemplate).get("selected_page_id"));

			// request.setAttribute("link",
			// "http://localhost:8080/Saiful_IT_SOLUTION//storage//home//2f84fbe_header-bg.jpg");

			// System.out.println(gDao.getAll("litons_group", jdbcTemplate));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mnv = new ModelAndView(direct());
		return mnv;
	}

	// migrate all database manupulations
	public void installDatabase() {
		InstallMigrations migrate = new InstallMigrations(jdbcTemplate);
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView home(HttpServletRequest request, HttpServletResponse response) {
		mnv = new ModelAndView(back());
		return mnv;
	}

	@Override
	public String direct() {
		// TODO Auto-generated method stub
		return USR + "index";
	}

	@Override
	public String back() {
		// TODO Auto-generated method stub
		return RDIR;
	}

}
