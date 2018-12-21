package com.application.adminControllers;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.application.dao.HomeDao;
import com.application.dao.PageDao;
import com.application.interfaces.Defualt;
import com.application.model.Home;

@Controller("homeContents")
public class HomeContents implements Defualt {

	private JdbcTemplate jdbcTemplate;
	private ModelAndView mnv;

	@Autowired
	@Override
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);

	}

	@RequestMapping(value = "/homeContents", method = RequestMethod.GET)
	public ModelAndView view(HttpServletRequest request, HttpServletResponse response) {
		mnv = new ModelAndView(direct());
		HomeDao homeDao = new HomeDao();
		try {
			List<Home> populated = homeDao.getAll(jdbcTemplate);
			request.setAttribute("populated", populated);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return mnv;
	}

	@RequestMapping(value = "/selectedHome/{selected_page_id}", method = RequestMethod.POST)
	public ModelAndView selectHome(@PathVariable("selected_page_id") int selected_page_id) {
		mnv = new ModelAndView(back());

		PageDao pageDao = new PageDao();
		try {
			pageDao.selectedPageUpdate(HOME, selected_page_id, jdbcTemplate);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" select Hello " + selected_page_id);
		return mnv;
	}

	@RequestMapping(value = "/unselectedHome", method = RequestMethod.POST)
	public ModelAndView unselectHome() {
		mnv = new ModelAndView(back());
		PageDao pageDao = new PageDao();
		try {
			pageDao.selectedPageUpdate(HOME, DEFAULT, jdbcTemplate);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// System.out.println("un Hello " + id);
		return mnv;
	}

	private List<Home> populatedAll() {
		return null;
	}

	@Override
	public String direct() {
		// TODO Auto-generated method stub
		return ADM + "home-contents";
	}

	@Override
	public String back() {
		// TODO Auto-generated method stub
		return RDIR + "homeContents";
	}

}
