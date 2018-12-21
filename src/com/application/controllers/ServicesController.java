package com.application.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.application.interfaces.Defualt;

@Controller("servicesController")
public class ServicesController implements Defualt {
	private ModelAndView mnv;

	@RequestMapping(value = "/services", method = RequestMethod.GET)
	@Override
	public ModelAndView view(HttpServletRequest request,HttpServletResponse response) {
		mnv = new ModelAndView(direct());
		return mnv;
	}

	@Override
	public String direct() {
		// TODO Auto-generated method stub
		return USR + "services";
	}

	@Override
	public String back() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDataSource(DataSource dataSource) {
		// TODO Auto-generated method stub
		
	}



}
