package com.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.mvc.entities.CollegeStudent;
import com.mvc.services.CollegeStudentService;

@Controller
public class Complexform {
@Autowired
CollegeStudentService css;	




@RequestMapping("/reg")	
public  String getform()
{
	
	
	
	
	return"register";
}

@RequestMapping(path = "/login",method = RequestMethod.POST)
public  String login(@ModelAttribute("CollegeStudent") CollegeStudent cs ,BindingResult br)
{
	
	System.out.println(cs.toString());
	/*
	 * boolean isdone=css.saveCSD(cs);
	 * 
	 * if(isdone) {
	 * 
	 * return ""; } else {
	 * 
	 * return ""; }
	 */
	if(br.hasErrors())
	{
		return "register";
	}
	
		
		return "login";
	
	
}




}
