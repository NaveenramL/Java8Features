package com.example.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class PrintCurrentDateAndTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate localDate = LocalDate.now();
		System.out.println("Printing the current date : "+localDate);
		
		LocalTime localTime = LocalTime.now();
		System.out.println("Printing the current time  : "+localTime);
		
		LocalDateTime localDateandTime = LocalDateTime.now();
		System.out.println("Priting the current date and current time : "+localDateandTime);
	}

}
