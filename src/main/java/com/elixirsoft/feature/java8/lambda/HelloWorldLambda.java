package com.elixirsoft.feature.java8.lambda;

public class HelloWorldLambda {
	public static void main(String[] args) {
	
		// Lambda Expression
		HelloWorldInterface sayHelloWorld1 = () -> {
			return "Hello World !";
		};
		
		HelloWorldInterface sayHelloWorld2 = () ->  "Hello World !";		

		System.out.println(sayHelloWorld1.sayHelloWorld());
		System.out.println(sayHelloWorld2.sayHelloWorld());
	};
}
