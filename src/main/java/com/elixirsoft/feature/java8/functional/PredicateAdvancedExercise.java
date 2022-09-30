package com.elixirsoft.feature.java8.functional;

import java.util.List;
import java.util.function.Predicate;

public class PredicateAdvancedExercise {

	public static void main(String[] args) {

		List<Trainer> trainers = Trainers.getAll();
		Predicate<Trainer> predicate1 = (i) -> i.isOnline() == true;
		Predicate<Trainer> predicate2 = (i) -> i.getYearOfExperience() > 10;

		trainers.forEach(trainer -> {

			if (predicate1.and(predicate2.negate()).test(trainer)) {
				System.out.println("== "+ trainer.getName());
			}
			else if(predicate1.and(predicate2).test(trainer)) {
				System.out.println("== && > "+ trainer.getName());
			}
			else if(predicate1.or(predicate2).test(trainer)) {
				System.out.println("== || > "+trainer.getName());
			}
			else {
				System.out.println("............");
			}
		});
	}
}
