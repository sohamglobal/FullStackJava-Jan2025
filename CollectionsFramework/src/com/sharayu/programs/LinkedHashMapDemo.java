package com.sharayu.programs;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<String, String> users=new LinkedHashMap<String, String>();
		users.put("praffull", "chelsea");
		users.put("sharayu", "spider");
		users.put("soham", "liverpool");
		users.put(null,"java");
		users.put("megha", null);
		users.put("soham","midfielder");
		
		System.out.println(users);
	}

}
