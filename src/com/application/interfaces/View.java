package com.application.interfaces;

import java.util.List;
import java.util.Map;

public interface View<Model> {
	public String view(List<Model> models);

	public String view_table(List<Model> models);

	public String view(Map<String, Object> mapper);

	public String form();

}
