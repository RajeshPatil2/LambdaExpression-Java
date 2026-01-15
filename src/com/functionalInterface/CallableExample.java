package com.functionalInterface;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 * Callable<T> - also used in multithreading, but returns a result
 * single method : T call() throws Exception
 */
public class CallableExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Callable<String> t = () -> {
			return "Callable Result:";
		};

		ExecutorService es = Executors.newSingleThreadExecutor();

		Future<String> result = es.submit(t);

		System.out.println(result.get()); // waits and gets the result
		es.shutdown();

	}

}
