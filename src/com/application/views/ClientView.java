package com.application.views;

import java.util.List;
import java.util.Map;

import com.application.interfaces.View;
import com.application.model.Client;

public class ClientView implements View<Client> {
	private String out;

	public String form() {

		out = "<form method='POST' modelAttribute='client' action = 'uploadClient' enctype='multipart/form-data'  >";
		out += "<div class='form-group'>";
		out += "<input type='text' name = 'first_name' placeholder='First Name'/>";
		out += "</div>";
		out += "<div class='form-group'>";
		out += "<input type='text' name='last_name' placeholder ='Last Name'/>";
		out += "</div>";
		out += "<div class='form-group'>";
		out += "<input type='email' name='mail' placeholder ='Email'/>";
		out += "</div>";
		out += "<div class='form-group'>";
		out += "<input type='password' name='password' placeholder ='Pssword'/>";
		out += "</div>";
		out += "<input type='file' name='img' placeholder ='Picture'/>";
		out += "<input type='file' name='logo' placeholder ='logo'/>";
		out += "<div class='form-group'>";
		out += "<textarea rows='10' cols='10' name='detail' placeholder='Detail'> </textarea>";
		out += "</div>";
		out += "<input type='submit' name='submit' class='btn primary-btn'/>";
		out += "</form>";
		out += "\n";
		return out;
	}

	@Override
	public String view(List<Client> models) {
		out = "<br> <br>";

		for (Client model : models) {
			out += "<div class=\"col-lg-3\">";
			out += "	<img class=\"img-circle\" src=\"" + model.getPicture()
					+ "\" width=\"110\" height=\"110\" alt=\"Image Not Found! \">";
			out += "<h4>" + model.getFirst_name() + " " + model.getLast_name() + "</h4>";
			out += "<p>" + model.getDetail() + "<p>\n\n";
			out += "<p><a href=\"#\">@" + model.getFirst_name() + " </p>";
			out += "</div>\n";
		}

		return out;
	}

	@Override
	public String view(Map<String, Object> mapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String view_table(List<Client> models) {
		// TODO Auto-generated method stub
		return null;
	}

}
