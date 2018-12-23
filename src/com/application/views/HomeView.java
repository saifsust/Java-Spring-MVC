package com.application.views;
/**
*
*@NAME SAIFUL ISLAM
*@BATCH SUST CSE 2013-14
*@Email : saiful.sust.cse@gmail.com
*@Facebok : https://www.facebook.com/SaifulIslamLitonSust
*/

import java.util.List;
import java.util.Map;

import com.application.interfaces.View;
import com.application.model.Home;
import com.application.model.Project;

public class HomeView implements View<Project> {

	private static String out;

	public String view(Map<String, Object> mapper) {

		out = "<div style=\"background: url(" + mapper.get("header_img")
				+ ") no-repeat center top; width: 100% ; \"\r\n" + "		id=\"headerwrap\">";
		out += "	<div class=\"container\">";
		out += "<div class=\"row centered\">";
		out += "<div class=\"col-lg-8 col-lg-offset-2\">";
		out += "<h1>";

		out += mapper.get("header");

		out += "</h1>";

		out += "<h2>" + mapper.get("end_header") + "</h2>";

		out += "</div>";
		out += "</div>";
		out += "</div>";
		out += "</div>";
		return out;
	}

	public String view(List<Project> projects) {
		return null;
	}

	@Override
	public String form() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String view_table(List<Project> models) {
		// TODO Auto-generated method stub
		return null;
	}

}
