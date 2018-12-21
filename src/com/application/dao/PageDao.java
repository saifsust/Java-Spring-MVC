package com.application.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import com.application.interfaces.Query;
import com.application.model.SelectedPage;

public class PageDao implements Query<SelectedPage> {

	private String query;
	
	public void selectedPageUpdate(int page_id, int selected_page_id, JdbcTemplate jdbcTemplate) throws Exception {
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
	public List<SelectedPage> getAll(JdbcTemplate jdbcTemplate) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> getAll(String name, JdbcTemplate jdbcTemplate) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(SelectedPage table, JdbcTemplate jdbcTemplate) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insert(SelectedPage table, String name, JdbcTemplate jdbcTemplate) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Map<String, Object> getRowById(int id, JdbcTemplate jdbcTemplate) throws SQLException {
		
		String SQL = SELECT_ALL+" pages WHERE page_id = "+id;
		return jdbcTemplate.queryForMap(SQL);
	}

}
