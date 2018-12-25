package com.application.adminControllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.application.factorys.DaoFactory;
import com.application.factorys.ViewFactory;
import com.application.interfaces.DefualtAll;
import com.application.interfaces.View;
import com.application.model.SocialMedia;

@Controller("socialMediaController")
public class SocialMediaController implements DefualtAll<SocialMedia> {

	private static final String TYPE = "SOCIAL-MEDIA";
	private ModelAndView mnv;
	private DaoFactory daoFactory;
	private View view = ViewFactory.getView(TYPE);

	@Autowired
	@Override
	public void setDataSource(DataSource dataSource) {
		this.daoFactory = new DaoFactory(dataSource);
	}

	@RequestMapping(value = "/social-media", method = RequestMethod.GET)
	@Override
	public ModelAndView view(HttpServletRequest request, HttpServletResponse response) {
		try {

			mnv = new ModelAndView(direct());
			request.setAttribute("check", 7);
			request.setAttribute("social_media_form", view.form());

		} catch (Exception ex) {
			System.out.println("Social Media Controller Exception : " + ex.getMessage());
		}

		return mnv;
	}

	@Override
	public String direct() {
		// TODO Auto-generated method stub
		return ADM + PAGE;
	}

	@Override
	public String back() {
		// TODO Auto-generated method stub
		return RDIR+"social-media";
	}

	@Override
	public ModelAndView upload(MultipartFile mpf, SocialMedia model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView upload(HttpServletRequest request, HttpServletResponse response, MultipartFile mpf,
			SocialMedia model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView upload(SocialMedia model) {
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping(value = "/upload-social-media", method = RequestMethod.POST)
	@Override
	public ModelAndView upload(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("socialMedia") SocialMedia model) {

		try {
			System.out.println(model);

		} catch (Exception ex) {
			System.out.println("Upload Social Media Exception : " + ex.getMessage());
		}

		mnv = new ModelAndView(back());

		return mnv;
	}

	

}
