package com.application.adminControllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.mail.MailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.application.factorys.DaoFactory;
import com.application.factorys.ViewFactory;
import com.application.interfaces.DefualtAll;
import com.application.interfaces.Query;
import com.application.interfaces.View;
import com.application.model.Service;
import com.application.views.ServiceView;

@Controller("servicesContentUploadController")
public class ServicesContentUploadController implements DefualtAll<Service> {

	private final String TYPE = "SERVICE";
	private DaoFactory daoFactory;
	private Query serviceDao;
	private ModelAndView mnv;
	private View view = ViewFactory.getView(TYPE);

	@Autowired
	@Override
	public void setDataSource(DataSource dataSource) {
		this.daoFactory = new DaoFactory(dataSource);

		this.serviceDao = daoFactory.getDao(TYPE);

	}

	@RequestMapping(value = "/serviceContentList", method = RequestMethod.GET)
	@Override
	public ModelAndView view(HttpServletRequest request, HttpServletResponse response) {

		System.out.println("Helllo Service list");

		request.setAttribute("check", 6);

		request.setAttribute("form", view.form());

		try {
			List<Service> list = serviceDao.getAll();

			for (Service service : list) {
				System.out.println(service);
			}
		} catch (Exception ex) {

			System.out.println("Service Content List Exception : " + ex.getMessage());

		}

		mnv = new ModelAndView(direct());
		return mnv;
	}

	public ModelAndView upload(@RequestParam("link") MultipartFile mpf, @ModelAttribute("service") Service service) {

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
		return RDIR + "serviceContentList";
	}

	@Override
	public ModelAndView upload(HttpServletRequest request, HttpServletResponse response,
			@RequestParam("link") MultipartFile mpf, @ModelAttribute("service") Service model) {

		return null;
	}

	@Override
	public ModelAndView upload(Service model) {
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping(value = "/serviceContentUpload", method = RequestMethod.POST)
	@Override
	public ModelAndView upload(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("service") Service model) {
		System.out.println("Hello service upload ");
		// System.out.println(mpf);

		try {
			System.out.println(model);

			System.out.println(serviceDao.insert(model));

		} catch (Exception ex) {

			System.out.println("Service Contents Upload Exception : " + ex.getMessage());

		}

		mnv = new ModelAndView(back());
		return mnv;
	}

	

}
