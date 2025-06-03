package com.example.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class InterviewQuestionsOnStreams {

	public static void main(String[] args) {
		
//		Filter even/odd numbers
		
		List<Integer> list = List.of(1, 2, 3, 4, 5);
		List<Integer> evens = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(evens); // Output: [2, 4]
		
//		Grouping employees by department
		
		class Employee {
		    String name, dept;
		    Employee(String name, String dept) { this.name = name; this.dept = dept; }
		    
		    public String toString() {
		    	return "name :" +name+ "department : " +dept ;
		    }
		}
		List<Employee> employees = List.of(
		    new Employee("John", "IT"),
		    new Employee("Alice", "HR"),
		    new Employee("Bob", "IT")
		);

		Map<String, List<Employee>> grouped = employees.stream()
		    .collect(Collectors.groupingBy(emp -> emp.dept));
		
		System.out.println(grouped);
		
//		Sorting custom objects
		
		List<Employee> sorted = employees.stream()
			    .sorted(Comparator.comparing(emp -> emp.name))
			    .collect(Collectors.toList());
		System.out.println(sorted);

//		Find duplicate elements
		
		List<Integer> list1 = List.of(1, 2, 3, 2, 4, 5, 1);
		Set<Integer> seen = new HashSet<>();
		Set<Integer> duplicates = list1.stream()
		    .filter(n -> !seen.add(n))
		    .collect(Collectors.toSet());
		System.out.println(duplicates); // Output: [1, 2]

//		Word count using Streams
		
		String sentence = "apple banana apple orange banana apple";
		Map<String, Long> wordCount = Arrays.stream(sentence.split(" "))
		    .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
		System.out.println(wordCount); // Output: {orange=1, banana=2, apple=3}

//		 Highest/Lowest salary using reduce() or collect()
		
		class Emp {
		    String name; 
		    int salary;
		    Emp(String name, int salary)
		    {
		    	this.name = name;
		    	this.salary = salary; 
		    }
		    
		    public String toString() {
		    	return "Name :"+name +", salary :"+salary;
		    }
		    
		}
		List<Emp> emps = List.of(new Emp("A", 5000), new Emp("B", 7000), new Emp("C", 6000));

		// Using reduce:
		Emp highest = emps.stream().reduce((e1, e2) -> e1.salary > e2.salary ? e1 : e2).get();

		// Or using Comparator:
		Emp lowest = emps.stream().min(Comparator.comparingInt(e -> e.salary)).get();
		
		System.out.println(highest);
		System.out.println(lowest);
		
		
		


	}

}
