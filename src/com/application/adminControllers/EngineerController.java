package com.application.adminControllers;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.application.businessLogic.ImageFactory;
import com.application.controllers.Directory;
import com.application.dao.EngineerDao;
import com.application.dao.RankDao;
import com.application.model.Engineer;

@Controller("engineerController")
public class EngineerController implements Directory {

	private ModelAndView mnv;
	private JdbcTemplate jdbcTemplate;

	@Autowired
	@Override
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@RequestMapping(value = "/engineer", method = RequestMethod.GET)
	@Override
	public ModelAndView view(HttpServletRequest request, HttpServletResponse response) {

		mnv = new ModelAndView(direct());
		RankDao rankDao = new RankDao();
		try {
			request.setAttribute("ranks", rankDao.getAll(jdbcTemplate));

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return mnv;
	}

	@RequestMapping(value = "/uploadEngineer", method = RequestMethod.POST)
	public ModelAndView store(@RequestParam("engineer_img") MultipartFile mpf,
			@ModelAttribute("engineer") Engineer engineer, HttpServletRequest httpServletRequest) {
		mnv = new ModelAndView(back());
		try {
			ImageFactory imageFactory = new ImageFactory();
			String img = imageFactory.move(mpf, STORE_PROFILE,_PROFILE, httpServletRequest);
			engineer.setPicture(img);
			System.out.println(engineer);

			EngineerDao engineerDao = new EngineerDao();
			engineerDao.insert(engineer, jdbcTemplate);
		} catch (Exception ex) {
			System.out.println("Engineer Control : " + ex.getMessage());
		}

		return mnv;
	}

	@Override
	public String direct() {
		// TODO Auto-generated method stub
		return ADM + "profile";
	}

	@Override
	public String back() {
		// TODO Auto-generated method stub
		return RDIR + "engineer";
	}

}
