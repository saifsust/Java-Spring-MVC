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

import com.application.factorys.DaoFactory;
import com.application.factorys.ViewFactory;
import com.application.interfaces.Defualt;
import com.application.interfaces.Query;
import com.application.interfaces.View;
import com.application.model.ProjectTool;
import com.application.views.ProjectToolView;

@Controller("projectToolController")
public class ProjectToolController implements Defualt {

	private String TYPE = "PROJECT-TOOL";
	private DaoFactory daoFactory;
	private ModelAndView mnv;
	private Query projectToolDao;
	private View view = ViewFactory.getView(TYPE);

	@Autowired
	@Override
	public void setDataSource(DataSource dataSource) {
		// TODO Auto-generated method stub
		daoFactory = new DaoFactory(dataSource);
		projectToolDao = daoFactory.getDao(TYPE);

	}

	@RequestMapping(value = "/projectTool", method = RequestMethod.GET)
	@Override
	public ModelAndView view(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("check", 2);

		try {

			List<ProjectTool> tools = projectToolDao.getAll();

			/*for (ProjectTool tool : tools) {
				System.out.println(tool);
			}*/

			request.setAttribute("tools", view.view_table(tools));

			request.setAttribute("projectToolForm", view.form());

		} catch (Exception ex) {
			System.out.println("Project Tool Controller Exception : " + ex.getMessage());
		}

		mnv = new ModelAndView(direct());
		return mnv;
	}

	@RequestMapping(value = "/uploadTool", method = RequestMethod.POST)
	public ModelAndView store(@ModelAttribute("projectTool") ProjectTool projectTool) {
		mnv = new ModelAndView(back());

		try {

			projectToolDao.insert(projectTool);

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
