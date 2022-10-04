package com.elixirsoft.feature.java8.stream;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.elixirsoft.feature.java8.functional.Trainer;
import com.elixirsoft.feature.java8.functional.Trainers;

public class StreamToMapExercise {

	public static void main(String[] args) {

		Predicate<Trainer> p1 = (t) -> t.isOnline();
		Predicate<Trainer> p2 = (t) -> t.getYearOfExperience() > 10;

		List<Trainer> trainers = Trainers.getAll();

		Map<String, List<String>> map = trainers.stream()
				//.peek(t -> {System.out.println(t.getName());})
				.peek(System.out::println)
				.filter(p1)
				.peek(t -> {System.out.println(t.getName());})
				.filter(p2)
				.peek(t -> {System.out.println(t.getName());})
				.collect(Collectors.toMap(Trainer::getName, Trainer::getCourses));

		System.out.println(map);
	}
}
