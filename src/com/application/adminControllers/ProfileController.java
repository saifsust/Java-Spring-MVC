package com.application.adminControllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.application.controllers.Methods;
import com.application.interfaces.Defualt;
import com.application.model.Client;
import com.application.viewLogic.Profile;

@Controller("profileController")
public class ProfileController implements Defualt, Methods<Client> {

	private ModelAndView mnv;
	private JdbcTemplate jdbcTemplate;

	@Override
	public ModelAndView view() {

		return null;
	}

	@RequestMapping(value = "/profile", method = RequestMethod.GET)
	@Override
	public ModelAndView view(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		mnv = new ModelAndView(direct());
		request.setAttribute("check", 5);
		Profile profile = new Profile();
		request.setAttribute("profileForm", profile.viewProfile());
		return mnv;
	}

	@Override
	public ModelAndView view(ModelMap modelMap) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView upload(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return null;
	}


	@RequestMapping(value = "/clientUpload", method = RequestMethod.POST)
	public ModelAndView upload(@RequestParam("img") MultipartFile picture,@RequestParam("logo") MultipartFile logo, @ModelAttribute("client") Client model, HttpServletRequest request,
			HttpServletResponse response) {
		
		return mnv;
	}

	@Override
	public ModelAndView delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView edit(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView update(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Autowired
	@Override
	public void setDataSource(DataSource dataSource) {
		// TODO Auto-generated method stub

		jdbcTemplate = new JdbcTemplate(dataSource);

	}

	@Override
	public String direct() {
		// TODO Auto-generated method stub
		return ADM + PAGE;
	}

	@Override
	public String back() {
		// TODO Auto-generated method stub
		return RDIR + PAGE;
	}

	
	@Override
	public ModelAndView upload(Client model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView upload(MultipartFile mpf, Client model, HttpServletRequest request,
			HttpServletResponse response) {
		// TODO Auto-generated method stub
		return null;
	}

}
