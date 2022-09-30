package com.elixirsoft.feature.java8.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Trainers {

	public static List<Trainer> getAll() {

		List<Trainer> trainers = new ArrayList<Trainer>();

		Trainer trainer1 = new Trainer("Julkar Nain", 12, "PM", "M", true,
				Arrays.asList("Java", "Docker", "Kubernetes", "Big Data"));
		Trainer trainer2 = new Trainer("Muntakim", 3, "Developer", "M", false,
				Arrays.asList("Java", "Docker", "Angular", "Microservice"));
		Trainer trainer3 = new Trainer("Anas", 3, "Developer", "M", true,
				Arrays.asList("Java", "Docker", "Angular", "Microservice"));
		
		trainers.add(trainer1);
		trainers.add(trainer2);
		trainers.add(trainer3);

		return trainers;
	}

}
