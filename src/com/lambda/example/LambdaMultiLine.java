package com.lambda.example;

interface Message {
	String show();
}

public class LambdaMultiLine {

	public static void main(String[] args) {

		Message m = () -> {
			String msg = "Welcome";
			return msg + "to Lambda";
		};
		System.out.println(m.show());
	}
}
