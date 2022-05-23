package com.zensar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.zensar.repo.EmployeeRepository;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages="com.zensar", basePackageClasses = EmployeeRepository.class)
public class EmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
		
	}

}
