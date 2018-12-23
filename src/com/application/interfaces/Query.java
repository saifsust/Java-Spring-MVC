package com.application.interfaces;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.application.model.Service;

public interface Query<Model> extends RowMapper<Model> {
	public final String DATABASE_NAME = "mybusiness";
	public final String INSERT = "INSERT INTO  " + DATABASE_NAME + ".";
	public final String SELECT_ALL = "SELECT * FROM " + DATABASE_NAME + ".";

	public List<Model> getAll() throws SQLException;

	public List<Map<String, Object>> getAll(String name) throws SQLException;

	public List<Model> getAllLimit() throws SQLException;

	public boolean insert(Model model) throws SQLException;

	public boolean insert(Model model, String name) throws SQLException;

	public void update(int id, Model model) throws Exception;

	public void update(int id, int selected_id) throws Exception;

	public Map<String, Object> getRowById(int id) throws SQLException;

}
