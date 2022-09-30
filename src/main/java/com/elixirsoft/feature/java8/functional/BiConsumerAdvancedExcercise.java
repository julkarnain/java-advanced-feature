package com.elixirsoft.feature.java8.functional;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerAdvancedExcercise {

	public static void main(String[] args) {

		List<Trainer> trainers = Trainers.getAll();

		// Example 1
		BiConsumer<String, String> biConsumer1 = (name, title) -> {
			System.out.println(title + " " + name);
		};
		trainers.forEach(trainer -> {
			biConsumer1.accept(trainer.getTitle(), trainer.getName());
		});

		// Example 2
		BiConsumer<String, List<String>> biConsumer2 = (name, courses) -> {
			System.out.println("Name : " + name + " | " + "Courses : " + courses);
		};
		trainers.forEach(trainer -> {
			if (trainer.getYearOfExperience() > 10)
				biConsumer2.accept(trainer.getName(), trainer.getCourses());
		});
	}
}