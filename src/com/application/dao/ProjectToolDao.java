package com.application.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.application.interfaces.Query;
import com.application.migrations.InstallMigrations;
import com.application.model.ProjectTool;
import com.application.model.Service;

public class ProjectToolDao implements Query<ProjectTool> {

	private String query;
	private JdbcTemplate jdbcTemplate;

	public ProjectToolDao() {

	}

	public ProjectToolDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public ProjectTool mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProjectTool projectTool = new ProjectTool();
		projectTool.setTool_id(rs.getInt("tool_id"));
		projectTool.setTool_name(rs.getString("tool_name"));
		return projectTool;
	}

	@Override
	public List<ProjectTool> getAll() throws SQLException {
		// TODO Auto-generated method stub
		query = SELECT_ALL + "project_tools";
		return jdbcTemplate.query(query, new ProjectToolDao());
	}

	@Override
	public boolean insert(ProjectTool model) throws SQLException {

		query = INSERT + "project_tools(tool_name) VALUE " + model;
		jdbcTemplate.update(query);
		return true;
	}

	@Override
	public boolean insert(ProjectTool model, String name) throws SQLException {
		InstallMigrations.creatProjectTools(name, jdbcTemplate);
		query = INSERT + name + "(tool_name) VALUE " + model;
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
		query = SELECT_ALL + "tool WHERE project_tool_id = " + id;
		return jdbcTemplate.queryForMap(query);
	}

	@Override
	public List<ProjectTool> getAllLimit() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(int id, ProjectTool model) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(int id, int selected_id) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
