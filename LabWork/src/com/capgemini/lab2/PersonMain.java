package com.capgemini.lab2;

import java.util.Scanner;

enum Gender {
	M, F
}

public class PersonMain {
	public static void main(String[] args) {
		String fname, lname, phNo, age;
		String gender;
		Scanner scr = new Scanner(System.in);
		System.out.print("Enter First Name:\n");
		fname = scr.next();
		System.out.print("Enter Last Name:\n");
		lname = scr.next();
		System.out.println("Enter Your age:");
		age = scr.next();
		while (true) {
			System.out.print("Enter Your Gender:\n");
			gender = scr.next();
			if (Gender.valueOf(Character.toString(gender.charAt(0))) == Gender.M
					|| Gender.valueOf(Character.toString(gender.charAt(0))) == Gender.F) {
				System.out.println("Correct");
				break;
			} else {
				System.out.println("Pleae Enter Correct Gender Values");
			}
		}

		System.out.print("Enter Your Phone Number:\n");
		phNo = scr.next();
		Person person = new Person(fname, lname, gender.charAt(0), phNo, Integer.parseInt(age));

		System.out.println("Personal Details:\n----------------\n");
		System.out.println("Fist Name :" + person.getFirstName());
		System.out.println("Last Name :" + person.getLastName());
		System.out.println("Gender :" + person.getGender());
		System.out.println("Age :" + person.getAge());
		System.out.println("Phone Number :" + person.getPhNo());

	}
}
