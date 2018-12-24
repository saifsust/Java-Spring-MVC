package com.application.factorys;



import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.application.dao.ClientDao;
import com.application.dao.EngineerDao;
import com.application.dao.GroupDao;
import com.application.dao.HomeDao;
import com.application.dao.PageDao;
import com.application.dao.ProjectDao;
import com.application.dao.ProjectToolDao;
import com.application.dao.RankDao;
import com.application.dao.ServiceDao;
import com.application.interfaces.Query;

public class DaoFactory {

	private JdbcTemplate jdbcTemplate;

	public DaoFactory(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public Query getDao(String daoType) {

		if (daoType.equalsIgnoreCase("CLIENT") || daoType.equalsIgnoreCase("client"))
			return new ClientDao(jdbcTemplate);

		if (daoType.equalsIgnoreCase("ENGINEER") || daoType.equalsIgnoreCase("engineer"))
			return new EngineerDao(jdbcTemplate);

		if (daoType.equalsIgnoreCase("GROUP") || daoType.equalsIgnoreCase("group"))
			return new GroupDao(jdbcTemplate);

		if (daoType.equalsIgnoreCase("HOME") || daoType.equalsIgnoreCase("home"))
			return new HomeDao(jdbcTemplate);

		if (daoType.equalsIgnoreCase("PAGE") || daoType.equalsIgnoreCase("page"))
			return new PageDao(jdbcTemplate);

		if (daoType.equalsIgnoreCase("PROJECT") || daoType.equalsIgnoreCase("project"))
			return new ProjectDao(jdbcTemplate);

		if (daoType.equalsIgnoreCase("PROJECT-TOOL") || daoType.equalsIgnoreCase("project-tool"))
			return new ProjectToolDao(jdbcTemplate);

		if (daoType.equalsIgnoreCase("RANK") || daoType.equalsIgnoreCase("rank"))
			return new RankDao(jdbcTemplate);

		if (daoType.equalsIgnoreCase("SERVICE") || daoType.equalsIgnoreCase("service"))
			return new ServiceDao(jdbcTemplate);

		return null;
	}

}
