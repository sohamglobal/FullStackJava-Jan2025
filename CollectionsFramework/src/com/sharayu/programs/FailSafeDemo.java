package com.sharayu.programs;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeDemo {
	public static void main(String[] args) {
		CopyOnWriteArrayList<String> list=new CopyOnWriteArrayList<String>();
		list.add("chelsea");
		list.add("liverpool");
		list.add("tottenham");
		list.add("arsenal");
		list.add("manchester city");
		list.add("crystal palace");
		
		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
			
			if(!list.contains("newcastle"))
			list.add("newcastle");
			//no error
			//fail safe
		}
		
		System.out.println("\nupdated list - ");
		System.out.println(list);
		
	}

}
