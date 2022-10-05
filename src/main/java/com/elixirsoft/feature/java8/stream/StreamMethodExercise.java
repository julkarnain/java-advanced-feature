package com.elixirsoft.feature.java8.stream;

import java.util.List;
import java.util.stream.Collectors;

import com.elixirsoft.feature.java8.functional.Trainer;
import com.elixirsoft.feature.java8.functional.Trainers;

public class StreamMethodExercise {

	public static void main(String[] args) {

		List<Trainer> trainers = Trainers.getAll();

		// distinct and count

		Long count = trainers.stream()
				.map(Trainer::getCourses)
				.flatMap(List::stream)
				.distinct()
				.count();

		System.out.println("Distinct Data Count : " + count);

		// distinct and sorted

		List<String> courses = trainers.stream()
				.map(Trainer::getCourses)
				.flatMap(List::stream)
				.distinct()
				.sorted()
				.collect(Collectors.toList());

		System.out.println("Courses : " + courses);

		// anyMatch, allMatch and noMatch

		boolean anyMatch = trainers.stream()
				.map(Trainer::getCourses)
				.flatMap(List::stream)
				.anyMatch(m -> m.startsWith("J"));
				

		System.out.println("Any Match : " + anyMatch);
		
		boolean allMatch = trainers.stream()
				.map(Trainer::getCourses)
				.flatMap(List::stream)
				.allMatch(m -> m.startsWith("J"));
				

		 System.out.println("All Match : " + allMatch);
		 
		 boolean noneMatch = trainers.stream()
					.map(Trainer::getCourses)
					.flatMap(List::stream)
					.noneMatch(m -> m.startsWith("J"));
					

			 System.out.println("None Match : " + noneMatch);

	}

}
