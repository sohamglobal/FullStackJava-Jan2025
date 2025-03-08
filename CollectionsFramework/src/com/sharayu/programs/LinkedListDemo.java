package com.sharayu.programs;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> names=new LinkedList<String>();
		names.add("english");
		names.add("urdu");
		names.add("spanish");
		names.add("german");
		names.add("urdu");
		names.add(null);
		names.set(5, "french");
		names.remove("german");
		System.out.println(names);
		
		Iterator<String> iterator=names.descendingIterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
	}

}
