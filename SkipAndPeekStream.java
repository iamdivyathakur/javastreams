package com.example.stream;

import java.util.List;

public class SkipAndPeekStream {

	public static void main(String[] args) {
		
		List<Integer> list = List.of(1, 2, 3, 4, 5);
		list.stream().skip(2).forEach(System.out::println); // Output: 3 4 5
		
		List<String> names = List.of("John", "Jane", "Jack");
		names.stream()
		    .peek(name -> System.out.println("Processing: " + name))
		    .map(String::toUpperCase)
		    .forEach(System.out::println);


		
	}

}
