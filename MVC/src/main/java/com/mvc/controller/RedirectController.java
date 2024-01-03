package com.mvc.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RedirectController {

	
@RequestMapping("/first")	
public String first()

{
	
	System.out.println("First work");
	
	
	return "first";
}



@RequestMapping("/second")	
public String second(@RequestParam("urltext") String urltext)

{


	 String googleSearchURL = "https://www.google.com/search?q=" + urltext;
	return "redirect:"+googleSearchURL;
	

}



	
	
	
}
