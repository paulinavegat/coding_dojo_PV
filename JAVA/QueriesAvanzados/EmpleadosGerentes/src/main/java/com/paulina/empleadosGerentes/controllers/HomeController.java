package com.paulina.empleadosGerentes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.paulina.empleadosGerentes.models.Employee;
import com.paulina.empleadosGerentes.services.EmployeeService;

@Controller
public class HomeController {

	private EmployeeService employeeService;
	
	@RequestMapping("/")
	public String index() {
		Employee one = employeeService.findEmployeeById((long) 1);
		Employee two = employeeService.findEmployeeById((long) 2);
		Employee three = employeeService.findEmployeeById((long) 3);
		employeeService.getEmployees(two.getId());
		employeeService.getManager(three.getId());
		employeeService.getEmployees(one.getId());
		return "index.jsp";
	}

}

