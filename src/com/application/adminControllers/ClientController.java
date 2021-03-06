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

import com.application.businessLogic.ImageFactory;
import com.application.factorys.DaoFactory;
import com.application.factorys.ViewFactory;
import com.application.interfaces.Defualt;
import com.application.interfaces.Methods;
import com.application.interfaces.Query;
import com.application.interfaces.View;
import com.application.model.Client;

@Controller("profileController")
public class ClientController implements Defualt, Methods<Client> {

	private final String TYPE = "CLIENT";
	private ModelAndView mnv;
	private JdbcTemplate jdbcTemplate;
	private View view = ViewFactory.getView(TYPE);
	private Query dao;
	private DaoFactory daoFactory;
	private ImageFactory imageFactory = new ImageFactory();

	@Autowired
	@Override
	public void setDataSource(DataSource dataSource) {
		daoFactory = new DaoFactory(dataSource);

	}

	@Override
	public ModelAndView view() {

		return null;
	}

	@RequestMapping(value = "/client", method = RequestMethod.GET)
	@Override
	public ModelAndView view(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		mnv = new ModelAndView(direct());
		request.setAttribute("check", 5);

		view = ViewFactory.getView(TYPE);

		request.setAttribute("profileForm", view.form());
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

	@RequestMapping(value = "/uploadClient", method = RequestMethod.POST)
	public ModelAndView upload(@RequestParam("img") MultipartFile picture, @RequestParam("logo") MultipartFile logo,
			@ModelAttribute("client") Client model, HttpServletRequest request, HttpServletResponse response) {

		try {

			String pic_path = imageFactory.move(picture, STORE_PROFILE, _PROFILE, request);

			String logo_path = imageFactory.move(logo, STORE_PROFILE, _PROJECT, request);

			model.setPicture(pic_path);
			model.setCompany_logo(logo_path);

			dao = daoFactory.getDao(TYPE);

			dao.insert(model);

			// System.out.println(model);

		} catch (Exception ex) {
			System.out.println("Client Upload Exception : " + ex.getMessage());
		}

		mnv = new ModelAndView(back());
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

	@Override
	public String direct() {
		// TODO Auto-generated method stub
		return ADM + PAGE;
	}

	@Override
	public String back() {
		// TODO Auto-generated method stub
		return RDIR + "client";
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
