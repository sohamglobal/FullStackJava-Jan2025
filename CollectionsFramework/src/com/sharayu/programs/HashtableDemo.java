package com.sharayu.programs;

import java.util.Hashtable;
import java.util.Iterator;

public class HashtableDemo {
	public static void main(String[] args) {
		Hashtable<Integer, String> ht=new Hashtable<Integer, String>();
		ht.put(9, "praffull");
		ht.put(26, "shailaja");
		ht.put(13,"sharayu");
		ht.put(1, "soham");
		ht.putIfAbsent(9,"darwin nunez");
		ht.putIfAbsent(0, "shailaja");
		ht.remove(9);
		System.out.println(ht);
		
		System.out.println(ht.keys());
		
		Iterator<Integer> itrk=ht.keys().asIterator();
		while(itrk.hasNext())
			System.out.println(itrk.next());
		
		Iterator<String> itrv=ht.values().iterator();
		while(itrv.hasNext())
			System.out.println(itrv.next());
		
		
		System.out.println(ht.get(13));
		System.out.println(ht.containsValue("joe root"));
	}

}
