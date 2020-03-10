package com.capgemini.lab14;

import java.time.LocalDate;

public class Employee {
	int employeeId;
	String firstName;
	String lastName;
	String email;
	String hiredate;

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", hiredate=" + hiredate + ", designation=" + designation + ", salary=" + salary
				+ ", managerId=" + managerId + ", department=" + department + ", phoneNumber=" + phoneNumber + "]";
	}

	String designation;
	Double salary;
	int managerId;
	Department department;
	String phoneNumber;

	public Employee(int employeeId, String firstName, String lastName, String email, String hiredate,
			String designation, int i, int managerId, Department department, String phoneNumber) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.hiredate = hiredate;
		this.designation = designation;
		this.salary = (double) i;
		this.managerId = managerId;
		this.department = department;
		this.phoneNumber = phoneNumber;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}
