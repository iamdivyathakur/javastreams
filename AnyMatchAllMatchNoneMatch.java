package com.example.stream;

import java.util.HashSet;
import java.util.Set;

public class AnyMatchAllMatchNoneMatch {

	public static void main(String[] args) {
		
		Set<String> fruits = new HashSet<String>();
		
		fruits.add("One Mango");
		fruits.add("One apple");
		fruits.add("More grapes");
		fruits.add("Two Apples");
		fruits.add("Three mangoes");
		fruits.add("Four Banana");
		fruits.add("Two Guavas");
		fruits.add("One one");
		
//		AnyMatch
		
		boolean result = fruits.stream().anyMatch(value->{return value.startsWith("One");});
		System.out.println(result+"\n");
		
		boolean result2 = fruits.stream().anyMatch(value->{return value.startsWith("one");});
		System.out.println(result2+"\n");
		
//		AllMatch
		
		boolean result3 = fruits.stream().allMatch(value->{return value.startsWith("one");});
		System.out.println(result3+"\n");
		
		boolean result4 = fruits.stream().allMatch(value->{return value.startsWith("One");});
		System.out.println(result4+"\n");

//		NoneMatch
		
		boolean result5 = fruits.stream().noneMatch(value->{return value.startsWith("one");});
		System.out.println(result5+"\n");
		
		boolean result6 = fruits.stream().noneMatch(value->{return value.startsWith("One");});
		System.out.println(result6+"\n");
		
	}

}
