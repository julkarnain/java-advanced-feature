package com.elixirsoft.feature.java11.var;

import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.elixirsoft.feature.java8.functional.Trainer;
import com.elixirsoft.feature.java8.functional.Trainers;

public class VarLambdaExercise {

	public static void main(String[] args) {

		var trainers = Trainers.getAll();

		Predicate<Trainer> p1 = (s) -> s.getYearOfExperience() > 10;
		trainers.forEach(trainer -> {
			if (p1.test(trainer)) {
				var name = trainer.getName();
				System.out.println("Trainer Name : " + name);
			}
		});
		
		BiFunction<Integer, Integer, Integer> sum = (var x , var y) -> x + y;
		
		System.out.println(sum.apply(10, 20));
	}

}