package com.capgemini.lab2;

import java.util.Scanner;

public class Check_Number_P_N {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter Your Number to check whether is positive or negative:");
		int number = scr.nextInt();
		if (number >= 0) {
			System.out.println("Positive Number");
		} else {
			System.out.println("Negative Number");
		}

	}

}
