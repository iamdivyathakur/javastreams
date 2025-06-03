package com.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStreamDemo3 {

	public static void main(String[] args) {
		
		List<String> nullValues = Arrays.asList(null,"Divya","Kriti", null, "Priya", null);
		
		List<String> result = new ArrayList<String>();
		
		result = nullValues.stream().filter(w->w!=null).collect(Collectors.toList()) ;
		
		System.out.println(result);

	}

}
