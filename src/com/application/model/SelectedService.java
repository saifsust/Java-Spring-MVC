package com.application.model;

public class SelectedService {
	private int selected_service_id;
	private int service_id;

	public int getSelected_service_id() {
		return selected_service_id;
	}

	public SelectedService() {
		super();
	}

	public SelectedService(int service_id) {
		super();
		this.service_id = service_id;
	}

	public SelectedService(int selected_service_id, int service_id) {
		super();
		this.selected_service_id = selected_service_id;
		this.service_id = service_id;
	}

	public void setSelected_service_id(int selected_service_id) {
		this.selected_service_id = selected_service_id;
	}

	public int getService_id() {
		return service_id;
	}

	public void setService_id(int service_id) {
		this.service_id = service_id;
	}

	@Override
	public String toString() {
		if (getSelected_service_id() == 0) {
			return "(" + getService_id() + ")";
		} else
			return "(" + getSelected_service_id() + "," + getService_id() + ")";
	}

}
