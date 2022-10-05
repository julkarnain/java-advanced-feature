package com.elixirsoft.feature.java8.stream;

import java.util.List;

import com.elixirsoft.feature.java8.functional.Trainer;
import com.elixirsoft.feature.java8.functional.Trainers;

public class MapFilterReduceExercise {

	public static void main(String[] args) {

		List<Trainer> trainers = Trainers.getAll();

		int result = trainers.stream()
				.filter(Trainer::isOnline)
				.map(Trainer::getYearOfExperience)
				//.reduce(0, (a, b) -> a + b); // same
				.reduce(0, Integer::sum); // same as

		System.out.println(result);
	}

}
