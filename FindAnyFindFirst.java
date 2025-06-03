package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAnyFindFirst {

	public static void main(String[] args) {
		
		List<String> stringList = Arrays.asList("one","two","three","four");
		
//		findAny()
		
		Optional<String> elem = stringList.stream().findAny();
		
		System.out.println(elem.get());
		
//		findFirst()
		
		Optional<String> first = stringList.stream().findFirst();
		
		System.out.println(first.get());
		
		
		
		

	}

}
