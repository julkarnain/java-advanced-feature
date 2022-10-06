package com.elixirsoft.feature.java8.stream;

import java.util.Random;
import java.util.stream.IntStream;

public class IntStreamExercise {

	public static void main(String[] args) {
		
		System.out.println("Using Of---------------------");
		
		IntStream numbers = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		numbers.forEach(System.out::println);
		
		System.out.println("Using Iterate----------------");
		
		numbers = IntStream.iterate(2, i -> i + 2).limit(5);
		
		numbers.forEach(System.out::println);
		
		System.out.println("Using generate---------------");
		
		numbers = IntStream.generate(new Random() :: nextInt).limit(6);
		
		numbers.forEach(System.out::println);
		
		System.out.println("Using range------------------");
		
		numbers = IntStream.range(0, 10);
		
		numbers.forEach(System.out::println);		
		
		System.out.println("Using range closed-----------");
		
		numbers = IntStream.rangeClosed(0, 10);
		
		numbers.forEach(System.out::println);	
	}
}
