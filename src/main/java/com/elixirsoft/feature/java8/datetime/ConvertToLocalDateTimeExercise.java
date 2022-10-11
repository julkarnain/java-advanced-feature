package com.elixirsoft.feature.java8.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class ConvertToLocalDateTimeExercise {

	public static void main(String[] args) {

		// java.util.date
		Date dateUtil = new Date();
		LocalDateTime localDateTime = dateUtil.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
		System.out.println("Local Date Time : " + localDateTime);

		// java.sqls.date
		java.sql.Date dateSql = new java.sql.Date(System.currentTimeMillis());
		LocalDate localDate = dateSql.toLocalDate();
		System.out.println("Local Date : " + localDate);
	}
}
