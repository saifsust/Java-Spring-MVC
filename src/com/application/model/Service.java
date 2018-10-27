package com.application.model;

public class Service {

	private int service_id;
	private String title;
	private String logo;
	private String detail;
	private int engineer_id;

	public Service() {
		super();
	}

	public Service(String title, String logo, String detail, int engineer_id) {
		super();
		this.title = title;
		this.logo = logo;
		this.detail = detail;
		this.engineer_id = engineer_id;
	}

	public Service(int service_id, String title, String logo, String detail, int engineer_id) {
		super();
		this.service_id = service_id;
		this.title = title;
		this.logo = logo;
		this.detail = detail;
		this.engineer_id = engineer_id;
	}

	public int getService_id() {
		return service_id;
	}

	public void setService_id(int service_id) {
		this.service_id = service_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public int getEngineer_id() {
		return engineer_id;
	}

	public void setEngineer_id(int engineer_id) {
		this.engineer_id = engineer_id;
	}

	@Override
	public String toString() {

		if (getService_id() == 0) {
			return "('" + getTitle() + "','" + getLogo() + "','" + getDetail() + "'," + getEngineer_id() + ")";
		} else
			return "(" + getService_id() + ",'" + getTitle() + "','" + getLogo() + "','" + getDetail() + "',"
					+ getEngineer_id() + ")";
	}

}
