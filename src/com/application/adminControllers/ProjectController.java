package com.application.adminControllers;

import java.util.List;

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
import com.application.model.Project;
import com.application.views.ProjectView;

@Controller("projectController")
public class ProjectController implements Defualt, Methods<Project> {

	private final String TYPE = "PROJECT";
	private DaoFactory daoFactory;
	private ModelAndView mnv;
	private View view = ViewFactory.getView(TYPE);

	private Query projectDao;

	@Autowired
	@Override
	public void setDataSource(DataSource dataSource) {
		daoFactory = new DaoFactory(new JdbcTemplate(dataSource));
		projectDao = daoFactory.getDao(TYPE);
	}

	@RequestMapping(value = "/project", method = RequestMethod.GET)
	@Override
	public ModelAndView view(HttpServletRequest request, HttpServletResponse response) {
		mnv = new ModelAndView(direct());

		request.setAttribute("check", 3);
		System.out.println("Hello");
		try {

			List<Project> projects = projectDao.getAll();

			System.out.println(projects);

			request.setAttribute("projects", view.view_table(projects));

		} catch (Exception ex) {
			System.out.println(ex.getMessage());

		}

		return mnv;
	}

	@Override
	public String direct() {
		return ADM + PAGE;
	}

	@Override
	public String back() {
		// TODO Auto-generated method stub
		return RDIR + "project";
	}

	@Override
	public ModelAndView view() {
		return null;
	}

	@Override
	public ModelAndView view(ModelMap modelMap) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView upload(Project model) {
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping(value = "/uploadProject", method = RequestMethod.POST)
	@Override
	public ModelAndView upload(@RequestParam("img") MultipartFile mpf, @ModelAttribute("project") Project model,
			HttpServletRequest request, HttpServletResponse response) {
		mnv = new ModelAndView(back());

		ImageFactory imageFactory = new ImageFactory();

		String path = imageFactory.move(mpf, STORE_PROJECT, _PROJECT, request);

		System.out.println(path);

		model.setProject_img(path);
		System.out.println(model);

		try {

			projectDao.insert(model);

		} catch (Exception ex) {
			System.out.println("Upload Project : " + ex.getMessage());
		}

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

	@RequestMapping(value = "/projectForm", method = RequestMethod.GET)
	@Override
	public ModelAndView upload(HttpServletRequest request, HttpServletResponse response) {
		mnv = new ModelAndView(direct());
		request.setAttribute("check", 4);
		request.setAttribute("project_form", view.form());
		return mnv;
	}

}
