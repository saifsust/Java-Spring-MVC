package com.application.views;

import java.util.List;
import java.util.Map;

import com.application.interfaces.View;
import com.application.model.Client;

public class ClientView implements View<Client> {
	private String out;

	public String form() {

		out = "<form method='POST' modelAttribute='client' action = 'clientUpload' enctype='multipart/form-data'  >";
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
		out += "<input type='password' name='last_name' placeholder ='Pssword'/>";
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
		// TODO Auto-generated method stub
		return null;
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
