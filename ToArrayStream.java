package com.example.stream;

import java.util.Arrays;
import java.util.List;

public class ToArrayStream {

	public static void main(String[] args) {
		
		List<String> stringList = Arrays.asList("A","B","C","D","E");
		
		Object arr[] = stringList.stream().toArray();
		
		System.out.println(arr.length);
		
		for(Object a : arr) {
			System.out.println(a);
		}

	}

}
