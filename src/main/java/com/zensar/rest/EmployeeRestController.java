package com.zensar.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.dto.Employee;
import com.zensar.service.EmployeeService;

/**
 * 
 * @author addvijay
 *
 */

@RestController
public class EmployeeRestController {
	
	@Autowired
	EmployeeService service;
	
	@GetMapping("/hello")
	public String getTest() {
		return "Testing Success";
	}
	
	@PostMapping("/register")
	public Employee registerEmployee(@RequestBody Employee emp) {
		
		return service.registerEmployee(emp);
	}

}
