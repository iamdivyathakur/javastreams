package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceStream {

	public static void main(String[] args) {
		
		List<String> stringname = Arrays.asList("A","B","C","D","1","2","3","4");
		
		System.out.println(stringname);
		
		Optional<String> reduced = stringname.stream().reduce((value,combinedvalue)->{
			return combinedvalue+value;
		});
		
		System.out.println(reduced.get()+"\n");
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,11,22,33,44);
		
		System.out.println(nums);
		
		Optional<Integer> numsadd = nums.stream().reduce((a,b)->{
			return a+b;
		});
		
		System.out.println(numsadd.get());

	}

}
