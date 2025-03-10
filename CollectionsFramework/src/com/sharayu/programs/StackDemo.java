package com.sharayu.programs;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> tech=new Stack<String>();
		tech.push("azure");
		tech.push("spring");
		tech.push("spark");
		tech.push("hive");
		tech.push("openai");
		tech.push(null);
		tech.push("spring");
		System.out.println(tech);
		
		System.out.println(tech.pop());
		System.out.println(tech);
	}

}
