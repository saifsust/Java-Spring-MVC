package com.application.viewLogic;

public class Profile {
	private String out;

	public String viewProfile() {

		out = "<form method='POST' modelAttribute='client' action = 'clientUpload' >";
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
		return out;
	}

}
