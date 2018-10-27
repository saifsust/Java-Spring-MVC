package com.application.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.application.migrations.InstallMigrations;
import com.application.model.ProjectTool;

public class ProjectToolDao extends Query<ProjectTool> {

	@Override
	public ProjectTool mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProjectTool projectTool = new ProjectTool();
		projectTool.setTool_id(rs.getInt("tool_id"));
		projectTool.setTool_name(rs.getString("tool_name"));
		return projectTool;
	}

	@Override
	public List<ProjectTool> getAll(JdbcTemplate jdbcTemplate) throws SQLException {
		// TODO Auto-generated method stub
		query = SELECT_ALL + "project_tools";
		return jdbcTemplate.query(query, new ProjectToolDao());
	}

	@Override
	public boolean insert(ProjectTool table, JdbcTemplate jdbcTemplate) throws SQLException {

		query = INSERT + "project_tools(tool_name) VALUE " + table;
		jdbcTemplate.update(query);
		return true;
	}

	@Override
	public boolean insert(ProjectTool table, String name, JdbcTemplate jdbcTemplate) throws SQLException {
		InstallMigrations.creatProjectTools(name, jdbcTemplate);
		query = INSERT + name + "(tool_name) VALUE " + table;
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
		query = SELECT_ALL + "tool WHERE project_tool_id = " + id;
		return jdbcTemplate.queryForMap(query);
	}

}
