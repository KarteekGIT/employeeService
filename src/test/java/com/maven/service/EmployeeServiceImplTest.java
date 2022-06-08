package com.maven.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.maven.dto.Employee;

class EmployeeServiceImplTest {
	
	EmployeeServiceImpl employeeImpl = new EmployeeServiceImpl();
	Employee employee, employee1, employee2, employee3;
	Optional<Employee> addedEmployee, addedEmployee1, addedEmployee2, addedEmployee3;
	@BeforeEach
	public void init() {
		employee = new Employee(101, "Test", 10000.0, "Java");
		employee1 = new Employee(102, "Test2", 20000.00, "Java");
		employee2 = new Employee(103, "Test3", 30000.00, "Java");
		employee3 = new Employee(104, "Test4", 40000.00, "DotNet");
		addedEmployee = employeeImpl.addEmployee(employee);
		addedEmployee1 = employeeImpl.addEmployee(employee1);
		addedEmployee2 = employeeImpl.addEmployee(employee2);
		addedEmployee3 = employeeImpl.addEmployee(employee3);
	}
	@Test
	void createEmployee() {
		assertTrue(addedEmployee.isPresent());
		assertNotNull(addedEmployee.get());
	}
	
	@Test
	void updateEmployeeTest() {
		Optional<Employee> updatedEmployee = employeeImpl.updateEmployee(employee);
		assertTrue(updatedEmployee.isPresent());
		assertNotNull(updatedEmployee.get());
	}
	
	@Test
	void getEmployeeByIdTest() {
		Optional<Employee> getEmp = employeeImpl.getEmployeeById(103);
		assertTrue(getEmp.isPresent());
		assertNotNull(getEmp.get());
		
	}
	
	@Test
	void getEmployeesTest() {
		List<Employee> employees = employeeImpl.getEmployees();
		boolean assertion = employees.isEmpty()?false:true; 
		assertTrue(assertion);
	}


}
