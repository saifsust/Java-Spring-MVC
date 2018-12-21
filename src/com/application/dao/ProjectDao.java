package com.application.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import com.application.interfaces.Query;
import com.application.model.Project;

public class ProjectDao implements Query<Project> {

	private String query;
	
	@Override
	public Project mapRow(ResultSet rs, int rowNum) throws SQLException {
		Project project = new Project(rs.getInt("project_id"), rs.getString("project_title"),
				rs.getString("project_img"), rs.getString("detail"), rs.getString("order_date"),
				rs.getString("delevery_date"), rs.getInt("client_id"), rs.getString("project_tools"),
				rs.getInt("developer_group_id"), rs.getString("deal_detail"), rs.getBoolean("isComplete"));
		return project;
	}

	@Override
	public List<Project> getAll(JdbcTemplate jdbcTemplate) throws SQLException {
		query = SELECT_ALL + "projects";
		return jdbcTemplate.query(query, new ProjectDao());
	}

	@Override
	public boolean insert(Project table, JdbcTemplate jdbcTemplate) throws SQLException {
		query = INSERT
				+ "projects(project_title,project_img,detail,order_date,delevery_date,client_id,project_tools,deal_detail,isComplete) VALUE "
				+ table;
		jdbcTemplate.update(query);
		return false;
	}

	@Override
	public boolean insert(Project table, String name, JdbcTemplate jdbcTemplate) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Map<String, Object>> getAll(String name, JdbcTemplate jdbcTemplate) throws SQLException {

		return null;
	}

	@Override
	public Map<String, Object> getRowById(int id, JdbcTemplate jdbcTemplate) throws SQLException {
		return null;
	}

}
