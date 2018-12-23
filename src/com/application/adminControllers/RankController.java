package com.application.adminControllers;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.application.factorys.DaoFactory;
import com.application.factorys.ViewFactory;
import com.application.interfaces.Defualt;
import com.application.interfaces.Query;
import com.application.interfaces.View;
import com.application.model.Rank;
import com.application.views.RankView;

@Controller("rankController")
public class RankController implements Defualt {

	private final String TYPE = "RANK";
	private ModelAndView mnv;
	private DaoFactory daoFactory;
	private Query rankDao;
	private View view = ViewFactory.getView(TYPE);

	@Autowired
	@Override
	public void setDataSource(DataSource dataSource) {
		// TODO Auto-generated method stub
		daoFactory = new DaoFactory(new JdbcTemplate(dataSource));
		rankDao = daoFactory.getDao(TYPE);

	}

	@RequestMapping(value = "/rank", method = RequestMethod.GET)
	public ModelAndView view(HttpServletRequest request, HttpServletResponse response) {
		mnv = new ModelAndView(direct());

		request.setAttribute("check", 1);
		request.setAttribute("rankForm", view.form());

		try {
			List<Rank> ranks = rankDao.getAll();

			request.setAttribute("ranks", view.view(ranks));

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return mnv;
	}

	@RequestMapping(value = "/uploadRank", method = RequestMethod.POST)
	public ModelAndView store(@RequestParam("rank") Rank rank) {
		mnv = new ModelAndView(back());
		try {
			rankDao.insert(rank);
		} catch (SQLException e) {

			System.out.println("Rank Controller Exception : " + e.getMessage());
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
		return RDIR + "rank";
	}

}
