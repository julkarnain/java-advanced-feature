package com.elixirsoft.feature.java8.datetime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class InstantExercise {

	public static void main(String[] args) {
		Instant instantStart = Instant.now();
		System.out.println("Instant getNano = " + instantStart.getNano());
		
		Instant instantEnd = Instant.now().plusSeconds(3600);
		Duration duration = Duration.between(instantStart, instantEnd);
		System.out.println("duration.toSeconds() = " + duration.toHours());
		
		LocalDateTime localDateTime = LocalDateTime.ofInstant(instantStart, ZoneId.systemDefault());
		System.out.println("ofInstant = " + localDateTime);
	}
}
