package com.elixirsoft.feature.java8.functional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionAdvancedExercise {

	public static void main(String[] args) {
		
		List<Trainer> trainer_all = Trainers.getAll();

		Predicate<Boolean> p1 = (online) -> online == true;
		
		Function<List<Trainer>, Map<String, Integer>> mapFunction = (trainers -> {
			Map<String, Integer> map = new HashMap<String, Integer>();
			trainers.forEach(trainer -> {
				if(p1.test(trainer.isOnline()))
					map.put(trainer.getName(), trainer.getYearOfExperience());
			});

			return map;
		});
		
		System.out.println(mapFunction.apply(trainer_all));
	}
}
