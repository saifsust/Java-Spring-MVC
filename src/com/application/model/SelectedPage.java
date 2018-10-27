package com.application.model;

public class SelectedPage {
	private int page_id;
	private int selected_page_id;

	public SelectedPage(int selected_page_id) {
		super();
		this.selected_page_id = selected_page_id;
	}

	public SelectedPage(int page_id, int selected_page_id) {
		super();
		this.page_id = page_id;
		this.selected_page_id = selected_page_id;
	}

	public int getPage_id() {
		return page_id;
	}

	public void setPage_id(int page_id) {
		this.page_id = page_id;
	}

	public int getSelected_page_id() {
		return selected_page_id;
	}

	public void setSelected_page_id(int selected_page_id) {
		this.selected_page_id = selected_page_id;
	}

	@Override
	public String toString() {
		return "(" + selected_page_id + ")";
	}

}
