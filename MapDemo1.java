package com.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {

	public static void main(String[] args) {
		
		List<String> vehicles= Arrays.asList("divya","kriti","kiara","anushka");
		
		List<String> vehiclesUppercase = new ArrayList<String>();
		
//		for(String name: vehicles) 
//		{
//			vehiclesUppercase.add(name.toUpperCase());
//		}
//		
//		System.out.println(vehiclesUppercase);
		
		
		
		vehiclesUppercase = vehicles.stream()
				.map(name -> name.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(vehiclesUppercase);

	}

}
