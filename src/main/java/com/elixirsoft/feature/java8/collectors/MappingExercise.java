package com.elixirsoft.feature.java8.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.elixirsoft.feature.java8.functional.Trainer;
import com.elixirsoft.feature.java8.functional.Trainers;

public class MappingExercise {
	
	public static void main(String[] args) {
		
		
		List<Trainer> trainers = Trainers.getAll();
		
		List<String> nameList = trainers.stream().map(Trainer::getName).collect(Collectors.toList());
		nameList.forEach(System.out::println);
		
		System.out.println("---------------------------------------------");
		
		nameList = trainers.stream().collect(Collectors.mapping(Trainer::getName, Collectors.toList()));
		
		nameList.forEach(System.out::println);
		
		Map<Integer, List<String>> mapYearOfExpWithName = trainers.stream().collect(Collectors.groupingBy(Trainer::getYearOfExperience,Collectors.mapping(Trainer::getName, Collectors.toList())));
		
		mapYearOfExpWithName.forEach((k,v) -> {
			System.out.println("Key ="+ k + " " + "Value =" + v);
		});
	}

}
