package com.example.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedStream {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1,3,4,2,3,5,6,11,7,8,4,9);
		
		System.out.println(nums+"\n");
		
		List<Integer> soretedNums = nums.stream().sorted().collect(Collectors.toList());
		
		System.out.println("Ascending Order : "+soretedNums); 
		
		List<Integer> reversedSortedNums = nums.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		System.out.println("Descending Order : "+reversedSortedNums+"\n");
		
		List<String> names = Arrays.asList("David", "John","Mary","Daisy");
		
		System.out.println(names+"\n");
		
		List<String> soretedNames = names.stream().sorted().collect(Collectors.toList());
		
		System.out.println("Ascending Order : "+soretedNames);
		
		List<String> reverseSortedNames = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		System.out.println("Descending Order : "+reverseSortedNames);
		
		

	}

}
