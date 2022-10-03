package com.elixirsoft.feature.java8.functional;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BiPredicateAdvancedExercise {

	public static void main(String[] args) {

		List<Trainer> trainers = Trainers.getAll();

		BiPredicate<Boolean, Integer> biPredicate = (oneline, exp) -> oneline == true && exp > 10;

		BiConsumer<String, List<String>> biConsumer = (name, courses) -> {
			System.out.println("Name : " + name + " " + "Courses : " + courses);
		};

		trainers.forEach(trainer -> {
			if (biPredicate.test(trainer.isOnline(), trainer.getYearOfExperience())) {
				biConsumer.accept(trainer.getName(), trainer.getCourses());
			}
		});
	}
}
