package com.elixirsoft.feature.java8.functional;

import java.util.function.Consumer;

public class ConsumerBasicExcercise {

	public static void main(String[] args) {

		Consumer<Integer> consumerExcercise1 = (x) -> {
			System.out.println("Consumer Accept Integer Value : " + x);
		};
		consumerExcercise1.accept(10);
		
		Consumer<String> consumerExcercise2 = (x) -> {
			System.out.println("Consumer Accept String Value : " + x);
		};
		
		consumerExcercise2.accept("Functional Interface Consumer Implementation");
	}
}
