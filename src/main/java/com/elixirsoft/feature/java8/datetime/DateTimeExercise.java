package com.elixirsoft.feature.java8.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class DateTimeExercise {
	
	public static void main(String[] args) {
		
		Date dateObj = new Date();
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println("yyyy-MM-dd : " + df.format(dateObj));
		
		df = new SimpleDateFormat("hh:mm:ss");
		
		System.out.println("hh:mm:ss : " + df.format(dateObj));
		
		System.out.println(Calendar.getInstance().getTime());
		
		LocalDate localDate = LocalDate.now();
		System.out.println("Local Date : " + localDate);
		
		LocalTime localTime = LocalTime.now();
		System.out.println("Local Time : " + localTime);
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("Local DateTime : " + localDateTime);
		
	}

}
