package com.application.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.application.factorys.DaoFactory;
import com.application.factorys.ViewFactory;
import com.application.interfaces.Defualt;
import com.application.interfaces.Query;
import com.application.interfaces.View;
import com.application.model.Service;
import com.application.views.ServiceView;

@Controller("servicesController")
public class ServicesController implements Defualt {

	private final String TYPE = "SERVICE";
	private ModelAndView mnv;
	private DaoFactory daoFactory;
	private View view = ViewFactory.getView(TYPE);
	private Query serviceDao;

	@Autowired
	@Override
	public void setDataSource(DataSource dataSource) {
		this.daoFactory = new DaoFactory(dataSource);
		serviceDao = daoFactory.getDao(TYPE);

	}

	@RequestMapping(value = "/services", method = RequestMethod.GET)
	@Override
	public ModelAndView view(HttpServletRequest request, HttpServletResponse response) {
		mnv = new ModelAndView(direct());

		try {

			List<Service> services = serviceDao.getAll();

			request.setAttribute("services", view.view(services));

		} catch (Exception ex) {
			System.out.println("Services Controller Exception : " + ex.getMessage());
		}

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
		return RDIR + "services";
	}

}
