package com.elixirsoft.feature.java8.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.elixirsoft.feature.java8.functional.Trainer;
import com.elixirsoft.feature.java8.functional.Trainers;

public class FilterExercise {
	
	public static void main(String[] args) {

		List<Trainer> trainers = Trainers.getAll();
		
		List<Trainer> trainerList =  trainers.stream()
						.filter(trainer -> trainer.getYearOfExperience() > 1)
						.sorted(Comparator.comparing(Trainer :: getName))
						.collect(Collectors.toList());
		
		trainerList.forEach(t -> {
			System.out.println(t.getName());
		});
	}
}
