package com.elixirsoft.feature.java8.functional;

import java.util.Arrays;

public class ConstructorMethodReferenceExercise {

	public static void main(String[] args) {

		TrainerFactory trainerFactory = Trainer::new;

		Trainer trainer = trainerFactory.getTrainer("Julkar", 10, "PM", "Male", false,
				Arrays.asList("CSE", "EEE", "CE"));

		System.out.println(trainer.getName() + " " + trainer.getTitle() + " " + trainer.getYearOfExperience());
	}
}
