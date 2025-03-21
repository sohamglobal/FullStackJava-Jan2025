package com.fi.programs;

import java.util.function.Predicate;

public class ExamplePredicate {
	public static void main(String[] args) {
		Predicate<Integer> obj=(Integer n)->{
			boolean flag;
			if(n%2==1)
				flag=true;
			else
				flag=false;
			
			return flag;
		};
		
		System.out.println("Is Odd? : "+obj.test(13));
		System.out.println("Is Odd? : "+obj.test(26));
		System.out.println("Is Odd? : "+obj.test(9));
		
		if(obj.test(15))
			System.out.println("number is odd");
		else
			System.out.println("number is even");
	}

}
