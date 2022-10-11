package com.elixirsoft.feature.java8.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeExercise {

	public static void main(String[] args) {
		
		//Local Date Time : 2022-10-11T14:54:57.990157400
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("Local Date Time : " + localDateTime);
		
		//Local Date Time of : 2022-10-11T14:30:45
		localDateTime = LocalDateTime.of(2022, 10, 11, 14, 30, 45);
		System.out.println("Local Date Time of : " + localDateTime);
		
		//Local Date Time of : 2022-10-11T14:54:57.991156700
		localDateTime = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		System.out.println("Local Date Time of : " + localDateTime);
		
		//get
		System.out.println("Local Date Time getYear : " + localDateTime.getYear());
		System.out.println("Local Date Time getMonth : " + localDateTime.getMonth());
		System.out.println("Local Date Time getDayOfMonth : " + localDateTime.getDayOfMonth());
		System.out.println("Local Date Time getDayOfYear : " + localDateTime.getDayOfYear());
		System.out.println("Local Date Time getChronology : " + localDateTime.getChronology());
		System.out.println("Local Date Time get : " + localDateTime.get(ChronoField.DAY_OF_YEAR));
		System.out.println("Local Date Time get : " + localDateTime.get(ChronoField.DAY_OF_MONTH));
		System.out.println("Local Date Time plusYears : " + localDateTime.plusYears(3));
		System.out.println("Local Date Time plusMonths : " + localDateTime.plusMonths(3));
		System.out.println("Local Date Time plusDays : " + localDateTime.plusDays(3));
		
		System.out.println("Local Date Time getHour : " + localDateTime.getHour());
		System.out.println("Local Date Time getMinutes : " + localDateTime.getMinute());
		System.out.println("Local Date Time getSeconds : " + localDateTime.getSecond());	
		
		//with
		System.out.println("Local Date Time with MIDNIGHT : " + localDateTime.with(LocalTime.MIDNIGHT));
		System.out.println("Local Date Time with NOON : " + localDateTime.with(LocalTime.NOON));
		System.out.println("Local Date Time with withYear : " + localDateTime.withYear(2025));
		System.out.println("Local Date Time with withMonth : " + localDateTime.withMonth(6));
	}
}