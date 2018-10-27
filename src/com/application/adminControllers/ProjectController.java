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
import com.application.controllers.Directory;
import com.application.controllers.Methods;
import com.application.dao.ProjectDao;
import com.application.model.Project;
import com.application.viewLogic.ProjectView;

@Controller("projectController")
public class ProjectController implements Directory, Methods<Project> {

	private JdbcTemplate jdbcTemplate;
	private ModelAndView mnv;

	@Autowired
	@Override
	public void setDataSource(DataSource dataSource) {
		// TODO Auto-generated method stub
		jdbcTemplate = new JdbcTemplate(dataSource);

	}

	@RequestMapping(value = "/project", method = RequestMethod.GET)
	@Override
	public ModelAndView view(HttpServletRequest request, HttpServletResponse response) {
		mnv = new ModelAndView(direct());

		request.setAttribute("check", 3);
		//System.out.println("Hello");
		try {
			ProjectDao projectDao = new ProjectDao();
			ProjectView projectView = new ProjectView();

			List<Project> projects = projectDao.getAll(jdbcTemplate);
			request.setAttribute("projects", projectView.getProjects(projects));
			//System.out.println(projectView.getProjects(projects));

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
		model.setProject_img(path);
		//System.out.println(model);

		try {
			ProjectDao projectDao = new ProjectDao();
			projectDao.insert(model, jdbcTemplate);

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
		ProjectView projectView = new ProjectView();
		request.setAttribute("project_form", projectView.getProjectForm());
		return mnv;
	}

}
