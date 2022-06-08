package com.maven.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.maven.dao.EmployeeDAOImpl;
import com.maven.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeDAOImpl employeeDAOImpl = new EmployeeDAOImpl();

	public Optional<Employee> addEmployee(Employee employee) {
		return employeeDAOImpl.addEmployee(employee);
	}

	public Optional<Employee> updateEmployee(Employee employee) {
		return employeeDAOImpl.updateEmployee(employee);
	}

	public Optional<Employee> getEmployeeById(Integer empId) {
		return employeeDAOImpl.getEmployeeById(empId);
	}

	public List<Employee> getEmployees() {
		return new ArrayList<>(employeeDAOImpl.getEmployees());
	}

}
