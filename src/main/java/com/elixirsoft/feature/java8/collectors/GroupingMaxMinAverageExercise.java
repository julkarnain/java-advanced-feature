package com.elixirsoft.feature.java8.collectors;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.elixirsoft.feature.java8.functional.Trainer;
import com.elixirsoft.feature.java8.functional.Trainers;

public class GroupingMaxMinAverageExercise {

	public static void main(String[] args) {

		List<Trainer> trainers = Trainers.getAll();

		System.out.println("---------------------------------------------------");

		Map<Boolean, Optional<Trainer>> maxBy = trainers.stream().collect(Collectors.groupingBy(Trainer::isOnline,
				Collectors.maxBy(Comparator.comparing(Trainer::getYearOfExperience))));

		maxBy.forEach((k, v) -> {

			String concateNames = v.stream().map(Trainer::getName).collect(Collectors.joining(",", "{", "}"));

			System.out.println("Key : " + k + " " + "Value : " + concateNames);

		});

		System.out.println("---------------------------------------------------");

		Map<Boolean, Trainer> collectingAndThen = trainers.stream()
				.collect(Collectors.groupingBy(Trainer::isOnline, Collectors.collectingAndThen(
						Collectors.maxBy(Comparator.comparing(Trainer::getYearOfExperience)), Optional::get)));

		collectingAndThen.forEach((k, v) -> {

			System.out.println("Key : " + k + " " + "Value : " + v.getName());
		});

		System.out.println("---------------------------------------------------");

		Map<Boolean, Double> averagingInt = trainers.stream().collect(
				Collectors.groupingBy(Trainer::isOnline, Collectors.averagingInt(Trainer::getYearOfExperience)));

		averagingInt.forEach((k, v) -> {

			System.out.println("Key : " + k + " " + "Value : " + v);

		});

		System.out.println("---------------------------------------------------");

		Map<Boolean, IntSummaryStatistics> summingInt = trainers.stream().collect(
				Collectors.groupingBy(Trainer::isOnline, Collectors.summarizingInt(Trainer::getYearOfExperience)));

		summingInt.forEach((k, v) -> {

			System.out.println("Key : " + k + " " + "Sum : " + v.getSum() + " " + "Max : " + v.getMax() + " " + "Min : " + v.getMin() + " " + "Avg : " + v.getAverage());
			//System.out.println("Max : " + k + " " + "Value : " + v.getMax());
			//System.out.println("Min : " + k + " " + "Value : " + v.getMin());
			
			System.out.println("---------------------------------------------------");

		});
	}
}