package com.application.adminControllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.application.controllers.Directory;
import com.application.dao.ProjectToolDao;
import com.application.model.ProjectTool;
import com.application.viewLogic.ProjectToolView;

@Controller("projectToolController")
public class ProjectToolController implements Directory {

	private JdbcTemplate jdbcTemplate;
	private ModelAndView mnv;

	@Autowired
	@Override
	public void setDataSource(DataSource dataSource) {
		// TODO Auto-generated method stub
		jdbcTemplate = new JdbcTemplate(dataSource);

	}

	@RequestMapping(value = "/projectTool", method = RequestMethod.GET)
	@Override
	public ModelAndView view(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("check", 2);

		try {
			ProjectToolDao projectToolDao = new ProjectToolDao();
			List<ProjectTool> tools = projectToolDao.getAll(jdbcTemplate);
			request.setAttribute("tools", ProjectToolView.printProjectTool(tools));
			request.setAttribute("projectToolForm", ProjectToolView.projectToolForm());

		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}

		mnv = new ModelAndView(direct());
		return mnv;
	}

	@RequestMapping(value = "/uploadTool", method = RequestMethod.POST)
	public ModelAndView store(@ModelAttribute("projectTool") ProjectTool projectTool) {
		mnv = new ModelAndView(back());

		try {

			ProjectToolDao projectToolDao = new ProjectToolDao();
			projectToolDao.insert(projectTool, jdbcTemplate);

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		return mnv;
	}

	@Override
	public String direct() {
		// TODO Auto-generated method stub
		return ADM + PAGE;
	}

	@Override
	public String back() {
		// TODO Auto-generated method stub
		return RDIR + "projectTool";
	}

}
