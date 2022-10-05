package com.elixirsoft.feature.java8.stream;

import java.util.List;
import java.util.Optional;

import com.elixirsoft.feature.java8.functional.Trainer;
import com.elixirsoft.feature.java8.functional.Trainers;

public class ReduceAdvancedExercise {

	public static void main(String[] args) {

		List<Trainer> trainers = Trainers.getAll();

		// Print the name who has the highest year of experience

		Optional<Trainer> trainer1 = trainers.stream()
						.reduce((t1, t2) -> {
							if (t1.getYearOfExperience() > t2.getYearOfExperience())
								return t1;
							else
								return t2;
						});
		
		Optional<Trainer> trainer2 = trainers.stream()
				.reduce((t1, t2) -> t1.getYearOfExperience() > t2.getYearOfExperience() ? t1 : t2);

		if (trainer1.isPresent() && trainer2.isPresent()) {

			System.out.println(trainer1.get().getName());

		}
	}

}
