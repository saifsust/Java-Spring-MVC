package com.application.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import com.application.interfaces.Query;
import com.application.model.SocialMedia;

public class SocialMediaDao implements Query<SocialMedia> {

	private String SQL;
	private JdbcTemplate jdbcTemplate;

	public SocialMediaDao() {
		// TODO Auto-generated constructor stub
	}

	public SocialMediaDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public SocialMedia mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		SocialMedia model = new SocialMedia();
		model.setMedia_id(rs.getInt("media_id"));
		model.setMedia_name(rs.getString("media_name"));
		model.setMedia_logo(rs.getString("media_logo"));
		model.setMedia_link(rs.getString("media_link"));
		return model;
	}

	@Override
	public List<SocialMedia> getAll() throws SQLException {

		SQL = SELECT_ALL + "social_medias";
		return jdbcTemplate.query(SQL, new SocialMediaDao());
	}

	@Override
	public List<Map<String, Object>> getAll(String name) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SocialMedia> getAllLimit() throws SQLException {
		SQL =SELECT_ALL+"social_medias LIMIT 0,3";
		return jdbcTemplate.query(SQL, new SocialMediaDao());
	}

	@Override
	public boolean insert(SocialMedia model) throws SQLException {
		SQL = INSERT + "social_medias(media_name,media_logo,media_link) values " + model;
		return false;
	}

	@Override
	public boolean insert(SocialMedia model, String name) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void update(int id, SocialMedia model) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(int id, int selected_id) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public Map<String, Object> getRowById(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
