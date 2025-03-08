package com.sharayu.programs;

import java.util.Iterator;
import java.util.LinkedList;

import com.praffull.classes.Mobile;

public class LinkedListObjects {
	public static void main(String[] args) {
		Mobile m1=new Mobile("galaxy s25 5g","samsung",12,256,"navy",80999);
		Mobile m2=new Mobile("t3 pro 5g","vivo",8,256,"orange",24999);
		Mobile m3=new Mobile("galaxy f05","samsung",4,64,"blue",6249);
		
		LinkedList<Mobile> mobiles=new LinkedList<Mobile>();
		mobiles.add(m1);
		mobiles.add(m2);
		mobiles.add(m3);
		
		Iterator<Mobile> iterator=mobiles.descendingIterator();
		while(iterator.hasNext())
			System.out.println(iterator.next().getModelName());
		
	}

}
