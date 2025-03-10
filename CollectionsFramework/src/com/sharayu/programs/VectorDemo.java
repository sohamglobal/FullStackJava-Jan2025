package com.sharayu.programs;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<String> companies=new Vector<String>();
		companies.add("microsoft");
		companies.add("volkswagen");
		companies.add("samsung");
		companies.add("hp");
		companies.add("dell");
		companies.add(null);
		companies.add(1, "skoda");
		companies.add("volkswagen");
		System.out.println(companies);
		
		
		companies.addElement("apple");
		System.out.println(companies);
		System.out.println(companies.elementAt(3));
		companies.insertElementAt("oracle", 4);
		System.out.println(companies);
		//companies.removeAllElements();
		
		Iterator<String> iterator=companies.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
		
	}

}
