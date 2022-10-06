package com.elixirsoft.feature.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitAndSkipExercise {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		List<Integer> limitList = numbers.stream().limit(5).collect(Collectors.toList());

		System.out.println(limitList);
		
		List<Integer> skipList = numbers.stream().skip(5).collect(Collectors.toList());

		System.out.println(skipList);
	}
}
