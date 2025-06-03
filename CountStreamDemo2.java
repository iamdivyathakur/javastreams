package com.example.stream;

import java.util.Arrays;
import java.util.List;

public class CountStreamDemo2 {

	public static void main(String[] args) {
		
		List<Integer> numeven = Arrays.asList(1,2,3,4,5,6,7,8,9,20);
		
		long count = numeven.stream().filter(n->n%2==0).count();
		
		System.out.println(count);

	}

}
