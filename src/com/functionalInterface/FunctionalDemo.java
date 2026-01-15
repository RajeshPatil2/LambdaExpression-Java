package com.functionalInterface;

@FunctionalInterface
interface MyFunctional {
	void display(); // only one abstarct method
	// void m1(); // Error :Multiple abstract method not allowed
}

public class FunctionalDemo {

	public static void main(String[] args) {
		MyFunctional mf = () -> System.out.println("hello function interface");
		mf.display();
	}

}
