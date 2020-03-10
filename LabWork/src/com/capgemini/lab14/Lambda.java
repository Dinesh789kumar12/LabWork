package com.capgemini.lab14;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;

public class Lambda {

	public static void main(String[] args) {
		/*
		 * int x=2; int y=3; BiFunction<Integer, Integer, Integer> expon = (a, b) ->
		 * (int) Math.pow(a, b); System.out.println(expon.apply(x, y));
		 */

		/*
		 * String str="Nikil"; Consumer<String> con=(a) -> {
		 * System.out.println(a.replace("", " ").trim()); }; con.accept(str);
		 */

		/*
		 * String username="niki"; String password="1234"; BiFunction<String, String,
		 * Boolean> bi=(a,b) ->{ if(username==a) { return true; } else { return false; }
		 * }; System.out.println(bi.apply("niki", "1234"));
		 */

		/*
		 * ArrayList<Lambda14_4> list=new ArrayList<>(); list.add(new
		 * Lambda14_4("Harish", 15)); list.add(new Lambda14_4("Niki", 20));
		 * 
		 * list.forEach(System.out::println);
		 */
		

		/*
		 * Function<Integer, Integer> cons = Lambda::factorial;
		 * System.out.println(cons.apply(5));
		 */
	}

	public static int factorial(int a) {
		int fact;
		if (a == 1) {
			return 1;
		} else {
			fact = a * factorial(a - 1);
			return fact;
		}
	}
}
