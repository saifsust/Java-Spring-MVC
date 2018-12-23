package com.application.interfaces;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.ModelMap;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

public interface Methods<Table> {

	public ModelAndView view();

	public ModelAndView view(HttpServletRequest request, HttpServletResponse response);

	public ModelAndView view(ModelMap modelMap);

	public ModelAndView upload(HttpServletRequest request, HttpServletResponse response);

	public ModelAndView upload(Table model);

	public ModelAndView upload(MultipartFile mpf, Table model, HttpServletRequest request,
			HttpServletResponse response);

	public ModelAndView delete(int id);

	public ModelAndView edit(int id);

	public ModelAndView update(int id);

}
