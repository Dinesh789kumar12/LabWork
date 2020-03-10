package com.capgemini.lab3;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ProductClass {

	@SuppressWarnings("deprecation")
	public Date Product_Purchase_Date(String purchasedate, int period) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date(sdf.parse(purchasedate).getTime());
		date.setMonth(date.getYear() + period);
		return date;
	}

	public static void main(String[] args) throws Exception {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter Your Purchase Date in YYYY-MM-DD");
		String date1 = scr.next();
		System.out.println("Enter the warranty time period:");
		int warranty = scr.nextInt();
		ProductClass class1 = new ProductClass();
		Date date = class1.Product_Purchase_Date(date1, warranty);
		System.out.println(date);
	}

}
