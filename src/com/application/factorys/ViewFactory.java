package com.application.factorys;

import com.application.interfaces.View;
import com.application.views.EngineerView;
import com.application.views.HomeView;
import com.application.views.ClientView;
import com.application.views.ProjectToolView;
import com.application.views.ProjectView;
import com.application.views.RankView;
import com.application.views.ServiceView;
import com.application.views.WorkView;

public class ViewFactory {

	public static View getView(String viewType) {

		if (viewType.equalsIgnoreCase("ENGINEER") || viewType.equalsIgnoreCase("engineer"))
			return new EngineerView();

		if (viewType.equalsIgnoreCase("HOME") || viewType.equalsIgnoreCase("home"))
			return new HomeView();

		if (viewType.equalsIgnoreCase("PROFILE") || viewType.equalsIgnoreCase("profile"))
			return new ClientView();

		if (viewType.equalsIgnoreCase("PROJECT-TOOL") || viewType.equalsIgnoreCase("project-tool"))
			return new ProjectToolView();

		if (viewType.equalsIgnoreCase("PROJECT") || viewType.equalsIgnoreCase("project"))
			return new ProjectView();

		if (viewType.equalsIgnoreCase("RANK") || viewType.equalsIgnoreCase("rank"))
			return new RankView();

		if (viewType.equalsIgnoreCase("SERVICE") || viewType.equalsIgnoreCase("service"))
			return new ServiceView();

		if (viewType.equalsIgnoreCase("WORK") || viewType.equalsIgnoreCase("work"))
			return new WorkView();

		return null;
	}

}
