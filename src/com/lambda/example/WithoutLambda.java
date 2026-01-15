package com.lambda.example;

interface Sayable {
	void say();
}

public class WithoutLambda {

	public static void main(String[] args) {
		Sayable s = new Sayable() {

			@Override
			public void say() {
				System.out.println("Hello (without Lambda) ");
			}
		};
		s.say();

	}

}
