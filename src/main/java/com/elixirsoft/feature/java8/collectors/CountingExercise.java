package com.elixirsoft.feature.java8.collectors;

import java.util.stream.Collectors;

import com.elixirsoft.feature.java8.functional.Trainer;
import com.elixirsoft.feature.java8.functional.Trainers;

public class CountingExercise {

	public static void main(String[] args) {
		
		long count = Trainers.getAll().stream().filter(Trainer::isOnline).count();
		System.out.println("Count Element :" + count);
		
		count = Trainers.getAll().stream().filter(Trainer::isOnline).collect(Collectors.counting());
		System.out.println("Counting Element :" + count);
	}

}
