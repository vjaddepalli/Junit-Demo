package com.zensar.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.dto.Employee;

/**
 * 
 * @author addvijay
 *
 */

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	

}
