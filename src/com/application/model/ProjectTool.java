package com.application.model;

public class ProjectTool {
	public int tool_id;
	public String tool_name;

	public ProjectTool() {
		super();
	}

	public ProjectTool(String tool_name) {
		super();
		this.tool_name = tool_name;
	}

	public ProjectTool(int tool_id, String tool_name) {
		super();
		this.tool_id = tool_id;
		this.tool_name = tool_name;
	}

	public int getTool_id() {
		return tool_id;
	}

	public void setTool_id(int tool_id) {
		this.tool_id = tool_id;
	}

	public String getTool_name() {
		return tool_name;
	}

	public void setTool_name(String tool_name) {
		this.tool_name = tool_name;
	}

	@Override
	public String toString() {

		if (this.tool_id == 0)
			return "('" + this.tool_name + "')";
		else
			return "(" + this.tool_id + ",'" + this.tool_name + "')";
	}

}
