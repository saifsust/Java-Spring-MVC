package com.application.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import com.application.interfaces.Query;
import com.application.model.Service;

public class ServiceDao implements Query<Service> {

	private JdbcTemplate jdbcTemplate;

	public ServiceDao() {

	}

	public ServiceDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	private String SQL;

	@Override
	public Service mapRow(ResultSet rs, int rowNum) throws SQLException {

		Service service = new Service();

		service.setTitle(rs.getString("service_title"));
		service.setService_id(rs.getInt("service_id"));
		service.setDetail(rs.getString("service_detail"));
		service.setEngineer_id(rs.getInt("engineer_id"));
		service.setLogo(rs.getString("service_logo"));

		return service;
	}

	public List<Service> getAll() {
		SQL = SELECT_ALL + "services";
		return jdbcTemplate.query(SQL, new ServiceDao());
	}

	@Override
	public List<Service> getAllLimit() throws SQLException {
		SQL = SELECT_ALL + "services LIMIT 0,6 ";

		return jdbcTemplate.query(SQL, new ServiceDao());
	}

	@Override
	public List<Map<String, Object>> getAll(String name) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(Service model) throws SQLException {
		SQL = INSERT + "services(service_title,service_logo,service_detail,engineer_id) values " + model;
		jdbcTemplate.execute(SQL);
		return true;
	}

	@Override
	public boolean insert(Service model, String name) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Map<String, Object> getRowById(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(int id, Service model) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(int id, int selected_id) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
