package com.sharayu.programs;

import java.util.*;

public class ArrayListBasic {
	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<>();
		System.out.println(names.isEmpty());
		names.add("java");
		names.add("spring");
		names.add("praffull");
		names.add("soham");
		names.add("hibernate");
		names.add("spring");
		names.add(null);
		names.add(2, "data jpa");
		names.remove(6);
		names.set(6, "spark");
		System.out.println(names);
		Collections.sort(names);
		System.out.println(names);
		System.out.println(names.size());
		names.clear();
		
		ArrayList<Integer> nums=new ArrayList<>();
		nums.add(9);
		nums.add(26);
		nums.add(13);
		nums.add(30);
		nums.add(1);
		System.out.println(nums);
		
		for(int i=0;i<nums.size();i++)
			System.out.println(nums.get(i));
		
	}

}
