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
import com.application.factorys.DaoFactory;
import com.application.interfaces.Defualt;
import com.application.interfaces.Query;
import com.application.model.Home;

@Controller("homeContents")
public class HomeContents implements Defualt {

	private DaoFactory daoFactory;
	private ModelAndView mnv;

	@Autowired
	@Override
	public void setDataSource(DataSource dataSource) {
		this.daoFactory = new DaoFactory(dataSource);

	}

	@RequestMapping(value = "/homeContents", method = RequestMethod.GET)
	public ModelAndView view(HttpServletRequest request, HttpServletResponse response) {
		mnv = new ModelAndView(direct());
		try {

			Query homeDao = daoFactory.getDao("home");
			List<Home> populated = homeDao.getAll();
			
			request.setAttribute("populated", populated);
		} catch (Exception ex) {
			// TODO Auto-generated catch block
			System.out.println("Home Contents Exception : "+ex.getMessage());
		}

		return mnv;
	}

	@RequestMapping(value = "/selectedHome/{selected_page_id}", method = RequestMethod.POST)
	public ModelAndView selectHome(@PathVariable("selected_page_id") int selected_page_id) {
		mnv = new ModelAndView(back());

		try {
			
			Query pageDao = daoFactory.getDao("page");
			
			pageDao.update(HOME, selected_page_id);
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
		
		try {
			Query pageDao = daoFactory.getDao("page");
			
			pageDao.update(HOME, DEFAULT);
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
