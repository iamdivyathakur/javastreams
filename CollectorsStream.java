package com.example.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsStream {

	public static void main(String[] args) {
		
//		 Collectors.joining()
		
		List<String> list = List.of("Java", "Python", "Go");
		String result = list.stream().collect(Collectors.joining(", "));
		System.out.println(result); 
		
		
//		Collectors.groupingBy()

		Map<String, List<String>> results = List.of("apple", "banana", "apricot", "blueberry")
			    .stream()
			    .collect(Collectors.groupingBy(word -> word.substring(0,1)));
			System.out.println(results);
			

//		Collectors.partitioningBy()
			
		Map<Boolean, List<Integer>> result3 = List.of(1, 2, 3, 4, 5)
				    .stream()
				    .collect(Collectors.partitioningBy(num -> num % 2 == 0));
				System.out.println(result3);
				
				
//		 Collectors.counting()
		 
		 long count = List.of("a", "b", "c").stream().collect(Collectors.counting());
		 System.out.println(count); 
		 
		 
//		 Collectors.summingInt()
		 
		 int total = List.of("a", "bb", "ccc").stream()
				    .collect(Collectors.summingInt(String::length));
				System.out.println(total); 

			
	}

}
