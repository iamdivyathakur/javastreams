package com.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	int id;
	String empname;
	int salary;
	
	
	Employee(int id, String empname, int salary) {
		this.id = id;
		this.empname = empname;
		this.salary = salary;
		
	}
}

public class FilterAndMapStream {

	public static void main(String[] args) {
		
//		List<Employee> empList = new ArrayList<Employee>();
//		empList.add(new Employee(2, "Divya", 900000));
//		empList.add(new Employee(3, "Kriti", 700000));
//		empList.add(new Employee(4, "Sanjana", 600000));
//		empList.add(new Employee(5, "Priya", 20000));
		
		List<Employee> empList = Arrays.asList(
				new Employee(2, "Divya", 900000),
				new Employee(3, "Kriti", 700000),
				new Employee(4, "Sanjana", 600000),
			    new Employee(5, "Priya", 20000)
				);
		List<String> employeeSalaryList = empList.stream().filter(e->e.salary>20000).map(e->e.empname+":"+ e.salary).collect(Collectors.toList());
		
		System.out.println(employeeSalaryList);
		
		List<Integer> employeSal = empList.stream().filter(e->e.salary>20000).map(e->e.salary).collect(Collectors.toList());
		
		System.out.println(employeSal);
		

	}

}
