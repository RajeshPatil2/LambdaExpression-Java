package com.lambda.example;

@FunctionalInterface
interface MyInterface2 {
	Sample get(); // //functional interface with method returning object
}

class Sample {
	public Sample() {
		System.out.println("Constructor called using constructor reference");
	}
}

public class ConstructorReferenceExample {

	public static void main(String[] args) {

		// Constructor Reference
		MyInterface2 ref = Sample::new;

		// calling get() -> it calls constructor
		Sample obj = ref.get();
	}

}
