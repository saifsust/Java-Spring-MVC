package com.application.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import com.application.interfaces.Query;
import com.application.model.Home;

public class HomeDao implements Query<Home> {

	private String query;
	@Override
	public Home mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		Home home = new Home();
		home.setHome_id(resultSet.getInt("home_id"));
		home.setHeader(resultSet.getString("header"));
		home.setHeader_img(resultSet.getString("header_img"));
		home.setLatest_projects(resultSet.getString("latest_projects"));
		home.setFirst_class_project(resultSet.getInt("first_class_project_id"));
		home.setSelected_services(resultSet.getString("selected_services"));
		home.setSelected_clients(resultSet.getString("selected_clients"));
		home.setEnd_header(resultSet.getString("end_header"));
		home.setEnd_detail(resultSet.getString("end_detail"));
		home.setSocial_medias(resultSet.getString("social_medias"));
		return home;
	}

	@Override
	public List<Home> getAll(JdbcTemplate jdbcTemplate) throws SQLException {
		query = SELECT_ALL + "home";
		return jdbcTemplate.query(query, new HomeDao());
	}

	@Override
	public List<Map<String, Object>> getAll(String name, JdbcTemplate jdbcTemplate) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(Home table, JdbcTemplate jdbcTemplate) throws SQLException {
		try {
			System.out.println(table);
			query = INSERT + "home(header,header_img,end_header,end_detail) VALUE " + table;
			jdbcTemplate.update(query);
			return true;
		} catch (Exception ex) {
			System.out.println("HomeDao insert : " + ex.getMessage());
			throw new RuntimeException(ex);
		}
	}

	@Override
	public boolean insert(Home table, String name, JdbcTemplate jdbcTemplate) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Map<String, Object> getRowById(int id, JdbcTemplate jdbcTemplate) throws SQLException {
         
		PageDao pageDao = new PageDao();
		
		Object homeId = pageDao.getRowById(id, jdbcTemplate).get("selected_page_id");
		
		
		String SQL =SELECT_ALL+" home WHERE home_id = "+homeId; 
		
		return jdbcTemplate.queryForMap(SQL);
	}

}
