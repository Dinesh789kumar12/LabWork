package com.capgemini.lab8;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Reader82 {

	public static void main(String[] args) throws Exception {

		File f = new File("hello1.txt");
		Scanner scr = new Scanner(f);
		scr.useDelimiter(",");
		while (scr.hasNextLine()) {
			String temp = scr.next();
			if (Integer.parseInt(temp) % 2 == 0) {
				System.out.println(temp);
			}
		}
	}
}
