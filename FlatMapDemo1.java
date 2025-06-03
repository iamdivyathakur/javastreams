package com.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo1 {

	public static void main(String[] args) {
		
		List<List<Integer>> listofIntegers = Arrays.asList(Arrays.asList(1,2),
				Arrays.asList(2,3),
				Arrays.asList(4,5));
		
		System.out.println(listofIntegers);
		
		List<Integer> flatmapint = new ArrayList<Integer>();
				
		flatmapint= listofIntegers.stream().flatMap(x->x.stream()).collect(Collectors.toList());
		
		System.out.println("FlatMap"+flatmapint);
		
		List<Integer> flatmapandmap = new ArrayList<Integer>();
		
		flatmapandmap = listofIntegers.stream().flatMap(x->x.stream()).map(n->n*5).collect(Collectors.toList());
		
		System.out.println("Using FlatMap and Map"+flatmapandmap);
				
	}

}
