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

import com.application.controllers.Directory;
import com.application.dao.RankDao;
import com.application.model.Rank;
import com.application.viewLogic.RankView;

@Controller("rankController")
public class RankController implements Directory {

	private ModelAndView mnv;
	private JdbcTemplate jdbcTemplate;

	@Autowired
	@Override
	public void setDataSource(DataSource dataSource) {
		// TODO Auto-generated method stub
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@RequestMapping(value = "/rank", method = RequestMethod.GET)
	public ModelAndView view(HttpServletRequest request, HttpServletResponse response) {
		mnv = new ModelAndView(direct());

		request.setAttribute("check", 1);
		request.setAttribute("rankForm", RankView.rankForm());
		RankDao rankDao = new RankDao();
		List<Rank> ranks;
		try {
			ranks = rankDao.getAll(jdbcTemplate);
			String rankTable = RankView.printRank(ranks);
			request.setAttribute("ranks", rankTable);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return mnv;
	}

	@RequestMapping(value = "/uploadRank", method = RequestMethod.POST)
	public ModelAndView store(@RequestParam("rank") Rank rank) {
		mnv = new ModelAndView(back());
		RankDao rankDao = new RankDao();
		try {
			rankDao.insert(rank, jdbcTemplate);
		} catch (SQLException e) {

			e.printStackTrace();
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
