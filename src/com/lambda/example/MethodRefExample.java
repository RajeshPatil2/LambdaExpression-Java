package com.lambda.example;

@FunctionalInterface
interface MyInterface1 {
	void show();

}

public class MethodRefExample {

	public static void display() {
		System.out.println("Static Method Reference..!!");
	}

	public static void main(String[] args) {
		MyInterface1 obj = MethodRefExample::display;
		
		// method ref to static method
		obj.show();// calling the method
	}

}
