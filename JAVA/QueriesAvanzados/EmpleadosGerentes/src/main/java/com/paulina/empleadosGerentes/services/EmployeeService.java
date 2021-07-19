package com.paulina.empleadosGerentes.services;


	import java.util.List;
	import java.util.Optional;

	import org.springframework.stereotype.Service;

import com.paulina.empleadosGerentes.models.Employee;
import com.paulina.empleadosGerentes.repositories.EmployeeRepository;

	
	@Service
	public class EmployeeService {
		
		private final EmployeeRepository employeeRepository;
		
		public EmployeeService (EmployeeRepository employeeRepository) {
			this.employeeRepository = employeeRepository;
		}
		
		public List<Employee> allEmployees() {
			return employeeRepository.findAll();
		}
		
		public Employee createEmployee(Employee employee) {
			return employeeRepository.save(employee);
		}
		
		public Employee findEmployeeById(Long id) {
			return employeeRepository.findById(id).get();
		}

		public void getManager(Long id) {
			Optional<Employee> employee = employeeRepository.findById(id);
			System.out.println(employee.get().getManager().getFirst_name());

		}

		public void getEmployees(Long id) {
			Optional<Employee> manager = employeeRepository.findById(id);
			for (Employee e : manager.get().getEmployees()) {
				System.out.println(e.getFirst_name());
			}
		}

		public void saveEmployee(Employee one) {
			employeeRepository.save(one);
		}
	}


