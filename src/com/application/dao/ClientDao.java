package com.application.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import com.application.interfaces.Query;
import com.application.model.Client;

public class ClientDao implements Query<Client> {

	private JdbcTemplate jdbcTemplate;
	private String SQL;

	public ClientDao() {
		// TODO Auto-generated constructor stub
	}

	public ClientDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Client mapRow(ResultSet rs, int rowNum) throws SQLException {
		Client client = new Client();
		client.setClient_id(rs.getInt("client_id"));
		client.setFirst_name(rs.getString("first_name"));
		client.setLast_name(rs.getString("last_name"));
		client.setMail(rs.getString("mail"));
		client.setPassword(rs.getString("password"));
		client.setPicture(rs.getString("profile_pic"));
		client.setCompany_logo(rs.getString("company_logo"));
		return client;
	}

	@Override
	public List<Client> getAll() throws SQLException {
		SQL = SELECT_ALL + "clients";
		return jdbcTemplate.query(SQL, new ClientDao());
	}

	@Override
	public List<Map<String, Object>> getAll(String name) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> getAllLimit() throws SQLException {
		SQL = SELECT_ALL + "clients LIMIT 0,3";
		return jdbcTemplate.query(SQL, new ClientDao());
	}

	@Override
	public boolean insert(Client model) throws SQLException {
		SQL = INSERT + "clients(first_name,last_name,mail,password,profile_pic,company_logo,detail) values " + model;
		jdbcTemplate.execute(SQL);
		return true;
	}

	@Override
	public boolean insert(Client model, String name) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void update(int id, Client model) throws Exception {
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
