package com.application.controllers;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.application.dao.EngineerDao;
import com.application.dao.GroupDao;
import com.application.dao.ProjectToolDao;
import com.application.dao.RankDao;
import com.application.migrations.InstallMigrations;
import com.application.model.Engineer;
import com.application.model.Group;
import com.application.model.Rank;
import com.application.model.ProjectPage;
import com.application.model.ProjectTool;

@Controller("userHomeController")
public class UserHomeController implements Directory {
	private ModelAndView mnv;
	private JdbcTemplate jdbcTemplate;

	@Autowired
	@Override
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)

	@Override
	public ModelAndView view(HttpServletRequest request,HttpServletResponse response) {

		installDatabase();
	
		try {

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
	public ModelAndView home() {
		mnv = new ModelAndView(direct());
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
		return USR + "index";
	}

}
