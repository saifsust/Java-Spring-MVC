package com.application.model;

public class SelectedEngineer {
	private int selected_engineer_id;
	private int engineer_id;

	public SelectedEngineer() {
		super();
	}

	public SelectedEngineer(int engineer_id) {
		super();
		this.engineer_id = engineer_id;
	}

	public SelectedEngineer(int selected_engineer_id, int engineer_id) {
		super();
		this.selected_engineer_id = selected_engineer_id;
		this.engineer_id = engineer_id;
	}

	public int getSelected_engineer_id() {
		return selected_engineer_id;
	}

	public void setSelected_engineer_id(int selected_engineer_id) {
		this.selected_engineer_id = selected_engineer_id;
	}

	public int getEngineer_id() {
		return engineer_id;
	}

	public void setEngineer_id(int engineer_id) {
		this.engineer_id = engineer_id;
	}

	@Override
	public String toString() {

		if (getSelected_engineer_id() == 0) {
			return "(" + getEngineer_id() + ")";
		} else
			return "(" + getSelected_engineer_id() + "," + getEngineer_id() + ")";
	}

}
