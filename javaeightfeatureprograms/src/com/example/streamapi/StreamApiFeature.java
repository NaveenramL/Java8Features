package com.example.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiFeature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		System.out.println(list.stream().map(i -> i*2).reduce(0, (c,e) -> c+e)); // here map method will take input integer and gives output multiplied by 2.
									// reduce method will take two input parameters and gives output as the sum of two inputs.
		
		list.stream().filter(i -> i%2 ==0).forEach(System.out::println); // filter and print only even numbers
		
		list.stream().filter(i -> i%2 !=0).forEach(System.out::println); // filter and print only odd numbers
		
		List<String> names = Arrays.asList("James Gosling", "Rod Johnson", "Linus Torvalds");
		names.stream().map(String::toUpperCase).forEach(System.out::println); // print the output with all string as Upper Case letters
		
		List<List<String>> countriesList = Arrays.asList(
				Arrays.asList("India","Sri Lanka","Japan"),
				Arrays.asList("United Kingdom","Germany","Spain"),
				Arrays.asList("South Africa","Kenya","Zimbabwe"),
				Arrays.asList("United States of America","Canada","Argentina"));
		
		List<String> country = countriesList.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println("Printing all the countries : "+country);
		
		List<Integer> listObject = Arrays.asList(1,2,3,4,5,6,1,5);
		listObject.stream().distinct().forEach(System.out::println); // prints only the distinct numbers
		listObject.stream().sorted().forEach(System.out::println); // prints the output in sorted manner, in ascending order
		listObject.stream().limit(3).forEach(System.out::println); // prints the output upto the specified limit
		
		List<String> cars = Arrays.asList("BMW","Mercedes-Benz","Ambassador","Maruti Suzuki","TATA");
		Object[] carsArray = cars.stream().toArray(); // converting the list to an array
		System.out.println("Printing the car names : "+Arrays.toString(carsArray));
		
		List<Integer> numbers = Arrays.asList(10,23,34,56,89,96,101);
		System.out.println(numbers.stream().min(Integer::compare).get()); // Returns the minimum element of this stream 
		System.out.println(numbers.stream().max(Integer::compare).get()); // Returns the maximum element of this stream 
		System.out.println(numbers.stream().count()); // prints the total count of the input numbers in the list
		System.out.println(numbers.stream().anyMatch(i -> i%2 == 0)); // true if any elements of the stream match the provided Predicate, otherwise false
		System.out.println(numbers.stream().allMatch(i -> i%2 == 0)); // true if either all elements of the stream match the provided Predicate or the stream is empty, otherwise false
		System.out.println(numbers.stream().noneMatch(i -> i%2 == 0)); // true if either no elements of the stream match the provided Predicate or the stream is empty, otherwise f
		
		Stream<Double> randomStream = Stream.generate(Math::random);
		randomStream.forEach(System.out::println); // will generate Random numbers in the double datatype format
		
		Stream<Integer> example = Stream.iterate(1,i->i<10,i->i*2);
		example.forEach(System.out::println);
		
		Stream<String> firstStream = Stream.of("apple", "banana");
		Stream<String> secondStream = Stream.of("orange", "grape");
		Stream<String> concatenatedStream = Stream.concat(firstStream, secondStream);
		concatenatedStream.forEach(System.out::println);
	}

}
