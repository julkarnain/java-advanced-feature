package com.elixirsoft.feature.java8.collectors;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.elixirsoft.feature.java8.functional.Trainer;
import com.elixirsoft.feature.java8.functional.Trainers;

public class JoiningExercise {

	public static void main(String[] args) {

		String result = Stream.of("A", "B", "C", "D", "E").collect(Collectors.joining());
		System.out.println(result);
		
		result = Stream.of("A", "B", "C", "D", "E").collect(Collectors.joining(","));
		System.out.println(result);
		
		result = Stream.of("A", "B", "C", "D", "E").collect(Collectors.joining(",","{","}"));
		System.out.println(result);
		
		List<Trainer> trainers = Trainers.getAll();
		result = trainers.stream().map(Trainer::getName).collect(Collectors.joining(",", "{", "}"));
		
		System.out.println("Name Concatenating : " + result);
	}

}
