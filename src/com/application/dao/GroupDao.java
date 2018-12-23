package com.application.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import com.application.interfaces.Query;
import com.application.migrations.InstallMigrations;
import com.application.model.Group;
import com.application.model.Service;

public class GroupDao implements Query<Group> {

	private String query;
	private JdbcTemplate jdbcTemplate;

	public GroupDao() {

	}

	public GroupDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Group mapRow(ResultSet resultSet, int rowNum) throws SQLException {

		Group group = new Group(resultSet.getInt("group_id"), resultSet.getInt("engineer_id"));
		return group;
	}

	@Override
	public List<Group> getAll() throws SQLException {

		return null;
	}

	@Override
	public boolean insert(Group group) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insert(Group group, String name) throws SQLException {

		InstallMigrations.createGroup(name, jdbcTemplate);
		query = INSERT + name + "(engineer_id) VALUE " + group;
		jdbcTemplate.update(query);
		return true;
	}

	@Override
	public List<Map<String, Object>> getAll(String name) throws SQLException {
		return jdbcTemplate.queryForList("SELECT * FROM " + DATABASE_NAME + "." + name);
	}

	@Override
	public Map<String, Object> getRowById(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Group> getAllLimit() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(int id, Group model) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(int id, int selected_id) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
