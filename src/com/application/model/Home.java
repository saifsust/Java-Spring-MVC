package com.application.model;

public class Home {
	private int home_id;
	private String header_img;
	private String header;
	private String latest_projects;
	private int first_class_project;
	private String selected_services;
	private String selected_clients;
	private String end_header;
	private String end_detail;
	private String social_medias;

	public Home() {
		super();
	}

	public Home(String header, String header_img, String end_header, String end_detail) {
		super();
		this.header_img = header_img;
		this.header = header;
		this.end_header = end_header;
		this.end_detail = end_detail;
	}

	public Home(String header_img, String header, int first_class_project, String end_header, String end_detail,
			String social_medias) {
		super();
		this.header_img = header_img;
		this.header = header;
		this.first_class_project = first_class_project;
		this.end_header = end_header;
		this.end_detail = end_detail;
		this.social_medias = social_medias;
	}

	public Home(String header_img, String header, String latest_projects, int first_class_project,
			String selected_services, String selected_clients, String end_header, String end_detail,
			String social_medias) {
		super();
		this.header_img = header_img;
		this.header = header;
		this.latest_projects = latest_projects;
		this.first_class_project = first_class_project;
		this.selected_services = selected_services;
		this.selected_clients = selected_clients;
		this.end_header = end_header;
		this.end_detail = end_detail;
		this.social_medias = social_medias;
	}

	public Home(int home_id, String header_img, String header, String latest_projects, int first_class_project,
			String selected_services, String selected_clients, String end_header, String end_detail,
			String social_medias) {
		super();
		this.home_id = home_id;
		this.header_img = header_img;
		this.header = header;
		this.latest_projects = latest_projects;
		this.first_class_project = first_class_project;
		this.selected_services = selected_services;
		this.selected_clients = selected_clients;
		this.end_header = end_header;
		this.end_detail = end_detail;
		this.social_medias = social_medias;
	}

	public int getHome_id() {
		return home_id;
	}

	public void setHome_id(int home_id) {
		this.home_id = home_id;
	}

	public String getHeader_img() {
		return header_img;
	}

	public void setHeader_img(String header_img) {
		this.header_img = header_img;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getLatest_projects() {
		return latest_projects;
	}

	public void setLatest_projects(String latest_projects) {
		this.latest_projects = latest_projects;
	}

	public int getFirst_class_project() {
		return first_class_project;
	}

	public void setFirst_class_project(int first_class_project) {
		this.first_class_project = first_class_project;
	}

	public String getSelected_services() {
		return selected_services;
	}

	public void setSelected_services(String selected_services) {
		this.selected_services = selected_services;
	}

	public String getSelected_clients() {
		return selected_clients;
	}

	public void setSelected_clients(String selected_clients) {
		this.selected_clients = selected_clients;
	}

	public String getEnd_header() {
		return end_header;
	}

	public void setEnd_header(String end_header) {
		this.end_header = end_header;
	}

	public String getEnd_detail() {
		return end_detail;
	}

	public void setEnd_detail(String end_detail) {
		this.end_detail = end_detail;
	}

	public String getSocial_medias() {
		return social_medias;
	}

	public void setSocial_medias(String social_medias) {
		this.social_medias = social_medias;
	}

	@Override
	public String toString() {
		if (getHome_id() == 0) {

			if (getFirst_class_project() == 0)
				return "('" + getHeader() + "','" + getHeader_img() + "'" + ",'" + getEnd_header() + "','"
						+ getEnd_detail() + "')";

			else
				return "('" + getHeader() + "','" + getHeader_img() + "'," + getFirst_class_project() + ",'"
						+ getEnd_header() + "','" + getEnd_detail() + "')";

		} else
			return "(" + getHome_id() + ",'" + getHeader() + "','" + getHeader_img() + "'," + getFirst_class_project()
					+ ",'" + getEnd_header() + "','" + getEnd_detail() + "')";

	}

}
