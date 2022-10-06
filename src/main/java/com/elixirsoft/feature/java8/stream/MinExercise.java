package com.elixirsoft.feature.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinExercise {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		Optional<Integer> result1 = numbers.stream().min(Integer::compareTo);

		if (result1.isPresent()) {
			System.out.println(result1.get());
		}
		
		Optional<Integer> result2 = numbers.stream().reduce((a,b) -> a < b ? a : b);

		if (result2.isPresent()) {
			System.out.println(result2.get());
		}
		
		Optional<Integer> result3 = numbers.stream().reduce(Integer::min);

		if (result3.isPresent()) {
			System.out.println(result3.get());
		}
	}
}
