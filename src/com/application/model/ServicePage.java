package com.application.model;

public class ServicePage extends Page {

	private int service_page_id;
	private String services;

	public ServicePage() {
		super();
	}

	public ServicePage(String header, String header_detail, String end_header, String end_detail) {
		super(header, header_detail, end_header, end_detail);
	}

	public ServicePage(int service_page_id, String header, String header_detail, String services, String end_header,
			String end_detail) {
		super(header, header_detail, end_header, end_detail);
		this.service_page_id = service_page_id;
		this.services = services;
	}

	public int getService_page_id() {
		return service_page_id;
	}

	public void setService_page_id(int service_page_id) {
		this.service_page_id = service_page_id;
	}

	public String getServices() {
		return services;
	}

	public void setServices(String services) {
		this.services = services;
	}

	@Override
	public String toString() {
		if (getService_page_id() == 0)
			return "(" + to_string() + ")";
		else
			return "(" + getService_page_id() + "," + to_string() + ")";
	}

}
