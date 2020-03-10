package com.capgemini.lab7;

import java.util.ArrayList;
import java.util.Collections;

public class ProductArrayList {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Goggle");
		arr.add("Twitter");
		arr.add("LinkedIn");
		arr.add("Apple");
		arr.add("Facebook");
		Collections.sort(arr);
		for (String ar1 : arr) {
			System.out.println(ar1);
		}
	}

}
