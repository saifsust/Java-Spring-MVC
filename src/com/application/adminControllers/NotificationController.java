package com.application.adminControllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.application.controllers.Directory;

@Controller("notificationController")
public class NotificationController implements Directory {

	private ModelAndView mnv;

	@RequestMapping(value = "/notification", method = RequestMethod.GET)
	@Override
	public ModelAndView view(HttpServletRequest request,HttpServletResponse response) {
		mnv = new ModelAndView(direct());
		return mnv;
	}

	@Override
	public String direct() {
		return ADM + "notifications";
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
