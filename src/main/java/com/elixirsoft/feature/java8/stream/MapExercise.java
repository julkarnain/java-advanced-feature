package com.elixirsoft.feature.java8.stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.elixirsoft.feature.java8.functional.Trainer;
import com.elixirsoft.feature.java8.functional.Trainers;

public class MapExercise {

	public static void main(String[] args) {
		
		List<Trainer> trainers = Trainers.getAll();
		
		// List maintains Order and allow duplicate
		List<String> nameList = trainers.stream()
							.map(t -> t.getName())
							.map(t -> t.toUpperCase())
							.collect(Collectors.toList());
		
	    System.out.println(nameList);
	    
	    // Set doesn't maintain Order and doesn't allow duplicate
	    Set<String> nameSet = trainers.stream()
				.map(t -> t.getName())
				.map(t -> t.toUpperCase())
				.collect(Collectors.toSet());

	    System.out.println(nameSet);

	}
}
