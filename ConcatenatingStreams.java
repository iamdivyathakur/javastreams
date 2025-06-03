package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatenatingStreams {

	public static void main(String[] args) {
		
		List<String> string1 = Arrays.asList("dog","cat","peacock","rabbit");
		
		List<String> string2= Arrays.asList("deer","tiger","lion","parrot","eagle","snake");
		
		Stream<String> stream1 = string1.stream();
		
		Stream<String> stream2 = string2.stream();
		
		List<String> finalList = Stream.concat(stream1, stream2).collect(Collectors.toList());
		
		System.out.println(finalList);
		
		for(String item : finalList) {
			System.out.println(item);
		}

	}

}
