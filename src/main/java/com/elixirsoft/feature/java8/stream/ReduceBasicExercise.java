package com.elixirsoft.feature.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceBasicExercise {

	public static void main(String[] args) {

		List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		List<Integer> emptyList = Arrays.asList();

		// 0 + 1 = 1
		// 1 + 2 = 3
		// 3 + 3 = 6
		// 6 + 4 = 10
		// 10 + 5 = 15
		// 15 + 6 = 21
		// 21 + 7 = 28
		// 28 + 8 = 36
		// 36 + 9 = 45

		int result1 = numberList.stream()
				.reduce(0, (a, b) -> a + b);

		System.out.println(result1);

		// 1 * 1 = 1
		// 1 * 2 = 2
		// 2 * 3 = 6
		// 6 * 4 = 24

		int result2 = numberList.stream()
				.reduce(1, (a, b) -> a * b);

		System.out.println(result2);

		Optional<Integer> result3 = emptyList.stream().reduce((a, b) -> a + b);

		if (result3.isPresent()) {
			System.out.println("Is Present : " + result3);
		}
		if (result3.isEmpty()) {
			System.out.println("Is Empty : " + result3.get());
		}

	}
}
