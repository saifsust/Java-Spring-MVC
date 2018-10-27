package com.application.model;

/**
 * @author SAIF_SUST
 *
 */
public class ProjectPage extends Page {
	private int work_page_id;
	private String projects;

	public ProjectPage() {
		super();
	}

	public ProjectPage(String header, String header_detail, String end_header, String end_detail) {
		super(header, header_detail, end_header, end_detail);
	}



	public ProjectPage(int work_page_id, String header, String header_detail, String end_header, String end_detail) {
		super(header, header_detail, end_header, end_detail);
		this.work_page_id = work_page_id;
	}

	public int getWork_page_id() {
		return work_page_id;
	}

	public void setWork_page_id(int work_page_id) {
		this.work_page_id = work_page_id;
	}

	public String getProjects() {
		return projects;
	}

	public void setProjects(String projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		if (getWork_page_id() == 0) {
			return "(" + to_string() + ")";
		} else
			return "(" + getWork_page_id() + "," + to_string() + ")";
	}

}
