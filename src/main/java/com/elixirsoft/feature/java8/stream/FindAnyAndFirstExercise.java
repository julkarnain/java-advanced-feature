package com.elixirsoft.feature.java8.stream;

import java.util.List;
import java.util.Optional;

import com.elixirsoft.feature.java8.functional.Trainer;
import com.elixirsoft.feature.java8.functional.Trainers;

public class FindAnyAndFirstExercise {
	
	public static void main(String[] args) {
		
		List<Trainer> trainers = Trainers.getAll();
		
		Optional<Trainer> trainer1 = trainers.stream().findAny();
		Optional<Trainer> trainer2 = trainers.stream().findFirst();
		
		if(trainer1.isPresent())
			System.out.println("Find Any : " + trainer1.get().getName());
		
		if(trainer2.isPresent())
			System.out.println("Find First : " + trainer2.get().getName());
	}
}
