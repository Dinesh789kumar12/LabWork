package com.capgemini.lab14;

public class EmployeeService {

	public static void main(String[] args) {
		EmployeeRepository employeeRepository12 = new EmployeeRepository();
		employeeRepository12.getEmployeeList();
		System.out.println(employeeRepository12.getEmployees().size());
		for (int i = 0; i < employeeRepository12.getEmployees().size(); i++) {
             System.out.println(employeeRepository12.getEmployees().get(i));
		}
	}

}
