package com.application.model;

public class Engineer {
	private int engineer_id;
	private String first_name;
	private String last_name;
	private String picture;
	private String about_your_shelf;
	private String user_id;
	private String user_password;
	private String mail;
	private int rank_id;

	public Engineer() {
		super();
	}

	public Engineer(String first_name, String last_name, String picture, String about_your_shelf, String user_id,
			String user_password, String mail, int rank_id) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.picture = picture;
		this.about_your_shelf = about_your_shelf;
		this.user_id = user_id;
		this.user_password = user_password;
		this.mail = mail;
		this.rank_id = rank_id;
	}

	public Engineer(int engineer_id, String first_name, String last_name, String picture, String about_your_shelf,
			String user_id, String user_password, String mail, int rank_id) {
		super();
		this.engineer_id = engineer_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.picture = picture;
		this.about_your_shelf = about_your_shelf;
		this.user_id = user_id;
		this.user_password = user_password;
		this.mail = mail;
		this.rank_id = rank_id;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getEngineer_id() {
		return engineer_id;
	}

	public void setEngineer_id(int engineer_id) {
		this.engineer_id = engineer_id;
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

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getAbout_your_shelf() {
		return about_your_shelf;
	}

	public void setAbout_your_shelf(String about_your_shelf) {
		this.about_your_shelf = about_your_shelf;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public int getRank_id() {
		return rank_id;
	}

	public void setRank_id(int rank_id) {
		this.rank_id = rank_id;
	}

	@Override
	public String toString() {
		if (this.engineer_id == 0)
			return "('" + this.first_name + "','" + this.last_name + "','" + this.picture + "','"
					+ this.about_your_shelf + "','" + this.user_id + "','" + this.user_password + "','" + this.mail
					+ "'," + this.rank_id + ")";
		else
			return "(" + this.engineer_id + ",'" + this.first_name + "','" + this.last_name + "','" + this.picture
					+ "','" + this.about_your_shelf + "','" + this.user_id + "','" + this.user_password + "','"
					+ this.mail + "'," + this.rank_id + ")";
	}

}
