package com.elixirsoft.feature.java8.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationExercise {

	public static void main(String[] args) {
		
		LocalDateTime localDateTimeStart = LocalDateTime.now();
		LocalDateTime localDateTimeEnd = LocalDateTime.now().minusHours(3);
		Duration durationLocalDateTime = Duration.between(localDateTimeEnd, localDateTimeStart);
		System.out.println("Duration : " + durationLocalDateTime.toHours());
		
		durationLocalDateTime = Duration.ofHours(3);
		System.out.println("Duration : " + durationLocalDateTime.toMinutes());
		
		LocalTime localTimeStart = LocalTime.now();
		LocalTime localTimeEnd = LocalTime.now().plusMinutes(45);
		Duration durationLocalTime = Duration.between(localTimeStart, localTimeEnd);
		System.out.println("Duration : " + durationLocalTime.toMinutes());
		
		//Unsupported unit: Seconds
		LocalDate localDateStart = LocalDate.now();
		LocalDate localDateEnd = LocalDate.now().plusDays(5);
		Duration durationLocalDate = Duration.between(localDateStart, localDateEnd);
		System.out.println("Duration : " + durationLocalDate.toDays());
	}
}