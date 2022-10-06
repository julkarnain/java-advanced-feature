package com.elixirsoft.feature.java8.stream;

import java.util.Random;
import java.util.stream.Stream;

public class StreamGeneratorExercise {

	public static void main(String[] args) {

		Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		stream1.forEach(System.out::println);
		
		System.out.println("--------------------------");

		Stream<Integer> stream2 = Stream.iterate(0, i -> i + 2).limit(10);
		stream2.forEach(System.out::println);
		
		System.out.println("--------------------------");
		Stream<Integer> stream3 = Stream.generate(new Random() :: nextInt);
		stream3.forEach(System.out::println);
		
	}
}
