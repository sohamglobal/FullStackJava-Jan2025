package com.sharayu.programs;

import java.util.ArrayList;
import java.util.Iterator;

public class BasicStreamOperation {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("bombay");
		list.add("london");
		list.add("tokyo");
		list.add("berlin");
		list.add("dubai");
		
		/*
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
			
			*/
		
		//list.stream().forEach(nm->System.out.println(nm));
		
		list.stream().filter(nm->nm.startsWith("b")).forEach(nm->System.out.println(nm));
		//filter is an intermediate operation
		//forEach is a terminal operation
	}

}
