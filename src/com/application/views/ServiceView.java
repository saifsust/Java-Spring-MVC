package com.application.views;

import java.util.List;
import java.util.Map;

import com.application.interfaces.View;
import com.application.model.Service;

public class ServiceView implements View<Service> {

	private static String out;

	public  String form() {

		out = "<form method ='POST' modelAttribute ='service' action ='serviceContentUpload' enctype='multipart/form-data' >";

		out += "<div class ='form-group' >";

		out += "<input type ='text' name='title' class ='form-control' placeholder ='title' />";

		out += "</div>";
		// out += "<div class = 'form-group' >";

		// out += "<input type='file' name ='link' />";

		// out += "</div>";

		out += "<textarea  rows = '10%'  cols = '20%' name = 'detail'  placeholder ='Detail'  class='form-control'"
				+ "></textarea>";

		out += "<input type='submit' name= 'submit' class ='btn btn-primary'/>";

		out += "</form>";
		return out;
	}

	public  String view(List<Service> services) {

		out = "";
		for (Service service : services) {
			out += "<div class=\"col-lg-4\">";

			out += "<i class=\"fa fa-heart\"></i>";

			out += "<h4>" + service.getTitle() + "</h4>";
			out += "<p>" + service.getDetail() + "</p>";

			out += "</div>";
			out += "\n";
		}
		return out;
	}

	@Override
	public String view(Map<String, Object> mapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String view_table(List<Service> models) {
		// TODO Auto-generated method stub
		return null;
	}

}
