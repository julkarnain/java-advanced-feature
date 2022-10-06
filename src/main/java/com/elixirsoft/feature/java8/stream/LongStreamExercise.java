package com.elixirsoft.feature.java8.stream;

import java.util.Random;
import java.util.stream.LongStream;

public class LongStreamExercise {

	public static void main(String[] args) {
		
		System.out.println("Using Of---------------------");
		
		LongStream numbers = LongStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		numbers.forEach(System.out::println);
		
		System.out.println("Using Iterate----------------");
		
		numbers = LongStream.iterate(2, i -> i + 2).limit(5);
		
		numbers.forEach(System.out::println);
		
		System.out.println("Using generate---------------");
		
		numbers = LongStream.generate(new Random() :: nextLong).limit(6);
		
		numbers.forEach(System.out::println);
		
		System.out.println("Using range------------------");
		
		numbers = LongStream.range(0, 10);
		
		numbers.forEach(System.out::println);		
		
		System.out.println("Using range closed-----------");
		
		numbers = LongStream.rangeClosed(0, 10);
		
		numbers.forEach(System.out::println);	
	}
}
