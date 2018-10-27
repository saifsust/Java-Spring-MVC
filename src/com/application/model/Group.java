package com.application.model;

public class Group {
	int group_id;
	int engineer_id;

	public Group() {
		super();
	}

	public Group(int engineer_id) {
		super();
		this.engineer_id = engineer_id;
	}

	public Group(int group_id, int engineer_id) {
		super();
		this.group_id = group_id;
		this.engineer_id = engineer_id;
	}

	public int getGroup_id() {
		return group_id;
	}

	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}

	public int getEngineer_id() {
		return engineer_id;
	}

	public void setEngineer_id(int engineer_id) {
		this.engineer_id = engineer_id;
	}

	@Override
	public String toString() {
		if (this.group_id == 0)
			return "(" + this.engineer_id + ")";
		else
			return "(" + this.group_id + "," + this.engineer_id + ")";
	}

}
