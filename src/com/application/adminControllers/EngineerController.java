package com.application.adminControllers;

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
import com.application.factorys.DaoFactory;
import com.application.interfaces.Defualt;
import com.application.interfaces.Query;
import com.application.model.Engineer;

@Controller("engineerController")
public class EngineerController implements Defualt {

	private ModelAndView mnv;

	private DaoFactory daoFactory;

	@Autowired
	@Override
	public void setDataSource(DataSource dataSource) {
		this.daoFactory = new DaoFactory(new JdbcTemplate(dataSource));
	}

	@RequestMapping(value = "/engineer", method = RequestMethod.GET)
	@Override
	public ModelAndView view(HttpServletRequest request, HttpServletResponse response) {

		mnv = new ModelAndView(direct());

		try {

			Query rankDao = daoFactory.getDao("RANK");

			request.setAttribute("ranks", rankDao.getAll());

		} catch (Exception e) {
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
			String img = imageFactory.move(mpf, STORE_PROFILE, _PROFILE, httpServletRequest);
			
			engineer.setPicture(img);
			
			System.out.println(engineer);

			Query engineerDao = daoFactory.getDao("engineer");
			engineerDao.insert(engineer);
			
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
