package com.maven.dto;

public class Employee {

	private Integer empId;
	private String empName;
	private Double empSal;
	private String empDep;
	
	
	
	public Employee(Integer empId, String empName, Double empSal, String empDep) {
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empDep = empDep;
	}
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}
	public String getEmpDep() {
		return empDep;
	}
	public void setEmpDep(String empDep) {
		this.empDep = empDep;
	}
	
	
}
