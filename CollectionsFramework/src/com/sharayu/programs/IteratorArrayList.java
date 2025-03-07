package com.sharayu.programs;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorArrayList {
	public static void main(String[] args) {
		ArrayList<String> cities=new ArrayList<String>();
		cities.add("london");
		cities.add("berlin");
		cities.add("amsterdam");
		cities.add("tokyo");
		cities.add("new york");
		cities.add("dubai");
		
		/*
		for(int i=0;i<cities.size();i++)
			System.out.println(cities.get(i));
		*/
		
		Iterator<String> iterator=cities.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
	}

}
