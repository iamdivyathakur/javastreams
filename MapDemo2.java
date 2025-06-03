package com.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo2 {

	public static void main(String[] args) {
		
		List<String> vehicles = Arrays.asList("bicycle", "car", "aeroplane","train");
		
//		without using stream
		
//		for(String name: vehicles) {
//			System.out.println(name.length());
//		}
		
		List<String> vehiclesLength = new ArrayList<String>();
		
		vehiclesLength = vehicles.stream().map(n ->n +":"+ n.length()).collect(Collectors.toList());
		
		System.out.println(vehiclesLength+"\n");
		
		
		List<Integer> vehiclesLengthinint = new ArrayList<Integer>();
		
		vehiclesLengthinint = vehicles.stream().map(n->n.length()).collect(Collectors.toList());
		
		System.out.println(vehiclesLengthinint	+"\n");
		
		
		vehicles.stream().map(name->name.length()).forEach(len->System.out.println(len));
		
		
		
		
		
		

	}

}
