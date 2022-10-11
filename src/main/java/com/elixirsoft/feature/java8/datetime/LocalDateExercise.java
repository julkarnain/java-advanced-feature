package com.elixirsoft.feature.java8.datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExercise {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.now();
		System.out.println("Local Date : " + localDate);

		// Plus
		System.out.println("Local Date Plus days: " + localDate.plusDays(4));

		System.out.println("Local Date Plus months : " + localDate.plusMonths(4));

		System.out.println("Local Date Plus years: " + localDate.plusYears(4));

		// Minus
		System.out.println("Local Date Minus days: " + localDate.minusDays(4));

		System.out.println("Local Date Minus months : " + localDate.minusMonths(4));

		System.out.println("Local Date Minus years : " + localDate.minusYears(4));

		// With
		System.out.println("Local Date With : " + localDate.withMonth(4));

		System.out.println("Local Date With Chrono Field : " + localDate.with(ChronoField.YEAR, 2025));

		System.out.println("Local Date With TemporalAdjusters : " + localDate.with(TemporalAdjusters.lastDayOfMonth()));

		localDate = LocalDate.ofYearDay(2017, 120);
		System.out.println("Local Date Year of Day : " + localDate);

		localDate = LocalDate.of(2017, 10, 22);
		System.out.println("Local Date Year of Day : " + localDate);

		localDate = LocalDate.of(2017, 10, 22);
		System.out.println("Local Date Get Month : " + localDate.getMonth());

		System.out.println("Local Date Get Year : " + localDate.getYear());

		System.out.println("Local Date Get Day of Month : " + localDate.getDayOfMonth());

		System.out.println("Local Date Get Value of Month : " + localDate.getMonthValue());

		System.out.println("Local Date Get Day of Year : " + localDate.getDayOfYear());

		System.out.println("Local Date Get Day of Week : " + localDate.getDayOfWeek());

		System.out.println("Local Date Chrono Field Day of Month : " + localDate.get(ChronoField.DAY_OF_MONTH));

		System.out.println("Local Date Chrono Field Month of Year : " + localDate.get(ChronoField.DAY_OF_YEAR));
	}
}