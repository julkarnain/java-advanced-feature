package com.elixirsoft.feature.java8.functional;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerAdvancedExcercise {

	public static void main(String[] args) {
		
		Consumer<Trainer> c1 = (s1) -> {
			System.out.println(s1.getName()+"  "+ s1.getTitle());
		};
		
		// For Single Object
		System.out.println("============================Single Object ======================================");
		c1.accept(new Trainer("Anonymous", 0, "PM", "M", false, null));
		
		// For multiple Object 
		System.out.println("============================Multiple Object ====================================");
		List<Trainer> trainers = Trainers.getAll();
		trainers.forEach(c1);
		
		// For multiple Object 
		System.out.println("============================Print c1 and then c2 ===============================");
		Consumer<Trainer> c2 = (s2) -> {
			System.out.println(s2.getCourses());
		};
		trainers.forEach(c1.andThen(c2));
		
		// For conditional statement or comparison
		System.out.println("============================Data Compare or Condition =========================");
		trainers.forEach(trainer -> {
			if(trainer.getYearOfExperience()>1 && trainer.isOnline())
				c1.andThen(c2).accept(trainer);
		});
	}
}
