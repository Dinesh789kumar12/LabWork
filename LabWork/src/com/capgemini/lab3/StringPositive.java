package com.capgemini.lab3;

import java.util.Arrays;
import java.util.Scanner;

public class StringPositive {

	public static void main(String[] args) {
		String str;
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter Yor String:");
		str = scr.next();
		char[] ch1 = str.toCharArray();
		Arrays.sort(ch1);
		String str1 = new String(ch1);
		System.out.println(str1);
		if (str.equals(str1)) {
			System.out.println("String is positive");
		} else {
			System.out.println("String is negative");
		}
	}

}
