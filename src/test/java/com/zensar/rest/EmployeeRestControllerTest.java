package com.zensar.rest;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zensar.dto.Employee;
import com.zensar.service.EmployeeService;


@WebMvcTest(value=EmployeeRestController.class)
public class EmployeeRestControllerTest {
	
	
	@Autowired
    MockMvc mockMvc;
    
    @MockBean
	EmployeeService service;
    
    Employee emp=new Employee();
	
	@Test
	public void registerEmployee() throws Exception {
		
		when(service.registerEmployee(ArgumentMatchers.any())).thenReturn(emp);
		
		Employee employee1=new Employee(102, "Ram", 1500.00);
		ObjectMapper mapper=new ObjectMapper();
		String empJson=mapper.writeValueAsString(employee1);
		
		MockHttpServletRequestBuilder reqBuilder=MockMvcRequestBuilders.post("/register")
							  .contentType(MediaType.APPLICATION_JSON)
							  .content(empJson);
		
		ResultActions perform =mockMvc.perform(reqBuilder);
		MvcResult andReturn = perform.andReturn();
		MockHttpServletResponse response=andReturn.getResponse();
		
		//String empJson2=response.getContentAsString();
		
		System.out.println(response.toString());
		
		Assertions.assertEquals(response, employee1);
		
	}

}
