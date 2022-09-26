package com.kostaskivo.springdemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kostaskivo.springdemo.dao.CustomerDAO;
import com.kostaskivo.springdemo.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerDAO customerDAO;
	
	@RequestMapping("/list")
	public String listCustomers(Model theModel) {
		
		List<Customer> customers = customerDAO.getCustomers();
		
		theModel.addAttribute("customers",customers);
		
		return "list-customers";
	}

}
