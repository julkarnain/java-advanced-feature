package com.elixirsoft.feature.java8.functional;

import java.util.function.BiConsumer;

public class BiConsumerBasicExcercise {
	
	public static void main(String[] args) {
		
		BiConsumer<Integer, Integer> biConsumer1 = (x, y) -> {
			System.out.println("X : " + x + " " + "Y :"+y);
		};
		biConsumer1.accept(20, 10);
		
		BiConsumer<String, String> biConsumer2 = (x, y) -> {
			System.out.println(x+ " " +y);
		};
		biConsumer2.accept("Hello", "World");
	}
}
