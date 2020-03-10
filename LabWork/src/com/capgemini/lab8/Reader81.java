package com.capgemini.lab8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class Reader81 {

	public static void main(String[] args) throws Exception {
		FileInputStream fileInputStream = new FileInputStream("second.txt");
		int i = 0;
		ArrayList<Character> arr = new ArrayList<Character>();
		while ((i = fileInputStream.read()) != -1) {
			arr.add((char) i);
		}
		StringBuilder str1 = new StringBuilder(arr.toString().replace("[", "").replace("]", "").replace(", ", ""));
		FileOutputStream fileOutputStream = new FileOutputStream("second.txt");

		String str2 = str1.reverse().toString();
		System.out.println(str2);
		byte[] b = str2.getBytes();
		fileOutputStream.write(b);
		fileOutputStream.close();
		fileInputStream.close();
	}

}
