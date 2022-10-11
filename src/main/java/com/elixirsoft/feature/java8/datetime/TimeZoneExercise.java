package com.elixirsoft.feature.java8.datetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZoneExercise {

	public static void main(String[] args) {
		
		//Asia/Aden
		//America/Cuiaba
		//Etc/GMT+9
		//Etc/GMT+8
		//Africa/Nairobi
		//America/Marigot
		
		ZoneId.getAvailableZoneIds().stream().forEach(System.out::println);
		
		System.out.println("Europe/London : " + ZonedDateTime.now(ZoneId.of("Europe/London")));
		System.out.println("America/New_York : " + ZonedDateTime.now(ZoneId.of("America/New_York")));
	}
}