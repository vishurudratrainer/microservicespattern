package com.training.employees.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.training.employees.services.EmployeeService;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.training.employees.model.Employee;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@ExtendWith(SpringExtension.class)
@WebMvcTest(EmployeeController.class)
public class StandaloneControllerTests {

	@MockBean
    EmployeeService employeeService;

	@Autowired
	MockMvc mockMvc;

	@Test
	public void testfindAll() throws Exception {
		Employee employee = new Employee("Lokesh", "Gupta");
		List<Employee> employees = Arrays.asList(employee);

		Mockito.when(employeeService.findAll()).thenReturn(employees);

		mockMvc.perform(get("/employee"))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$", Matchers.hasSize(1)))
				.andExpect(jsonPath("$[0].firstName", Matchers.is("Lokesh")));
	}

	@Test
	public void save() throws Exception {
		Employee employee = new Employee("Lokesh", "Gupta");
		Mockito.when(employeeService.save(Mockito.any(Employee.class))).thenReturn(employee);
		ObjectMapper objectMapper =  new ObjectMapper();
		mockMvc.perform(post("/employee")
						.header("Content-Type","application/json")
						.content(objectMapper.writeValueAsBytes(employee)))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.firstName", Matchers.is("Lokesh")));
	}

	@Test
	public void delete() throws Exception {

		Mockito.doNothing().when(employeeService).deleteById(Mockito.anyInt());
		mockMvc.perform(MockMvcRequestBuilders.delete("/employee/1"))
				.andExpect(status().isOk());
	}
	}
