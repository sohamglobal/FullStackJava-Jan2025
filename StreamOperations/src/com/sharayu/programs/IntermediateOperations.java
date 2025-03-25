package com.sharayu.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperations {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
        
        // Adding 10 names, some with the same starting letter
        names.add("Alice");
        names.add("Diana");
        names.add("Charles");
        names.add("Andrew");
        names.add("Bella");
        names.add("Catherine");
        names.add("Benjamin");    
        names.add("Daniel");
        names.add("Ethan");
        names.add("Adam");
        
        
        //filter - retrieve elements on the basis of a condition
        names.stream().filter(nm->nm.startsWith("A")).forEach(nm->System.out.println(nm));
        System.out.println("---------");
        names.stream().filter(nm->nm.length()>7).forEach(nm->System.out.println(nm));
        
        List<String> Anm=names.stream().filter(nm->nm.startsWith("A")).collect(Collectors.toList());
        System.out.println(Anm);
        
        //map - transform all elements
        names.stream().map(nm->nm.toUpperCase()).forEach(nm->System.out.println(nm));
        
        //sorted
        names.stream().sorted().forEach(nm->System.out.println(nm));
        
        //distinct
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(9);
        nums.add(13);
        nums.add(9);
        nums.add(26);
        nums.add(13);
        nums.add(9);
        nums.add(1);
        nums.add(9);
        nums.stream().distinct().forEach(n->System.out.println(n));
	}

}
