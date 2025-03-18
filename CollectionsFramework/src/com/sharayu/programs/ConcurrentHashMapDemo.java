package com.sharayu.programs;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
	public static void main(String[] args) {
		ConcurrentHashMap<String, String> users=new ConcurrentHashMap<String, String>();
		users.put("sharayu", "spider");
		users.put("praffull", "chelsea");
		users.put("soham", "liverpool");
		users.put("megha", "projects");
		
		Iterator<String> iterator=users.keySet().iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
			users.put("buttler", "england");
		}
		
		System.out.println(users);
	}
	

}
