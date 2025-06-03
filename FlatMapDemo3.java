package com.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	
	int id;
	String sname;
	char grade;
	
	Student(int id, String sname, char grade){
		this.id=id;
		this.sname=sname;
		this.grade=grade;
		
	}
	
	@Override
	public String toString(){
		return "Student [id=" + id +", name = " + sname + ", grade = " + grade + "]";
		 
	}
}

public class FlatMapDemo3 {

	public static void main(String[] args) {
		
		List<Student> studentlist1 = new ArrayList<Student>();
		studentlist1.add(new Student(1,"Divya",'A'));
		studentlist1.add(new Student(2,"Kriti",'B'));
		studentlist1.add(new Student(3,"Rosy",'A'));
		studentlist1.add(new Student(4,"Kajal",'B'));
		studentlist1.add(new Student(5,"Renuka",'C'));
		studentlist1.add(new Student(6,"Priya",'D'));
		studentlist1.add(new Student(7,"Racheal",'A'));
		
		List<Student> studentlist2 = new ArrayList<Student>();
		studentlist2.add(new Student(8,"Kiara",'B'));
		studentlist2.add(new Student(9,"Aishwarya",'A'));
		studentlist2.add(new Student(10,"Rani",'C'));
		studentlist2.add(new Student(11,"Priyanka",'D'));
		studentlist2.add(new Student(12,"Priya",'E'));
		studentlist2.add(new Student(13,"Manisha",'A'));
		
		
		System.out.println(studentlist1);
		
		System.out.println(studentlist2);
		
		List<List<Student>> students = Arrays.asList(studentlist1,studentlist2);
		
//		Before Java8
		
		for(List<Student> s: students){
			for(Student stu : s) {
				System.out.println(stu.sname);
			}
			
		}
		
//		Java8
		
		List<String> stulist = new ArrayList<String>();
		
		stulist=students.stream().flatMap(s->s.stream()).map(n->n.sname).collect(Collectors.toList());
		
		System.out.println(stulist);
		

	}

}
