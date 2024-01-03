package com.mvc.controller;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.entities.Student;
import com.mvc.helper.GetSessionFactory;
import com.mvc.services.ServiceLayer;
@Controller
public class ControllerLayer {


ServiceLayer sl;		
public ServiceLayer getSl() {
	return sl;
}
@Autowired
public void setSl(ServiceLayer sl) {
	this.sl = sl;
}

@RequestMapping("/index")
public String index()
{
 	
	
	return "index";
	
}

@RequestMapping(path="/form", method = RequestMethod.POST)
public String form(@ModelAttribute Student s, Model m)
{	
	
	
	
	
	System.out.println(s.toString());
	sl.saveUserService(s);
	
	return "";
	
}
	
	
}
