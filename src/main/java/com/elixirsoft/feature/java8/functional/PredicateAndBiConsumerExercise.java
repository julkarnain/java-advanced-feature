package com.elixirsoft.feature.java8.functional;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class PredicateAndBiConsumerExercise {

	public static void main(String[] args) {
		
		List<Trainer> trainers = Trainers.getAll();
		Predicate<Trainer> p1 = (t) -> t.isOnline() == true;
		Predicate<Trainer> p2 = (t) -> t.getYearOfExperience() > 10;
		
		BiConsumer<String, List<String>> biConsumer1 = (name, courses) -> {
			System.out.println("Name : " + name +" : "+ "Courses :" + courses);
		};
		
		trainers.forEach(trainer -> {
		   if(p1.and(p2).test(trainer)){
			   biConsumer1.accept(trainer.getName(), trainer.getCourses());
		  }
		});
	}

}
