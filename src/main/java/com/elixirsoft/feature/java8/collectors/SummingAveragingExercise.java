package com.elixirsoft.feature.java8.collectors;

import java.util.List;
import java.util.stream.Collectors;

import com.elixirsoft.feature.java8.functional.Trainer;
import com.elixirsoft.feature.java8.functional.Trainers;

public class SummingAveragingExercise {

	public static void main(String[] args) {
		
		List<Trainer> trainers = Trainers.getAll();
		
		int sum = trainers.stream().collect(Collectors.summingInt(Trainer::getYearOfExperience));
		System.out.println(sum);
		
		System.out.println("---------------------------");
		
		Double average = trainers.stream().collect(Collectors.averagingInt(Trainer::getYearOfExperience));
		System.out.println(average);
	}
}
