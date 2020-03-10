package com.capgemini.lab14;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
	ArrayList<Employee> employees = new ArrayList<Employee>();

	public List<Employee> getEmployeeList() {
		employees.add(new Employee(100, "Nikil", "Gupta", "nikil121@gmail.com", "2019-02-28", "Analyst", 5000, 1001,
				new Department(10, "IT", 2000), "46464644366"));
		employees.add(new Employee(100, "Sudhanshu", "Singh", "nikil121@gmail.com", "2020-02-28", "Analyst A4", 7000,
				1002, new Department(11, "IT", 2000), "464644366"));
		return employees;
	}

	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}
	
	
}
