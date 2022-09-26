package com.kostaskivo.springdemo.service;

import java.util.List;

import com.kostaskivo.springdemo.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

}
