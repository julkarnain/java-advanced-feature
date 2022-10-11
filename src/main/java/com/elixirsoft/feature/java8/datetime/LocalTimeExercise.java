package com.elixirsoft.feature.java8.datetime;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeExercise {

	public static void main(String[] args) {
		
		LocalTime localTime = LocalTime.now();
		System.out.println("Local Time : " + localTime);
		
		// Plus
		System.out.println("Local Time Plus Seconds: " + localTime.plusSeconds(4000));
		
		System.out.println("Local Time Plus Minutes : " + localTime.plusMinutes(45));
		
		System.out.println("Local Time Plus Hours: " + localTime.plusHours(4));
		
		// Minus
		System.out.println("Local Time Minus Seconds: " + localTime.minusSeconds(4000));
		
		System.out.println("Local Time Minus Minutes : " + localTime.minusMinutes(45));
		
		System.out.println("Local Time Minus Hours : " + localTime.minusHours(4));
		
		// With
		System.out.println("Local Time With Seconds: " + localTime.withSecond(59));
		System.out.println("Local Time With Minutes: " + localTime.withMinute(4));
		System.out.println("Local Time With Hours: " + localTime.withHour(4));
		
		System.out.println("Local Time With Chrono Field : " + localTime.with(ChronoField.HOUR_OF_DAY, 2));
		
		localTime = LocalTime.ofSecondOfDay(24000);
		System.out.println("Local Time Second of Day : " + localTime);
		
		localTime = LocalTime.of(10, 20, 22);
		System.out.println("Local Time of Day : " + localTime);
		
		localTime = LocalTime.of(10, 20, 22, 100);
		System.out.println("Local Time of Day : " + localTime);
		
		System.out.println("Local Time Get Hour : " + localTime.getHour());
		
		System.out.println("Local Time Get Minutes : " + localTime.getMinute());
		
		System.out.println("Local Time Get Second : " + localTime.getSecond());
	
		
		System.out.println("Local Time Chrono Field Second of Day  : " + localTime.get(ChronoField.SECOND_OF_DAY));
		
		System.out.println("Local Time Chrono Field Minute of Day : " + localTime.get(ChronoField.MINUTE_OF_DAY));
		
		System.out.println("Local Time Chrono Field Hour of Day : " + localTime.get(ChronoField.HOUR_OF_DAY));
	}
}