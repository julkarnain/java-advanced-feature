package com.elixirsoft.feature.java8.stream;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

public class DoubleStreamExercise {

	public static void main(String[] args) {
		
		System.out.println("Using Of---------------------");
		
		DoubleStream numbers = DoubleStream.of(1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9);
		
		numbers.forEach(System.out::println);
		
		System.out.println("Using Iterate----------------");
		
		numbers = DoubleStream.iterate(2, i -> i + 2).limit(5);
		
		numbers.forEach(System.out::println);
		
		System.out.println("Using generate---------------");
		
		numbers = DoubleStream.generate(new Random() :: nextDouble).limit(6);
		
		numbers.forEach(System.out::println);
		
		System.out.println("Using range------------------");
		
		numbers = LongStream.range(0, 10).asDoubleStream();
		
		numbers.forEach(System.out::println);		
		
		System.out.println("Using range closed-----------");
		
		numbers = LongStream.rangeClosed(0, 10).asDoubleStream();
		
		numbers.forEach(System.out::println);	
	}
}
