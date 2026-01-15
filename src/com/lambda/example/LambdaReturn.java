package com.lambda.example;
// Single statement with return : not required

interface Square {
	int calculate(int x);
}

public class LambdaReturn {

	public static void main(String[] args) {

		Square s = (x) -> x * x;
//	no return or curly braces needed

		System.out.println(s.calculate(5));
	}

}
