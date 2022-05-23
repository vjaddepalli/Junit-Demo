package com.zensar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.dto.Employee;
import com.zensar.repo.EmployeeRepository;

/**
 * 
 * @author addvijay
 *
 */

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository repo;

	public Employee registerEmployee(Employee emp) {
		
		Employee employee = new Employee();
		employee.setId(emp.getId());
		employee.setName(emp.getName());
		employee.setSalary(emp.getSalary());
		repo.save(employee);
		return employee;
	}

}
