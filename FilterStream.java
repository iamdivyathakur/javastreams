package com.example.stream;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStream {

	public static void main(String[] args) {
		
		List<Integer> numlist = Arrays.asList(10,15,20,23,28,30);
		
		List<Integer> evenNumList = new ArrayList<Integer>();
		
		//without using stream
		
//		for(int n : numlist) {
//			if(n%2==0) {
//				evenNumList.add(n);
//			}
//		}
//		System.out.println(evenNumList);
		
		
		//using stream
		
		evenNumList = numlist.stream().filter(n->n%2==0).collect(Collectors.toList());
		
//		OR
		
		numlist.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		
//		OR
		
		numlist.stream().filter(n->n%2==0).forEach(System.out::println);
		
		
		System.out.println(evenNumList);
		
		
	}

}
