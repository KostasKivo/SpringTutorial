package com.kostaskivo.springboot.cruddemo.service;

import java.util.List;

import com.kostaskivo.springboot.cruddemo.entity.Employee;

public interface EmployeeService {
	
	public List<Employee> findAll();
	
	public void save(Employee employee);
	
	public Employee findById(int id);
	
	public void deleteById(int id);

}
