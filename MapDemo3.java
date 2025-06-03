package com.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo3 {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1,3,4,7,8,99,33,5,67);
		
		
//		Without stream
//		
//		for(int n : nums) {
//			System.out.println(n*3);
//		}

		
		List<Integer> numsMultiply = new ArrayList<Integer>();
		
		numsMultiply = nums.stream().map(n->n*3).collect(Collectors.toList());
		
		nums.stream().map(n->n*3).forEach(nm->System.out.println(nm));
		
		nums.stream().map(n->n*3).forEach(System.out::println);
		
		System.out.println(numsMultiply);
	}

}
