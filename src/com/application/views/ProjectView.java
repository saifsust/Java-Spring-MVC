package com.application.views;

import java.util.List;
import java.util.Map;

import com.application.interfaces.View;
import com.application.model.Project;

public class ProjectView implements View<Project> {
	private String out;

	public String form() {
		out = "<form method='POST' modelAttribute='project' action = 'uploadProject' enctype='multipart/form-data' >";
		out += "<div class = 'form-group'>";
		out += "<input type = 'text' name = 'project_title' class='form-control' placeholder = 'Project Title' /> ";
		out += "</div>";
		out += "<input type ='file' name = 'img' />";
		out += "<div class = 'form-group'>";
		out += "<textarea rows = '10%' cols = '50%' name = 'detail' placeholder = 'Detail'  ></textarea>";
		out += "</div>";
		out += "<input type = 'hidden' value ='2' name ='client_id'/> </br> ";
		// out += "<div class = 'form-group'";
		out += "<input type = 'hidden' value ='2017-02-18' name ='order_date'/> </br> ";
		out += "<input type = 'date' name ='delevery_date'/> </br>";
		// out += "</div>";
		out += "<textarea rows = '10%' cols='50%' name = 'deal_detail' placeholder='deal detail' ></textarea></br>";
		out += "<input type = 'submit' name = 'submit' class = 'btn primary-btn' />";
		out += "</form>";
		return out;
	}

	public String view_table(List<Project> projects) {
		out = "<table class='table table-hover'>";
		// table header
		out += "<thead>";
		out += "<tr>";
		out += "<th>Serial No.</th>";
		out += "<th>Title</th>";
		out += "<th>Image</th>";
		out += "<th>Order Date</th>";
		out += "<th>Delevery Date</th>";
		out += "<th>Client</th>";
		out += "<th>Tools</th>";
		out += "<th>Developer</th>";
		out += "<th>Deal Detail</th>";
		out += "<th>IsComp</th>";
		out += "</tr>";
		out += "</thead>";
		// end table header
		out += "<tbody>";
		for (Project project : projects) {
			out += "<tr>";
			out += "<td>" + project.getProject_id() + "</td>";
			out += "<td>" + project.getProject_title() + "</td>";
			// implemnt img tag
			out += "<td>";
			out += "<img src = '" + project.getProject_img()
					+ "' class = 'img-thumbnail' style='width: 100px; heigth: 50px;'/>";
			out += "</td>";
			out += "<td>" + project.getOrder_date() + "</td>";
			out += "<td>" + project.getDelevery_date() + "</td>";
			out += "<td>" + project.getClient_id() + "</td>";
			out += "<td>" + project.getProject_tool() + "</td>";
			out += "<td>" + project.getDevelopers_group_id() + "</td>";
			out += "<td>" + project.getDeal_detail() + "</td>";
			out += "<td>" + project.isComplete() + "</td>";
			out += "</tr>";
		}

		out += "</tbody>";
		out += "</table>";
		return out;
	}

	@Override
	public String view(Map<String, Object> mapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String view(List<Project> models) {
		out = "";

		for (Project project : models) {
			out += "<div class=\"col-lg-4\">";
			out += "<div class=\"tilt\">";
			out += "<a href=\"#\"><img src='" + project.getProject_img() + "' alt=\" No picture available \"> ";

			out += "</a>";
			out += "</div>";
			out += "</div>";
			out += "\n";
		}

		return out;
	}

}
