package com.application.views;

import java.util.List;
import java.util.Map;

import com.application.interfaces.View;
import com.application.model.Project;

public class WorkView implements View<Project> {

	private String out;

	@Override
	public String view(List<Project> models) {

		out = "";

		for (Project project : models) {
			out += "<div class=\"row\">";

			out += "<br> <br>";

			out += "<div class=\"col-lg-6 centered\">";
			out += "	<img src=\"" + project.getProject_img() + "\" alt=\"\">";
			out += "</div>";
			out += "	<div class=\"col-lg-6\">";
			out += "<h4>" + project.getProject_title() + "</h4>";
			out += "<p>" + project.getDetail() + "</p>";

			// this part must be implemented

			out += "	<p>\n" + "					<i class=\"fa fa-circle-o\"></i> Mobile Design<br /> <i\n"
					+ "						class=\"fa fa-circle-o\"></i> Web Design<br /> <i\n"
					+ "						class=\"fa fa-circle-o\"></i> Development<br /> <i\n"
					+ "						class=\"fa fa-link\"></i> <a href=\"#\">BlackTie.co</a>\n"
					+ "				</p>";

			out += "</div>";
			out += "</div>";

			out += "<br> <br>\n" + "<hr>";

			out += "\n";

		}

		return out;
	}

	@Override
	public String view_table(List<Project> models) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String view(Map<String, Object> mapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String form() {
		// TODO Auto-generated method stub
		return null;
	}

}
