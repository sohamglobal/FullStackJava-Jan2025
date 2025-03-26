package com.sharayu.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
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
        
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(9);
        nums.add(13);
        nums.add(9);
        nums.add(26);
        nums.add(13);
        nums.add(9);
        nums.add(1);
        nums.add(9);
        
        List<Integer> sqrs= nums.stream()
        .map(n->n*n)
        .collect(Collectors.toList());
        
        System.out.println(sqrs);
        System.out.println("after squares : "+nums);
        
        //sorted
        names.stream().sorted().forEach(nm->System.out.println(nm));
        
        //distinct
        nums.stream().distinct().forEach(n->System.out.println(n));
        //Set<Integer> uniques=nums.stream().collect(Collectors.toSet());
        //System.out.println(uniques);
        
        
        //limit - limit the number of elements
        System.out.println("-----limit--------");
        names.stream().limit(3).forEach(nm->System.out.println(nm));
        System.out.println("----sorted limit----");
        names.stream().sorted().limit(3).forEach(nm->System.out.println(nm));
        
        //skip - skip first N elements
        System.out.println("----skip----------");
        names.stream().skip(2).forEach(nm->System.out.println(nm));
        System.out.println("----limit skip -----------");
        names.stream().skip(2).limit(1).forEach(nm->System.out.println(nm));
        System.out.println("Rank second");
        names.stream().sorted().skip(1).limit(1).forEach(nm->System.out.println(nm));
        
        
	}

}
