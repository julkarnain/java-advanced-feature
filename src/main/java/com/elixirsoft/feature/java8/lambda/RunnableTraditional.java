package com.elixirsoft.feature.java8.lambda;

public class RunnableTraditional {
	public static void main(String[] args) {
		
		// Traditional 	
		Runnable runnableTraditional = new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				int sum = 0;
				for (int i = 1; i < 10; i++) {
					sum += i;
				}
				System.out.println("Traditional :" + sum);
			}
		};
		
		new Thread(runnableTraditional).start();		
		
		// Lambda 		
		Runnable runnableLambda = () -> {
			int sum = 0;
			for (int i = 1; i < 10; i++) {
				sum += i;
			}

			System.out.println("Lambda :" + sum);
		};
		new Thread(runnableLambda).start();	
		
		// Thread 
		new Thread(() -> {
			int sum = 0;
			for (int i = 1; i < 10; i++) {
				sum += i;
			}
			System.out.println("Thread :" + sum);
		}).start();	
	}
}
