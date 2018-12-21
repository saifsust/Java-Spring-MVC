package com.application.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import com.application.interfaces.Query;
import com.application.model.Engineer;

public class EngineerDao implements Query<Engineer> {

	private String query;
	@Override
	public Engineer mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		Engineer engineer = new Engineer();
		engineer.setEngineer_id(resultSet.getInt("engineer_id"));
		engineer.setFirst_name(resultSet.getString("first_name"));
		engineer.setLast_name(resultSet.getString("last_name"));
		engineer.setPicture(resultSet.getString("picture"));
		engineer.setAbout_your_shelf(resultSet.getString("about_your_self"));
		// must do encrypt it for security
		engineer.setUser_id(resultSet.getString("user_id"));
		engineer.setUser_password(resultSet.getString("user_password"));
		engineer.setMail(resultSet.getString("mail"));
		engineer.setRank_id(resultSet.getInt("rank_id"));
		return engineer;
	}

	@Override
	public List<Engineer> getAll(JdbcTemplate jdbcTemplate) throws SQLException {
		query = SELECT_ALL + "engineers";
		return jdbcTemplate.query(query, new EngineerDao());
	}

	@Override
	public boolean insert(Engineer engineer, JdbcTemplate jdbcTemplate) throws SQLException {
		query = INSERT
				+ "engineers(first_name,last_name,picture,about_your_self,user_id,user_password,mail,rank_id) VALUE "
				+ engineer;
		jdbcTemplate.update(query);
		return true;
	}

	@Override
	public boolean insert(Engineer table, String name, JdbcTemplate jdbcTemplate) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}




	@Override
	public List<Map<String, Object>> getAll(String name, JdbcTemplate jdbcTemplate) throws SQLException {
		
		return null;
	}

	@Override
	public Map<String, Object> getRowById(int id, JdbcTemplate jdbcTemplate) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
