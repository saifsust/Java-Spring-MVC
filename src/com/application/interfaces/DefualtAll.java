package com.application.interfaces;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.mail.MailSender;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

public interface DefualtAll<Model> extends Defualt {

	
	public ModelAndView upload(MultipartFile mpf, Model model);

	public ModelAndView upload(HttpServletRequest request, HttpServletResponse response, MultipartFile mpf,
			Model model);

	public ModelAndView upload(Model model);

	public ModelAndView upload(HttpServletRequest request, HttpServletResponse response, Model model);

}
