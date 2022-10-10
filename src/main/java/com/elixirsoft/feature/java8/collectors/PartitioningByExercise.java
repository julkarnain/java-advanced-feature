package com.elixirsoft.feature.java8.collectors;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.elixirsoft.feature.java8.functional.Trainer;
import com.elixirsoft.feature.java8.functional.Trainers;

public class PartitioningByExercise {

	public static void main(String[] args) {

		List<Trainer> trainers = Trainers.getAll();

		Predicate<Trainer> p1 = (t) -> t.getYearOfExperience() > 10;

		Map<Boolean, List<Trainer>> partitioningList = trainers.stream().collect(Collectors.partitioningBy(p1, Collectors.toList()));

		partitioningList.forEach((k, v) -> {
			String concateNames = v.stream().map(Trainer::getName).collect(Collectors.joining(",", "{", "}"));
			System.out.println("Key = " + k + " " + "Value = " + concateNames);
		});
		
		Map<Boolean, Set<Trainer>> partitioningSet = trainers.stream().collect(Collectors.partitioningBy(p1, Collectors.toSet()));

		partitioningSet.forEach((k, v) -> {
			String concateNames = v.stream().map(Trainer::getName).collect(Collectors.joining(",", "{", "}"));
			System.out.println("Key = " + k + " " + "Value = " + concateNames);
		});
	}
}