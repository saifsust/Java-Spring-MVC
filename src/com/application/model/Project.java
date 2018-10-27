package com.application.model;

public class Project {
	public int project_id;
	public String project_title;
	public String project_img;
	public String detail;
	public String order_date;
	public String delevery_date;
	public int client_id;
	public String project_tools="N";
	public int developers_group_id;
	public String deal_detail;
	public boolean isComplete;

	public Project() {
		super();
	}

	public Project(String project_title, String project_img, String detail, String order_date, String delevery_date,
			int client_id, String project_tool, String deal_detail) {
		super();
		this.project_title = project_title;
		this.project_img = project_img;
		this.detail = detail;
		this.order_date = order_date;
		this.delevery_date = delevery_date;
		this.client_id = client_id;
		this.project_tools = project_tool;
		this.deal_detail = deal_detail;
	}

	public Project(String project_title, String project_img, String detail, String order_date, String delevery_date,
			int client_id, String project_tool, String deal_detail, boolean isComplete) {
		super();
		this.project_title = project_title;
		this.project_img = project_img;
		this.detail = detail;
		this.order_date = order_date;
		this.delevery_date = delevery_date;
		this.client_id = client_id;
		this.project_tools = project_tool;
		this.deal_detail = deal_detail;
		this.isComplete = isComplete;
	}

	public Project(String project_title, String project_img, String detail, String order_date, String delevery_date,
			int client_id, String project_tool, int developers_group_id, String deal_detail, boolean isComplete) {
		super();
		this.project_title = project_title;
		this.project_img = project_img;
		this.detail = detail;
		this.order_date = order_date;
		this.delevery_date = delevery_date;
		this.client_id = client_id;
		this.project_tools = project_tool;
		this.developers_group_id = developers_group_id;
		this.deal_detail = deal_detail;
		this.isComplete = isComplete;
	}

	public Project(int project_id, String project_title, String project_img, String detail, String order_date,
			String delevery_date, int client_id, String project_tool, int developers_group_id, String deal_detail,
			boolean isComplete) {
		super();
		this.project_id = project_id;
		this.project_title = project_title;
		this.project_img = project_img;
		this.detail = detail;
		this.order_date = order_date;
		this.delevery_date = delevery_date;
		this.client_id = client_id;
		this.project_tools = project_tool;
		this.developers_group_id = developers_group_id;
		this.deal_detail = deal_detail;
		this.isComplete = isComplete;
	}

	public boolean isComplete() {
		return isComplete;
	}

	public void setComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}

	public int getProject_id() {
		return project_id;
	}

	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}

	public String getProject_title() {
		return project_title;
	}

	public void setProject_title(String project_title) {
		this.project_title = project_title;
	}

	public String getProject_img() {
		return project_img;
	}

	public void setProject_img(String project_img) {
		this.project_img = project_img;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getOrder_date() {
		return order_date;
	}

	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}

	public String getDelevery_date() {
		return delevery_date;
	}

	public void setDelevery_date(String delevery_date) {
		this.delevery_date = delevery_date;
	}

	public int getClient_id() {
		return client_id;
	}

	public void setClient_id(int client_id) {
		this.client_id = client_id;
	}

	public String getProject_tool() {
		return project_tools;
	}

	public void setProject_tool(String project_tool) {
		this.project_tools = project_tool;
	}

	public int getDevelopers_group_id() {
		return developers_group_id;
	}

	public void setDevelopers_group_id(int developers_group_id) {
		this.developers_group_id = developers_group_id;
	}

	public String getDeal_detail() {
		return deal_detail;
	}

	public void setDeal_detail(String deal_detail) {
		this.deal_detail = deal_detail;
	}

	@Override
	public String toString() {

		if (this.project_id == 0 && this.developers_group_id == 0)
			return "('" + this.project_title + "','" + this.project_img + "','" + this.detail + "','" + this.order_date
					+ "','" + this.delevery_date + "'," + this.client_id + ",'" + this.project_tools + "','"
					+ this.deal_detail + "'," + this.isComplete + ")";
		else if (this.project_id == 0)
			return "('" + this.project_title + "','" + this.project_img + "','" + this.detail + "','" + this.order_date
					+ "','" + this.delevery_date + "'," + this.client_id + ",'" + this.project_tools + "',"
					+ this.developers_group_id + ",'" + this.deal_detail + "'," + this.isComplete + ")";
		else
			return "(" + this.project_id + ",'" + this.project_title + "','" + this.project_img + "','" + this.detail
					+ "','" + this.order_date + "','" + this.delevery_date + "'," + this.client_id + ",'"
					+ this.project_tools + "'," + this.developers_group_id + ",'" + this.deal_detail + "',"
					+ this.isComplete + ")";
	}

}
