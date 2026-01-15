package com.lambda.reference;

/*4. Reference to Constructor
 * Syntax: ClassName :: new
 */
import java.util.function.Supplier;

class Product {
	public Product() {
		System.out.println("Product Constructor Called..!");
	}
}

public class ConstructorRef {

	public static void main(String[] args) {

		Supplier<Product> su = Product::new;

		Product p = su.get();
	}

}
