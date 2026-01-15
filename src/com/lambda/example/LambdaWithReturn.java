package com.lambda.example;

// Multiple statement with return : use {} and retunr 
interface Operation {
	int operate(int a, int b);
}

public class LambdaWithReturn {
	public static void main(String[] args) {
		Operation add = (a, b) -> {
			System.out.println("Adding numbers...");
			return a + b;
		};

		System.out.println(add.operate(10, 52));
	}
}
