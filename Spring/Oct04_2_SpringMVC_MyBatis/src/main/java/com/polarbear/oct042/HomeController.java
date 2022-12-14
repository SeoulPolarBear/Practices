package com.polarbear.oct042;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.polarbear.oct042.student.Student;
import com.polarbear.oct042.student.StudentDAO;
import com.polarbear.oct042.test.TestDAO;

@Controller
public class HomeController {

	@Autowired
	private TestDAO tDAO;
	
	@Autowired
	private StudentDAO sDAO;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpServletRequest request) {
		sDAO.getAllStudent(request);
		tDAO.getAllTest(request);
		
		return "index";
	}
	
}
