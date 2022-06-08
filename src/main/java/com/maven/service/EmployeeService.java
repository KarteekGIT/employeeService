package com.maven.service;

import java.util.List;
import java.util.Optional;

import com.maven.dto.Employee;

public interface EmployeeService {
	
	public Optional<Employee> addEmployee(Employee employee);
	
	public Optional<Employee> updateEmployee(Employee employee);
	
	public Optional<Employee> getEmployeeById(Integer empId);
	
	public List<Employee> getEmployees();

}
