package com.application.model;

public class Page {
	private String header;
	private String header_detail;
	private String end_header;
	private String end_detail;
	private String social_medias;

	public Page() {
		super();
	}

	public Page(String header, String header_detail, String end_header, String end_detail) {
		super();
		this.header = header;
		this.header_detail = header_detail;
		this.end_header = end_header;
		this.end_detail = end_detail;
	}



	public String getHeader() {
		return this.header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getHeader_detail() {
		return this.header_detail;
	}

	public void setHeader_detail(String header_detail) {
		this.header_detail = header_detail;
	}

	public String getEnd_header() {
		return this.end_header;
	}

	public void setEnd_header(String end_header) {
		this.end_header = end_header;
	}

	public String getEnd_detail() {
		return this.end_detail;
	}

	public void setEnd_detail(String end_detail) {
		this.end_detail = end_detail;
	}

	public String getSocial_medias() {
		return this.social_medias;
	}

	public void setSocial_medias(String social_medias) {
		this.social_medias = social_medias;
	}

	public String to_string() {
		return "'" + getHeader() + "','" + getHeader_detail() + "','" + getEnd_header() + "','" + getEnd_detail() + "'";
	}

}
