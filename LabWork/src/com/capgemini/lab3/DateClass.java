package com.capgemini.lab3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DateClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start date in yyyy-MM-dd");
		String s1 = sc.next();

		LocalDate date = LocalDate.now();
		System.out.println("Current Date in yyy-mm-dd:" + date);
		LocalDate date1 = LocalDate.parse(s1);
		System.out.println(date1);

		Period diff = Period.between(date1, date);
		System.out.printf("Difference is %d years, %d months and %d days old", diff.getYears(), diff.getMonths(),
				diff.getDays());

	}

}
