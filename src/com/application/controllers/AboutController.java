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
import com.application.model.Client;

@Controller("aboutController")
public class AboutController implements Defualt {

	private final String regExp = "";
	private ModelAndView mnv;
	private DaoFactory daoFactory;
	private Query dao;
	private final String TYPE = "CLIENT";
	private String TAG;
	private View view = ViewFactory.getView(TYPE);

	@Autowired
	@Override
	public void setDataSource(DataSource dataSource) {
		// TODO Auto-generated method stub
		this.daoFactory = new DaoFactory(dataSource);
	}

	@RequestMapping(value = "/about", method = RequestMethod.GET)
	@Override
	public ModelAndView view(HttpServletRequest request, HttpServletResponse response) {

		try {

			dao = daoFactory.getDao(TYPE);

			List<Client> clients = dao.getAllLimit();
			
			/*for(Client client:clients) {
				System.out.println(client);
			}*/

			request.setAttribute("founder", view.view(clients));

		} catch (Exception ex) {
			System.out.println("About Controller Exception : " + ex.getMessage());
		}

		mnv = new ModelAndView(direct());
		return mnv;
	}

	@Override
	public String direct() {
		// TODO Auto-generated method stub
		return USR + "about";
	}

	@Override
	public String back() {
		// TODO Auto-generated method stub
		return null;
	}

}
