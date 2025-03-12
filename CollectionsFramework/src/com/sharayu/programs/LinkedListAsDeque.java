package com.sharayu.programs;

import java.util.LinkedList;
import java.util.List;
import java.util.Deque;

public class LinkedListAsDeque {
	public static void main(String[] args) {
		Deque<String> ll=new LinkedList<String>();
		ll.addFirst("volkswagen");
		ll.add("skoda");
		ll.addFirst("ferrari");
		ll.addLast("bmw");
		
		System.out.println(ll);
		
		System.out.println(ll.peekFirst());
		System.out.println(ll.peekLast());
		System.out.println(ll);
		
		List<Integer> numlist=new LinkedList<>();
		numlist.add(9);
		numlist.add(26);
		numlist.add(13);
		numlist.add(1);
		System.out.println(numlist.get(2));
		System.out.println(numlist);
	}

}
