package com.date_time_api;

import java.time.LocalDate;

public class LocalDateExample {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();// current date
		System.out.println("current date : " + today);

		LocalDate dob = LocalDate.of(1999, 5, 12);// sprcific date
		System.out.println("DOB : " + dob);

	}

}
