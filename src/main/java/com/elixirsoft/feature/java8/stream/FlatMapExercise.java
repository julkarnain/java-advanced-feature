package com.elixirsoft.feature.java8.stream;

import java.util.List;
import java.util.stream.Collectors;

import com.elixirsoft.feature.java8.functional.Trainer;
import com.elixirsoft.feature.java8.functional.Trainers;

/*
 * FlatMap is a combination of a map and flat operation
 * It is used to flatten the stream 
 * 
 */

public class FlatMapExercise {

	public static void main(String[] args) {
		
		List<Trainer> trainers = Trainers.getAll();
		List<String> trainingCourseList = trainers.stream()
										.map(Trainer :: getCourses)
										.flatMap(List :: stream)
										.collect(Collectors.toList());
		
		System.out.println(trainingCourseList);

	}

}
