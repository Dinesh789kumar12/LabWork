package com.capgemini.lab3;

import java.util.Scanner;

public class Three1String {

	public static void main(String[] args) {
		int choice;
		String str;
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter You String");
		str = scr.next();
		while (true) {
			System.out.println(
					"Enter 1 to add String to String Itself\nEnter 2 replace odd positions with #\nEnter 3 remove duplicate characters in the String\n"
							+ "Enter 4 change odd characters to upper case");
			choice = scr.nextInt();
			switch (choice) {
			case 1:
				String str1 = str + str;
				System.out.println(str1);
				System.out.println("");
				break;
			case 2:
				char[] str2 = str.toCharArray();
				for (int i = 0; i < str.length(); i++) {
					str2[i] = '#';
					i++;
				}
				for (char s : str2) {
					System.out.print(s);
				}
				System.out.println("");
				break;
			case 3:
				char[] str3 = str.toCharArray();
				int k = 0;
				for (int i = 0; i < str3.length; i++) {
					int j;
					for (j = 1; j > i; j++) {
						if (str3[i] == str3[j])
							break;
					}
					if (j == i)
						str3[k++] = str3[i];
				}
				for (char c : str3) {
					System.out.print(c);
				}
				break;
			case 4:
				char[] str4 = str.toCharArray();
				for (int i = 0; i < str4.length; i++) {
					str4[i] = Character.toUpperCase(str4[i]);
					i++;
				}
				for (char s1 : str4) {
					System.out.print(s1);
				}
				System.out.println("");
				break;
			case 5:
				System.exit(1);
				break;
			default:
				System.out.println("Invalid choice");
			}
		}
	}
}
