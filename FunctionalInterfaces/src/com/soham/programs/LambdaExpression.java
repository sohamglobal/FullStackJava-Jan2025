package com.soham.programs;

import com.praffull.interfaces.Banking;

public class LambdaExpression {
	public static void main(String[] args) {
		//interface must have a single abstract method
		//an interface that contains only one abstract method is called as 
		//Functional interface 
		
		Banking obj=(double balance)-> {
			double interest=balance*5/100;
			return "interest in post is "+interest;
		};
		
		System.out.println(obj.calcInterest(150000));
	}

}
