package com.capgemini.lab3;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class ZoneClass {

	public static void main(String[] args) {
		ZoneId id1 = ZoneId.of("America/New_York");
		LocalDate date1 = LocalDate.now(id1);
		LocalTime time1 = LocalTime.now(id1);
		System.out.print("America/New_York Zone:Date is ");
		System.out.print(date1);
		System.out.print("   Time is ");
		System.out.println(time1);

		// Europe/London
		ZoneId id2 = ZoneId.of("Europe/London");
		LocalDate date2 = LocalDate.now(id2);
		LocalTime time2 = LocalTime.now(id2);
		System.out.print("Europe/London Zone:Date is ");
		System.out.print(date2);
		System.out.print("   Time is ");
		System.out.println(time2);

		// Asia/Tokyo
		ZoneId id3 = ZoneId.of("Asia/Tokyo");
		LocalDate date3 = LocalDate.now(id3);
		LocalTime time3 = LocalTime.now(id3);
		System.out.print("Asia/Tokyo Zone:Date is ");
		System.out.print(date3);
		System.out.print("   Time is ");
		System.out.println(time3);

		// US/Pacific
		ZoneId id4 = ZoneId.of("US/Pacific");
		LocalDate date4 = LocalDate.now(id4);
		LocalTime time4 = LocalTime.now(id4);
		System.out.print("US/Pacific Zone:Date is ");
		System.out.print(date4);
		System.out.print("   Time is ");
		System.out.println(time4);

		// Africa/Cairo
		ZoneId id5 = ZoneId.of("Africa/Cairo");
		LocalDate date5 = LocalDate.now(id2);
		LocalTime time5 = LocalTime.now(id2);
		System.out.print("Africa/Cairo Zone:Date is ");
		System.out.print(date5);
		System.out.print("   Time is ");
		System.out.println(time5);

		// Australia/Sydney
		ZoneId id6 = ZoneId.of("Australia/Sydney");
		LocalDate date6 = LocalDate.now(id6);
		LocalTime time6 = LocalTime.now(id6);
		System.out.print("Australia/Sydney Zone:Date is ");
		System.out.print(date6);
		System.out.print("   Time is ");
		System.out.println(time6);

	}

}
