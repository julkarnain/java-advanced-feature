package com.elixirsoft.feature.java8.functional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionAdvancedExercise {
	
	public static void main(String[] args) {
		
		List<Trainer> trainer_all = Trainers.getAll();
		
		Predicate<Trainer> p1 = (t) -> t.isOnline() == false;
		
		BiFunction<List<Trainer>, Predicate<Trainer>, Map<String,Integer>> biFunction = (trainers, predicate) -> {
			
			Map<String, Integer> mapBiFunction = new HashMap<String, Integer>();
			
			trainers.forEach(trainer -> {
				if(predicate.test(trainer)) {
					mapBiFunction.put(trainer.getName(), trainer.getYearOfExperience());
				}
			});
			
			return mapBiFunction;
			
		};
		
		System.out.println(biFunction.apply(trainer_all, p1));
	}
}
