package com.application.model;

public class About {

	private int about_id;
	private String header;
	private String header_detail;
	private String selected_engineers;
	private String selected_services;
	private String end_header;
	private String end_detail;
	private String social_medias;

	public About() {
		super();
	}

	public About(String header, String header_detail, String end_header, String end_detail, String social_medias) {
		super();
		this.header = header;
		this.header_detail = header_detail;
		this.end_header = end_header;
		this.end_detail = end_detail;
		this.social_medias = social_medias;
	}

	public About(String header, String header_detail, String selected_engineers, String selected_services,
			String end_header, String end_detail, String social_medias) {
		super();
		this.header = header;
		this.header_detail = header_detail;
		this.selected_engineers = selected_engineers;
		this.selected_services = selected_services;
		this.end_header = end_header;
		this.end_detail = end_detail;
		this.social_medias = social_medias;
	}

	public About(int about_id, String header, String header_detail, String selected_engineers, String selected_services,
			String end_header, String end_detail, String social_medias) {
		super();
		this.about_id = about_id;
		this.header = header;
		this.header_detail = header_detail;
		this.selected_engineers = selected_engineers;
		this.selected_services = selected_services;
		this.end_header = end_header;
		this.end_detail = end_detail;
		this.social_medias = social_medias;
	}

	public int getAbout_id() {
		return about_id;
	}

	public void setAbout_id(int about_id) {
		this.about_id = about_id;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getHeader_detail() {
		return header_detail;
	}

	public void setHeader_detail(String header_detail) {
		this.header_detail = header_detail;
	}

	public String getSelected_engineers() {
		return selected_engineers;
	}

	public void setSelected_engineers(String selected_engineers) {
		this.selected_engineers = selected_engineers;
	}

	public String getSelected_services() {
		return selected_services;
	}

	public void setSelected_services(String selected_services) {
		this.selected_services = selected_services;
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
		if (getAbout_id() == 0) {

			return "('" + getHeader() + "','" + getHeader_detail() + "','" + getEnd_header() + "','" + getEnd_detail()
					+ "')";
		} else {
			return "(" + getAbout_id() + ",'" + getHeader() + "','" + getHeader_detail() + "','" + getEnd_header()
					+ "','" + getEnd_detail() + "')";
		}

	}

}
