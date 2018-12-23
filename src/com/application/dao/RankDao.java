package com.application.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import com.application.interfaces.Query;
import com.application.model.Rank;
import com.application.model.Service;

public class RankDao implements Query<Rank> {

	private String query;
	
	private JdbcTemplate jdbcTemplate;
	
	public RankDao() {
		
	}
	
	public RankDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}

	@Override
	public List<Rank> getAll() throws SQLException {
		query = SELECT_ALL + "ranks";
		return jdbcTemplate.query(query, new RankDao());

	}

	@Override
	public boolean insert(Rank rank) throws SQLException {
		query = INSERT + "ranks(rank) VALUE " + rank;
		jdbcTemplate.update(query);
		return true;
	}

	@Override
	public Rank mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		Rank rank = new Rank(resultSet.getInt("rank_id"), resultSet.getString("rank"));
		return rank;
	}

	@Override
	public boolean insert(Rank model, String name) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Map<String, Object>> getAll(String name) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> getRowById(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Rank> getAllLimit() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(int id, Rank model) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(int id, int selected_id) throws Exception {
		// TODO Auto-generated method stub
		
	}



}
