package com.elixirsoft.feature.java8.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeToLocalDateAndLocalTimeExercise {

	public static void main(String[] args) {

		// Local Date Time : 2022-10-11T14:54:57.990157400
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("Local Date Time : " + localDateTime);

		System.out.println("Local Date Time to Local Date : " + localDateTime.toLocalDate());
		System.out.println("Local Date Time to Local Time : " + localDateTime.toLocalTime());

		// Local Date Time of : 2022-10-11T14:54:57.991156700
		localDateTime = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		System.out.println("Local Date Time of : " + localDateTime);

	}
}