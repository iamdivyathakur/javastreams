package com.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class StudentList{
	
	String name;
	int score;
	
	StudentList(String name, int score){
		this.score= score;
		this.name=name;
	}
	
	public String getName() {
		return this.name;
		
	}
	
	public int getScore() {
		return this.score;
	}
	
	public String toString(){
		return "Student = [ Name : " + name + " Score : "+ score + " ]";
					}
	
}

public class ParallelStream {

	public static void main(String[] args) {
		
		List<StudentList> studentList = Arrays.asList(
				new StudentList("Diana", 90),
				new StudentList("Kriti", 95),
				new StudentList("Rihana", 50),
				new StudentList("Priya", 98),
				new StudentList("Daisy", 85)
				);
		
		System.out.println(studentList);
		
		List<StudentList> studentscore = new ArrayList<StudentList>();
		
		studentscore = studentList.parallelStream().filter(n->n.getScore()>80).limit(3).collect(Collectors.toList());
		
		System.out.println(studentscore);
	}

}
