package com.sharayu.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TerminalOperations {
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
        
        //forEach
        names.stream().forEach(nm->System.out.println(nm));
        //System.out.println("----------");
        //names.stream().forEach(System.out::println);
        
        //collect
        List<String> res=names.stream().collect(Collectors.toList());
        Set<String> set=names.stream().collect(Collectors.toSet());
        
        //count
        //long cnt=names.stream().count();
        long cnt=names.stream().filter(nm->nm.length()>7).count();
        System.out.println("number of elements : "+cnt);
        
        //anyMatch()
        boolean stat=names.stream().anyMatch(nm->nm.startsWith("P"));
        System.out.println(stat);
        
        //reduce
        List<Integer> numbers=List.of(10,20,30,40,50);
        int result=numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum of elements : "+result);
        
        result=numbers.stream().reduce(0, Integer::max);
        System.out.println("largest value : "+result);

	}

}
