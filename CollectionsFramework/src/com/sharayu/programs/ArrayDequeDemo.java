package com.sharayu.programs;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
	public static void main(String[] args) {
		ArrayDeque<String> dq=new ArrayDeque<String>();
		dq.add("java");
		dq.add("spring");
		dq.add("hibernate");
		dq.add("microservices");
		dq.add("spring");
		dq.add("mongodb");
		//dq.add(null); not allowed
		System.out.println(dq);
		
		dq.addFirst("praffull");
		dq.addLast("sharayu");
		System.out.println(dq);
		//dq.removeFirst();
		//dq.removeLast();
		
		//retrieve and remove an element
		//System.out.println(dq.pollFirst());
		//System.out.println(dq.pollLast());
		
		//retrieve and maintain
		//System.out.println(dq.peekFirst());
		System.out.println(dq.peekLast());
		System.out.println(dq);
	}

}
