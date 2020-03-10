package com.capgemini.lab3;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Person {
	String firstName;
	String lastName;
	char gender;
	String phNo;
	String dob;

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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getPhNo() {
		return phNo;
	}

	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Person(String firstName, String lastName, char gender, String phNo, String dob) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.phNo = phNo;
		this.dob = dob;
	}

	public int calculateAge() {
		LocalDate date = LocalDate.now();
		LocalDate date1 = LocalDate.parse(this.dob);
		Period diff = Period.between(date1, date);
		return diff.getYears();
	}

	public String getFullName(String firstName, String lastName) {
		return firstName + " "+ lastName;
	}
	/*
	 * public String getFullName(){
	 * 
	 * }
	 */
}
