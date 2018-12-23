package com.application.views;

import java.util.List;
import java.util.Map;

import com.application.interfaces.View;
import com.application.model.ProjectTool;

public class ProjectToolView implements View<ProjectTool> {
	private static String out;

	public String view(List<ProjectTool> tools) {
		return null;
	}

	public String form() {
		out = "<form method = 'POST' modelAttribute = 'projectTool' action = 'uploadTool' >";
		out += "<div class = ' form-group' >";
		out += "<input type='text' name = 'tool_name' class= 'form-control' />";
		out += "</div>";
		out += "<input type='submit' name = 'submit' class ='btn primary-btn'/>";
		out += "</form>";
		return out;
	}

	@Override
	public String view(Map<String, Object> mapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String view_table(List<ProjectTool> models) {
		out = "<table class = 'table'>";
		out += RankView.printTwoColumnTableHeader("Project Tool");
		out += "<tbody>";
		for (ProjectTool tool : models) {
			out += "<tr>";
			out += "<td>" + tool.getTool_id() + "</td>";
			out += "<td>" + tool.getTool_name() + "</td>";
			out += "</tr>";
		}
		out += "</tbody>";
		out += "</table>";
		return out;
	}

}
