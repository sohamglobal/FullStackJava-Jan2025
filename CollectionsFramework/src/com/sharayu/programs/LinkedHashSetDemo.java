package com.sharayu.programs;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		set.add("london");
		set.add("mumbai");
		set.add("tokyo");
		set.add("berlin");
		set.add("amsterdam");
		set.add("tokyo");
		set.add(null);
		System.out.println(set);
	}

}
