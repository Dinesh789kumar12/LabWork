package com.capgemini.lab7;

import java.util.Arrays;

public class ProductNames7 {

	public static void main(String[] args) {
		String Product_Names[] = { "Apple", "Goggle", "facebook", "Twitter", "Instagram" };
		for (int i = 0; i < Product_Names.length; i++) {
			for (int j = i + 1; j < Product_Names.length; j++) {
				if (Product_Names[i].compareTo(Product_Names[j]) > 0) {
					String temp;
					temp = Product_Names[i];
					Product_Names[i] = Product_Names[j];
					Product_Names[j] = temp;
				}
			}
		}
		System.out.println("Sorted String :" + Arrays.toString(Product_Names));
	}

}
