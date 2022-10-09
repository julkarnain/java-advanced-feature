package com.elixirsoft.feature.java8.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.elixirsoft.feature.java8.functional.Trainer;
import com.elixirsoft.feature.java8.functional.Trainers;

public class GroupingByExercise {
	
	public static void main(String[] args) {

		List<String> names = List.of("Sayed", "Mike", "Jenny", "Gene", "Rajib");
		Map<Integer, List<String>> groupingByLength = names.stream().collect(Collectors.groupingBy(String::length));

		System.out.println(groupingByLength);

		System.out.println("-----------------------------");

		List<Trainer> trainers = Trainers.getAll();
		Map<String, List<Trainer>> groupingByGender = trainers.stream()
				.collect(Collectors.groupingBy(Trainer::getGender));

		groupingByGender.forEach((k, v) -> {
			String concateNames = v.stream().map(Trainer::getName).collect(Collectors.joining(",", "{", "}"));
			System.out.println("Key = " + k + " : " + "Value = " + concateNames);
		});
	}
}