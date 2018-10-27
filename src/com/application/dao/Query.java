package com.application.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public abstract class Query<Table> implements RowMapper<Table> {
	protected final String DATABASE_NAME = "mybusiness";
	protected String query;
	protected final String INSERT = "INSERT INTO  " + DATABASE_NAME + ".";
	protected final String SELECT_ALL = "SELECT * FROM " + DATABASE_NAME + ".";

	public abstract List<Table> getAll(JdbcTemplate jdbcTemplate) throws SQLException;

	public abstract List<Map<String, Object>> getAll(String name, JdbcTemplate jdbcTemplate) throws SQLException;

	public abstract boolean insert(Table table, JdbcTemplate jdbcTemplate) throws SQLException;

	public abstract boolean insert(Table table, String name, JdbcTemplate jdbcTemplate) throws SQLException;

	public abstract Map<String, Object> getRowById(int id, JdbcTemplate jdbcTemplate) throws SQLException;
	

}
