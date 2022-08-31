package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	
	@RequestMapping("processFormVersionTwo")
	public String shoutName(HttpServletRequest request, Model model) {
		
		//read the request parameter
		String name = request.getParameter("studentName");
		//modify data
		name.toUpperCase();
		//create message
		String ret = "Yo" + name;
		//add message to model
		model.addAttribute("message",ret);
		
		
		return "helloworld";
	} 

}
