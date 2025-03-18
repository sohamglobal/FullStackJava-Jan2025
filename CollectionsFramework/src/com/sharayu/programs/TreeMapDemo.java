package com.sharayu.programs;

import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<String, String> users=new TreeMap<String, String>();
		users.put("sharayu", "spider");
		users.put("praffull", "chelsea");
		users.put("soham", "liverpool");
		users.put("megha", "projects");
		System.out.println(users);
		
		Iterator<String> iterator=users.keySet().iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
			users.put("buttler", "england");
		}
	}

}
