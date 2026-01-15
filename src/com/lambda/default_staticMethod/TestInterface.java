package com.lambda.default_staticMethod;

interface MyInterface {
	// default method
	default void show() {
		System.out.println("this is a default method...");
	}

	// static method
	static void display() {
		System.out.println("this is a static method...");
	}
}

class MyClass implements MyInterface {
	// optionally override default method
	public void show() {
		System.out.println("Default Method overridden in MyClass");
	}
}

public class TestInterface {

	public static void main(String[] args) {
		MyClass obj = new MyClass();
		// call default method via object
		obj.show();

		// call static method via interface name
		MyInterface.display();
	}
}
