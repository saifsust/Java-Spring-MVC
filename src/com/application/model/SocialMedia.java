package com.application.model;

public class SocialMedia {

	private int media_id;
	private String media_name;
	private String media_logo;
	private String media_link;

	public SocialMedia() {
		super();
	}

	public SocialMedia(String media_name, String media_logo, String media_link) {
		super();
		this.media_name = media_name;
		this.media_logo = media_logo;
		this.media_link = media_link;
	}

	public SocialMedia(int media_id, String media_name, String media_logo, String media_link) {
		super();
		this.media_id = media_id;
		this.media_name = media_name;
		this.media_logo = media_logo;
		this.media_link = media_link;
	}

	public int getMedia_id() {
		return media_id;
	}

	public void setMedia_id(int media_id) {
		this.media_id = media_id;
	}

	public String getMedia_name() {
		return media_name;
	}

	public void setMedia_name(String media_name) {
		this.media_name = media_name;
	}

	public String getMedia_logo() {
		return media_logo;
	}

	public void setMedia_logo(String media_logo) {
		this.media_logo = media_logo;
	}

	public String getMedia_link() {
		return media_link;
	}

	public void setMedia_link(String media_link) {
		this.media_link = media_link;
	}

	@Override
	public String toString() {
		if (getMedia_id() == 0)
			return "('" + getMedia_name() + "','" + getMedia_logo() + "','" + getMedia_link() + "')";
		else
			return "(" + getMedia_id() + ",'" + getMedia_name() + "','" + getMedia_logo() + "','" + getMedia_link()
					+ "')";
	}

}
