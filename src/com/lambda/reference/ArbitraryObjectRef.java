package com.lambda.reference;

/*3.Reference to an instance method of an arbitrary object of a particular type.
 * Syntax : ClassName :: instanceMethod
 */
import java.util.Arrays;

public class ArbitraryObjectRef {

	public static void main(String[] args) {

		String[] name = { "Charlie", "Alice", "bob", "zakir", "jonu" };

		Arrays.sort(name, String::compareToIgnoreCase);
		for (String n : name) {
			System.out.println(n);
		}
	}

}
