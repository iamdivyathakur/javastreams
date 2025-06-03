package com.example.stream;

import java.util.Arrays;
import java.util.List;

public class PrefixStartingWith2 {

	public static void main(String[] args) {
		
		System.out.println("Print numbers starting with 2");
		
		List<Integer> numbers = Arrays.asList(2,33,44,56,78,234,-234,-267,657,254,288,2647,299);
		
		numbers.stream().map(String::valueOf).filter(s->s.startsWith("2") || s.startsWith("-2")).map(Integer::valueOf).forEach(System.out::println);
		
	}

}
