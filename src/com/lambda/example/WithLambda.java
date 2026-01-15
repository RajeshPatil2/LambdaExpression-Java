package com.lambda.example;

interface Sayable1 {
	void say();
}

public class WithLambda {

	public static void main(String[] args) {
		Sayable1 s1 = () -> System.out.println("Hello (with Lambda)");
		s1.say();
	}

}
