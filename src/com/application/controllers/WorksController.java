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
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.application.factorys.DaoFactory;
import com.application.factorys.ViewFactory;
import com.application.interfaces.DefualtAll;
import com.application.interfaces.Query;
import com.application.interfaces.View;
import com.application.model.Project;

@Controller("worksController")
public class WorksController implements DefualtAll {

	private final String TYPE = "PROJECT";
	private String TAG;
	private ModelAndView mnv;
	private DaoFactory daoFactory;
	private View view;
	private Query dao;

	@Autowired
	@Override
	public void setDataSource(DataSource dataSource) {
		this.daoFactory = new DaoFactory(new JdbcTemplate(dataSource));
		this.dao = daoFactory.getDao(TYPE);
	}

	@RequestMapping(value = "/works", method = RequestMethod.GET)
	@Override
	public ModelAndView view(HttpServletRequest request, HttpServletResponse response) {

		try {

			List<Project> projects = dao.getAll();

			/*for (Project project : projects) {
				System.out.println(project);
			}*/

			TAG = "WORK";
			
			view = ViewFactory.getView(TAG);

			request.setAttribute("projects", view.view(projects));

		} catch (Exception ex) {
			System.out.println("Work Exception : " + ex.getMessage());
		}

		mnv = new ModelAndView(direct());
		return mnv;
	}

	@Override
	public String direct() {
		// TODO Auto-generated method stub
		return USR + "works";
	}

	@Override
	public String back() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView upload(MultipartFile mpf, Object model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView upload(HttpServletRequest request, HttpServletResponse response, MultipartFile mpf,
			Object model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView upload(Object model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView upload(HttpServletRequest request, HttpServletResponse response, Object model) {
		// TODO Auto-generated method stub
		return null;
	}

}