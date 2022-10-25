package com.kostaskivo.springboot.cruddemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kostaskivo.springboot.cruddemo.entity.Employee;
import com.kostaskivo.springboot.cruddemo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees")
	public List<Employee> findAll() {
		return employeeService.findAll();
	}
	
	@GetMapping("/employees/{employeeId}")
	public Employee findById(@PathVariable(name = "employeeId") int id ) {
		Employee theEmployee = employeeService.findById(id);
		
		if(theEmployee==null)
			throw new RuntimeException("Employee id not found " + id);
		
		return theEmployee; 
	}
	
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee theEmployee) {
		theEmployee.setId(0);
		
		employeeService.save(theEmployee);
		
		return theEmployee;
	}
	
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee theEmployee) {
		employeeService.save(theEmployee);
		
		return theEmployee;
	}
	
	
	@DeleteMapping("/employees/{employeeId}")
	public String deleteById(@PathVariable(name = "employeeId") int id) {
		 Employee theEmployee = employeeService.findById(id);
		 
		 if(theEmployee==null)
				throw new RuntimeException("Employee id not found " + id);
		 
		 employeeService.deleteById(id);
		 
		 return "Employee with id " + id + " deleted";
	}
	

}
