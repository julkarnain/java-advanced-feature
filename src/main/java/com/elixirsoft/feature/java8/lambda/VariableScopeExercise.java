package com.elixirsoft.feature.java8.lambda;

import java.util.List;

import com.elixirsoft.feature.java8.functional.Trainer;
import com.elixirsoft.feature.java8.functional.Trainers;

public class VariableScopeExercise {

	static int k = 10;

	public static void main(String[] args) {

		List<Trainer> trainers = Trainers.getAll();

		// Can not declare with same name as scope variable as well as lambda expression
		// In this scope it is final or effectively final
		// int k = 0;

		trainers.forEach(trainer -> {
			System.out.println(k);
		});

		k++;
	}
}
