package com.elixirsoft.feature.java8.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.elixirsoft.feature.java8.functional.Trainer;
import com.elixirsoft.feature.java8.functional.Trainers;

public class StreamComparatorExercise {

	public static void main(String[] args) {
		
		List<Trainer> trainers = Trainers.getAll();
		
		List<String> nameList  = trainers.stream()
				.sorted(Comparator.comparing(Trainer :: getName))
				.map(Trainer :: getName)
				.collect(Collectors.toList());
		
				nameList.forEach(System.out::println);
		
		List<String> reverseList  = trainers.stream()
				.sorted(Comparator.comparing(Trainer :: getName).reversed())
				.map(Trainer :: getName)
				.collect(Collectors.toList());
				
				reverseList.forEach(System.out::println);
	}
}
