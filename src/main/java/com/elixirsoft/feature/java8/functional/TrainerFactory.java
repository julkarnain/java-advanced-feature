package com.elixirsoft.feature.java8.functional;

import java.util.List;

public interface TrainerFactory {

	public Trainer getTrainer(String name, Integer yearOfExperience, String title, String gender, Boolean isOnline,
			List<String> courses);
}
