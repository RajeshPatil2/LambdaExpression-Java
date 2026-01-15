package com.lambda.example;

interface Multiply {
	int product(int a, int b);
}

public class TypeSkip {

	public static void main(String[] args) {
		Multiply m = (a, b) -> a * b; // type not required

		System.out.println(m.product(4, 5));
	}
}
