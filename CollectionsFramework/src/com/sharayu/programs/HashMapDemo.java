package com.sharayu.programs;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, String> users=new HashMap<String, String>();
		users.put("praffull", "chelsea");
		users.put("sharayu", "spider");
		users.put("soham", "liverpool");
		users.put(null,"java");
		users.put("megha", null);
		users.put("soham","midfielder");
		
		System.out.println(users);
		System.out.println(users.get("soham"));
		System.out.println(users.get("shailaja"));
		System.out.println(users.getOrDefault("shailaja","not found"));
	}

}
