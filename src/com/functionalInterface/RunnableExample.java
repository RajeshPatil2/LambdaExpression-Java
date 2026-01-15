package com.functionalInterface;
/*1Runnable - Used for Multithreading
 * Single method : void run()
 * 
 */

public class RunnableExample {

	public static void main(String[] args) {

		Runnable task = () -> {
			System.out.println("Thread is Running..!!");
		};

		Thread th = new Thread(task); // passing lambda
		th.start(); // run()
//		method called internally
	}

}
