package com.sharayu.programs;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		//TreeSet<String> set=new TreeSet<String>();
		TreeSet<String> set=new TreeSet<String>(Comparator.reverseOrder());
		set.add("london");
		set.add("mumbai");
		set.add("tokyo");
		set.add("berlin");
		set.add("amsterdam");
		set.add("dubai");
		System.out.println(set);
		System.out.println(set.first());
		System.out.println(set.last());
		
		System.out.println(set.pollFirst());
		System.out.println(set.pollLast());
		System.out.println(set);
		
		
		//Set<String> set1=new TreeSet<>();
	}

}
