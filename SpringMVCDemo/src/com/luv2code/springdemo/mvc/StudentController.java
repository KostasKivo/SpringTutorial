package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		//create student obj
		StudentClass theStudent = new StudentClass();
		
		//add student obj to model
		theModel.addAttribute("student",theStudent);
		
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") StudentClass theStudent) {
		
		System.out.println(theStudent.getFirstName() + " " + theStudent.getLastName() + " " + theStudent.getCountry() + " " + theStudent.getOperatingSystems());
		
		return "student-confirmation";
	}

}
