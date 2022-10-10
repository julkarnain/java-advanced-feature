package com.elixirsoft.feature.java8.parallel_stream;

import java.util.stream.IntStream;

public class ParallelStreamBasicExercise {

	public static void main(String[] args) {

		System.out.println("Sequential " + sumSequentialStream());
		System.out.println("Parallel " + sumParallelStream());
	}

	public static int sumSequentialStream() {

		return IntStream.rangeClosed(0, 50000).sum();
	}

	public static int sumParallelStream() {

		return IntStream.rangeClosed(0, 50000).parallel().sum();
	}
}
