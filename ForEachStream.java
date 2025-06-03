package com.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachStream {

	public static void main(String[] args) {
		
		List<String> languages = Arrays.asList("Hindi","English","Kannada","Marathi","Kannada","Marathi","Telugu","Marathi","Hindi","English");
		
		System.out.println(languages);
		
		
		languages.stream().distinct().forEach(n->System.out.println(n));
		

	}

}
