package com.application.model;

public class LatestProject {

	public int latest_project_id;
	public int project_id;

	public LatestProject() {
		super();
	}

	public LatestProject(int project_id) {
		super();
		this.project_id = project_id;
	}

	public LatestProject(int latest_project_id, int project_id) {
		super();
		this.latest_project_id = latest_project_id;
		this.project_id = project_id;
	}

	public int getLatest_project_id() {
		return latest_project_id;
	}

	public void setLatest_project_id(int latest_project_id) {
		this.latest_project_id = latest_project_id;
	}

	public int getProject_id() {
		return project_id;
	}

	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}

	@Override
	public String toString() {

		if (this.latest_project_id == 0)
			return "(" + this.project_id + ")";
		else
			return "(" + this.latest_project_id + "," + this.project_id + ")";
	}

}
