package com.maven.dao;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import com.maven.dto.Employee;
import com.maven.dao.EmployeeDAOImpl;

class EmployeeDAOImplTest {

	EmployeeDAOImpl employeeImpl = new EmployeeDAOImpl();
	Employee employee = null;
	Employee employee1 = null;
	Employee employee2 = null;
	Employee employee3 = null;
	Optional<Employee> addedEmployee = null;
	Optional<Employee> addedEmployee1 = null;
	Optional<Employee> addedEmployee2 = null;
	Optional<Employee> addedEmployee3 = null;
	
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
