package com.elixirsoft.feature.java8.parallel_stream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class PerformanceComparingExercise {

	public static void main(String[] args) {

		int loop = 20;
		
		long result1 = measurePerformance(PerformanceComparingExercise::sumSequentialStream, loop);
		
		System.out.println("Sequential Performance : " + result1);
		
		long result2 = measurePerformance(PerformanceComparingExercise::sumParallelStream, loop);
		
		System.out.println("Parallel Performance : " + result2);
	}

	public static long measurePerformance(Supplier<Integer> supplier, int numberOfTimes) {

		long startTime = System.currentTimeMillis();

		for (int i = 0; i < numberOfTimes; i++) {
			supplier.get();
		}
		long endTime = System.currentTimeMillis();

		return endTime - startTime;
	}

	public static int sumSequentialStream() {

		return IntStream.rangeClosed(0, 500000).sum();
	}

	public static int sumParallelStream() {

		return IntStream.rangeClosed(0, 500000).parallel().sum();
	}
}
