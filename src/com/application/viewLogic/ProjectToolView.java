package com.application.viewLogic;

import java.util.List;

import com.application.model.ProjectTool;

public class ProjectToolView {
	private static String out;

	public static String printProjectTool(List<ProjectTool> tools) {
		out = "<table class = 'table'>";
		out += RankView.printTwoColumnTableHeader("Project Tool");
		out += "<tbody>";
		for (ProjectTool tool : tools) {
			out += "<tr>";
			out += "<td>" + tool.getTool_id() + "</td>";
			out += "<td>" + tool.getTool_name() + "</td>";
			out += "</tr>";
		}
		out += "</tbody>";
		out += "</table>";
		return out;
	}

	public static String projectToolForm() {
		out = "<form method = 'POST' modelAttribute = 'projectTool' action = 'uploadTool' >";
		out += "<div class = ' form-group' >";
		out += "<input type='text' name = 'tool_name' class= 'form-control' />";
		out += "</div>";
		out += "<input type='submit' name = 'submit' class ='btn primary-btn'/>";
		out += "</form>";
		return out;
	}

}
