package com.example.datetimeapi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PrintDateSpecifiedFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DateTimeFormatter specifiedFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDateTime localDateandTime = LocalDateTime.now();
		String format = localDateandTime.format(specifiedFormat);
		System.out.println("Printing the date in the specified format : "+format);
	}

}
