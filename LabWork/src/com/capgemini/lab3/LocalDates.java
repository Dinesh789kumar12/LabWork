package com.capgemini.lab3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class LocalDates {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter Start date in yyyy-mm-dd:");
		String date1 = scr.next();
		System.out.println("Enter End Date in yyyy-mm-dd :");
		String date2 = scr.next();
		LocalDate start = LocalDate.parse(date1);
		LocalDate end = LocalDate.parse(date2);
		Period diff = Period.between(start, end);
		System.out.printf("Dates in %d day,%d months and %d year", diff.getDays(), diff.getMonths(), diff.getYears());
	}

}
