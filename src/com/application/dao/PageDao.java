package com.application.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import com.application.interfaces.Query;
import com.application.model.SelectedPage;
import com.application.model.Service;

public class PageDao implements Query<SelectedPage> {

	private String query;

	private JdbcTemplate jdbcTemplate;

	public PageDao() {

	}

	public PageDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void update(int page_id, int selected_page_id) throws Exception {
		try {
			query = "INSERT INTO " + DATABASE_NAME + ".pages(page_id,selected_page_id) VALUE ( " + page_id + ","
					+ selected_page_id + ")";
			jdbcTemplate.update(query);

		} catch (Exception ex) {
			try {
				query = "UPDATE " + DATABASE_NAME + ".pages SET selected_page_id = " + selected_page_id
						+ " WHERE page_id = " + page_id;
				jdbcTemplate.update(query);
			} catch (Exception e) {
				System.out.println("Page Dao : " + e.getMessage());
			}

			System.out.println("Page Dao : " + ex.getMessage());
		}

	}

	@Override
	public SelectedPage mapRow(ResultSet rs, int rowNum) throws SQLException {

		return null;
	}

	@Override
	public List<SelectedPage> getAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> getAll(String name) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(SelectedPage model) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insert(SelectedPage model, String name) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Map<String, Object> getRowById(int id) throws SQLException {

		String SQL = SELECT_ALL + " pages WHERE page_id = " + id;
		return jdbcTemplate.queryForMap(SQL);
	}

	@Override
	public List<SelectedPage> getAllLimit() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(int id, SelectedPage model) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
