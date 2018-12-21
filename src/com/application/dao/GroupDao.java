package com.application.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import com.application.interfaces.Query;
import com.application.migrations.InstallMigrations;
import com.application.model.Group;

public class GroupDao implements Query<Group> {

	private String query;
	
	@Override
	public Group mapRow(ResultSet resultSet, int rowNum) throws SQLException {

		Group group = new Group(resultSet.getInt("group_id"), resultSet.getInt("engineer_id"));
		return group;
	}

	@Override
	public List<Group> getAll(JdbcTemplate jdbcTemplate) throws SQLException {

		return null;
	}

	@Override
	public boolean insert(Group group, JdbcTemplate jdbcTemplate) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insert(Group group, String name, JdbcTemplate jdbcTemplate) throws SQLException {

		InstallMigrations.createGroup(name, jdbcTemplate);
		query = INSERT + name + "(engineer_id) VALUE " + group;
		jdbcTemplate.update(query);
		return true;
	}



	@Override
	public List<Map<String, Object>> getAll(String name, JdbcTemplate jdbcTemplate) throws SQLException {
		return jdbcTemplate.queryForList("SELECT * FROM " + DATABASE_NAME + "." + name);
	}

	@Override
	public Map<String, Object> getRowById(int id, JdbcTemplate jdbcTemplate) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
