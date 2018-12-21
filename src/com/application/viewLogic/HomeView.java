package com.application.viewLogic;

import java.util.Map;

public class HomeView {

	private static String out;

	public static String view(Map<String, Object> mapper) {

		out = "<div style=\"background: url(" + mapper.get("header_img") + ") no-repeat center top; width: 100% ; \"\r\n"
				+ "		id=\"headerwrap\">";
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

}
