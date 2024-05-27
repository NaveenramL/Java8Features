package com.example.datetimeapi;

import java.time.LocalDateTime;

public class PrintCurrentDayOfTheWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDateTime localDateandTime = LocalDateTime.now();
		System.out.println("Printing the name of current day of the week : "+localDateandTime.getDayOfWeek().toString());

	}

}
