package com.application.model;

public class SelectedClient {
	public int selected_client_id;
	public int client_id;

	public SelectedClient() {
		super();
	}

	public SelectedClient(int client_id) {
		super();
		this.client_id = client_id;
	}

	public SelectedClient(int selected_client_id, int client_id) {
		super();
		this.selected_client_id = selected_client_id;
		this.client_id = client_id;
	}

	public int getSelected_client_id() {
		return selected_client_id;
	}

	public void setSelected_client_id(int selected_client_id) {
		this.selected_client_id = selected_client_id;
	}

	public int getClient_id() {
		return client_id;
	}

	public void setClient_id(int client_id) {
		this.client_id = client_id;
	}

	@Override
	public String toString() {

		if (this.selected_client_id == 0)
			return "(" + this.client_id + ")";
		else
			return "(" + this.selected_client_id + "," + this.client_id + ")";
	}

}
