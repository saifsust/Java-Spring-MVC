package com.application.adminControllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.application.businessLogic.ImageFactory;
import com.application.factorys.DaoFactory;
import com.application.interfaces.Defualt;
import com.application.interfaces.Query;
import com.application.interfaces.View;
import com.application.model.Home;

@Controller("homeContentsController")
public class HomeContentsController implements Defualt {

	private final String TYPE = "HOME";
	private ModelAndView mnv;
	private DaoFactory daoFactory;
	private View view;

	@Autowired
	@Override
	public void setDataSource(DataSource dataSource) {
		daoFactory = new DaoFactory(dataSource);

	}

	@RequestMapping(value = "/uploadHomeContents", method = RequestMethod.GET)
	@Override
	public ModelAndView view(HttpServletRequest request, HttpServletResponse response) {
		mnv = new ModelAndView(direct());
		return mnv;
	}

	@RequestMapping(value = "/uploadHomeContents", method = RequestMethod.POST)
	public ModelAndView upload(@RequestParam("headerImg") MultipartFile mpf, @ModelAttribute("home") Home home,
			RedirectAttributes redirectAttribute, BindingResult bindingResult, HttpServletRequest httpServletRequest) {
		mnv = new ModelAndView(back());

		if (mpf.isEmpty()) {
			redirectAttribute.addFlashAttribute("message", "You Should select a Picture");
			return mnv;
		}

		// insret information into database
		insertExecution(home, mpf, httpServletRequest);

		return mnv;
	}

	private void insertExecution(Home home, MultipartFile mpf, HttpServletRequest httpServletRequest) {
		ImageFactory imgFactory = new ImageFactory();
		String header_img = imgFactory.move(mpf, STORE_HOME, _HOME, httpServletRequest);
		// System.out.println(header_img);
		home.setHeader_img(header_img);

		try {

			Query homeDao = daoFactory.getDao("home");
			homeDao.insert(home);

		} catch (Exception e) {
			System.out.println("HomeContentsController  insert Execution : " + e.getMessage());
		}

	}

	@Override
	public String direct() {
		// TODO Auto-generated method stub
		return ADM + "upload-home-contents";
	}

	@Override
	public String back() {
		// TODO Auto-generated method stub
		return RDIR + "uploadHomeContents";
	}

}
