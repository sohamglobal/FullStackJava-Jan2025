package com.sharayu.programs;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastDemo {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
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
			//list.add("newcastle");
			//java.util.ConcurrentModificationException
		}
		
	}

}
