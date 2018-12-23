package com.application.controllers;
/**
*
*@NAME SAIFUL ISLAM
*@BATCH SUST CSE 2013-14
*@Email : saiful.sust.cse@gmail.com
*@Facebok : https://www.facebook.com/SaifulIslamLitonSust
*/

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
import com.application.migrations.InstallMigrations;
import com.application.model.Project;
import com.application.model.Service;

@Controller("userHomeController")
public class UserHomeController implements Defualt {

	private final String TYPE = "HOME";
	private String TAG;
	private ModelAndView mnv;
	private DaoFactory daoFactory;
	private View view;
	private Query dao;
	private JdbcTemplate jdbcTemplate;

	@Autowired
	@Override
	public void setDataSource(DataSource dataSource) {

		this.jdbcTemplate = new JdbcTemplate(dataSource);
		daoFactory = new DaoFactory(jdbcTemplate);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)

	@Override
	public ModelAndView view(HttpServletRequest request, HttpServletResponse response) {

		try {

			System.out.println("Hello User Home");

			dao = daoFactory.getDao(TYPE);

			view = ViewFactory.getView(TYPE);

			// System.out.println(homeDao.getRowById(1, jdbcTemplate).get("header_img"));
			request.setAttribute("header", view.view(dao.getRowById(HOME)));

			TAG = "SERVICE";

			dao = daoFactory.getDao(TAG);
			view = ViewFactory.getView(TAG);

			List<Service> services = dao.getAllLimit();

			request.setAttribute("services", view.view(services));

			TAG = "PROJECT";

			dao = daoFactory.getDao(TAG);
			view = ViewFactory.getView(TAG);

			List<Project> projects = dao.getAllLimit();

			request.setAttribute("latestWorks", view.view(projects));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("User Home Exception : " + e.getMessage());
		}
		mnv = new ModelAndView(direct());
		return mnv;
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

	@RequestMapping(value = "/install", method = RequestMethod.GET)
	public ModelAndView install() {

		mnv = new ModelAndView(back());

		try {
			new InstallMigrations(jdbcTemplate);

			System.out.println("Install Complement ! '.' ");

		} catch (Exception ex) {

			System.out.println("Installation Exception : " + ex.getMessage());
		}
		return mnv;
	}

}
