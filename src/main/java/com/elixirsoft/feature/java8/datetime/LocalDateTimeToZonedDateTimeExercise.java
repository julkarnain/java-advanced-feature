package com.elixirsoft.feature.java8.datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class LocalDateTimeToZonedDateTimeExercise {

	public static void main(String[] args) {
		
		//2022-10-11T17:31:42.840327300
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("Local Date Time : " + localDateTime);
		
		//2022-10-11T17:31:42.840327300-04:00[America/New_York]
		ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.of("America/New_York"));
		System.out.println("Zoned Date Time : " + zonedDateTime);
		
		//2022-10-11T17:31:42.840327300-10:00
		System.out.println(localDateTime.atOffset(ZoneOffset.ofHours(-10)));
		
	}
}