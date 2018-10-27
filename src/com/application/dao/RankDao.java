package com.application.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import com.application.model.Rank;

public class RankDao extends Query<Rank> {

	@Override
	public List<Rank> getAll(JdbcTemplate jdbcTemplate) throws SQLException {
		query = SELECT_ALL + "ranks";
		return jdbcTemplate.query(query, new RankDao());

	}

	@Override
	public boolean insert(Rank rank, JdbcTemplate jdbcTemplate) throws SQLException {
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
	public boolean insert(Rank table, String name, JdbcTemplate jdbcTemplate) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public List<Map<String, Object>> getAll(String name, JdbcTemplate jdbcTemplate) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> getRowById(int id, JdbcTemplate jdbcTemplate) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}



}
