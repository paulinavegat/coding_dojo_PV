package com.paulina.empleadosGerentes.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.paulina.empleadosGerentes.models.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>  {
	List <Employee> findAll();
}
