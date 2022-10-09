package com.elixirsoft.feature.java8.collectors;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.elixirsoft.feature.java8.functional.Trainer;
import com.elixirsoft.feature.java8.functional.Trainers;

public class MinMaxExercise {
	
	public static void main(String[] args) {
		
		List<Trainer> trainers = Trainers.getAll();
		
		// Minimum years of experience	
		Optional<Trainer> minTrainer = trainers.stream().collect(Collectors.minBy(Comparator.comparing(Trainer::getYearOfExperience)));
		System.out.println(minTrainer.get().getName());
		
		System.out.println("---------------------------");
		
		minTrainer = trainers.stream().min(Comparator.comparing(Trainer::getYearOfExperience));
		System.out.println(minTrainer.get().getName());
		
		System.out.println("---------------------------");
		
		// Maximum years of experience
		Optional<Trainer> maxTrainer = trainers.stream().collect(Collectors.maxBy(Comparator.comparing(Trainer::getYearOfExperience)));
		System.out.println(maxTrainer.get().getName());
		
		System.out.println("---------------------------");
		
		maxTrainer = trainers.stream().max(Comparator.comparing(Trainer::getYearOfExperience));
		System.out.println(maxTrainer.get().getName());
		
	}

}
