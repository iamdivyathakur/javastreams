package com.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStreamDemo2 {
	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Divya","Priya","Kriti","Anushka","Tanisha","Priyanka");
		
		List<String> namesSting = new ArrayList<String>();
		
	 	namesSting = names.stream().filter(n->n.length()>6 && n.length()<8).collect(Collectors.toList());
	 	
	 	names.stream().filter(n->n.length()>6 && n.length()<8).forEach(n->System.out.println(n));
	 	
	 	System.out.println("**********\n");
	 	
	 	names.stream().filter(n->n.length()>6 && n.length()<8).forEach(System.out::println);
	 	
	 	System.out.println("**********\n");
	 	
	 	System.out.println(namesSting);
	}

}
