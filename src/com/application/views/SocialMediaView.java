package com.application.views;

import java.util.List;
import java.util.Map;

import com.application.interfaces.View;
import com.application.model.SocialMedia;

public class SocialMediaView implements View<SocialMedia> {

	private String out;

	@Override
	public String view(List<SocialMedia> models) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String view_table(List<SocialMedia> models) {
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

		out = "<form method='POST'  modelAttribute='socialMedia' action= 'upload-social-media' enctype ='multipart/form-data'>";

		out += "<div class = 'form-group'>";
		out += "<select name = 'media_name' class='form-control' >";
		out += "<option value='sas' >Facebook</option>";
		out += "<option value='1dd' >Facebook</option>";
		out += "<option value='as1' >Facebook</option>";
		out += "<option value='a1a' >Facebook</option>";
		out += "</select>";
		out += "</div>";

		out += "<input type='submit' class ='btn primary-btn'/>";
		out += "</form>";
		return out;
	}

}
