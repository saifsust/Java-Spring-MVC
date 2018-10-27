package com.application.model;

public class Client {

	private int client_id;
	private String first_name;
	private String last_name;
	private String mail;
	private String password;
	private String picture;
	private String company_logo;
	private String detail;

	public Client() {
		super();
	}

	public Client(String first_name, String last_name, String mail, String password, String picture, String detail) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.mail = mail;
		this.password = password;
		this.picture = picture;
		this.detail = detail;
	}

	public Client(String first_name, String last_name, String mail, String password, String picture,
			String company_logo, String detail) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.mail = mail;
		this.password = password;
		this.picture = picture;
		this.company_logo = company_logo;
		this.detail = detail;
	}

	public Client(int client_id, String first_name, String last_name, String mail, String password, String picture,
			String company_logo, String detail) {
		super();
		this.client_id = client_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.mail = mail;
		this.password = password;
		this.picture = picture;
		this.company_logo = company_logo;
		this.detail = detail;
	}

	public int getClient_id() {
		return client_id;
	}

	public void setClient_id(int client_id) {
		this.client_id = client_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getCompany_logo() {
		return company_logo;
	}

	public void setCompany_logo(String company_logo) {
		this.company_logo = company_logo;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	@Override
	public String toString() {

		if (getClient_id() == 0) {
			return "('" + getFirst_name() + "','" + getLast_name() + "','" + getMail() + "','" + getPassword() + "','"
					+ getPicture() + "','" + getCompany_logo() + "','" + getDetail() + "')";
		} else
			return "(" + getClient_id() + ",'" + getFirst_name() + "','" + getLast_name() + "','" + getMail() + "','"
					+ getPassword() + "','" + getPicture() + "','" + getCompany_logo() + "','" + getDetail() + "')";
	}

}
