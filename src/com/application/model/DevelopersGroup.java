package com.application.model;

public class DevelopersGroup {

	public int developers_group_id;
	public String group_name;

	public DevelopersGroup() {
		super();
	}

	public DevelopersGroup(String group_name) {
		super();
		this.group_name = group_name;
	}

	public DevelopersGroup(int developers_group_id, String group_name) {
		super();
		this.developers_group_id = developers_group_id;
		this.group_name = group_name;
	}

	public int getDevelopers_group_id() {
		return developers_group_id;
	}

	public void setDevelopers_group_id(int developers_group_id) {
		this.developers_group_id = developers_group_id;
	}

	public String getGroup_name() {
		return group_name;
	}

	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}

	@Override
	public String toString() {

		if (this.developers_group_id == 0)
			return "('" + this.group_name + "')";
		else
			return "(" + this.developers_group_id + ",'" + this.group_name + "')";
	}
}
