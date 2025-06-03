package com.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitStream {

	public static void main(String[] args) {
		
		List<String> vehicles = Arrays.asList("car","train","aeroplane","bicycle","car","bus","bus","bicycle","car","bus","bus","bicycle","car","bus");
		
		System.out.println(vehicles);
		
		List<String> distinctvehicles = new ArrayList<String>();
		
		distinctvehicles = vehicles.stream().distinct().collect(Collectors.toList());
		
		System.out.println(distinctvehicles);
		
		List<String>  vehiclesList = vehicles.stream().limit(4).collect(Collectors.toList());
		
		System.out.println("Limited vehicles : "+vehiclesList);

	}

}
