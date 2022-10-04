package com.elixirsoft.feature.java8.functional;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceExercise {

	public static void main(String[] args) {
		
		// Basic exercise for MethodReference 
		Function<Integer, Double> f1 = t -> Math.sqrt(t);
		System.out.println(f1.apply(5));

		Function<Integer, Double> f2 = Math::sqrt;
		System.out.println(f2.apply(5));

		Function<String, String> f3 = t -> t.toLowerCase();
		System.out.println(f3.apply("HELLO"));

		Function<String, String> f4 = String::toLowerCase;
		System.out.println(f4.apply("HELLO"));
		
		// Method conversion 
		Predicate<Trainer> p1 = MethodReferenceExercise::isTheCourseOnline;

		System.out.println(p1.test(new Trainer("Julkar", 10, "PM", "Male", false, Arrays.asList("CSE", "EEE", "CE"))));

		Predicate<Trainer> p3 = MethodReferenceExercise::isTheYearOfExperienceGreaterThan10;
		System.out.println(p3.test(new Trainer("Julkar", 10, "PM", "Male", false, Arrays.asList("CSE", "EEE", "CE"))));

		Trainers.getAll().forEach(trainer -> {
			if(p1.test(trainer))
				System.out.println(trainer.getName());
		});
	}

	private static boolean isTheYearOfExperienceGreaterThan10(Trainer i) {
		if (i.getYearOfExperience() > 10)
			return true;
		return false;
	}

	private static boolean isTheCourseOnline(Trainer t) {
		if (t.isOnline() == true)
			return true;

		return false;
	}
}
