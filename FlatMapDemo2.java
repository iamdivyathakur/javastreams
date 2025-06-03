package com.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo2 {

	public static void main(String[] args) {
		
		List<String> teamA = Arrays.asList("Diana", "Shreya", "Kajal");
		
		List<String> teamB = Arrays.asList("Kriti", "Priyanka", "Racheal");
		
		List<String> teamC = Arrays.asList("Zoya","Divya","Khushi");
		
		List<List<String>> playersworldcup = new ArrayList<List<String>>();
		
		playersworldcup.add(teamA);
		playersworldcup.add(teamB);
		playersworldcup.add(teamC);
		
		System.out.println(playersworldcup);
		
		
//		Before Java8
		
//		for(List<String> team : playersworldcup) {
//			for(String name : team ) {
//				System.out.println(name);
//			}
//		}
		
		
		List<String> players= new ArrayList<String>();
		
		players = playersworldcup.stream().flatMap(team->team.stream()).collect(Collectors.toList());
		
		
		System.out.println("Using Java8 FlatMap : "+players);
	}

}
