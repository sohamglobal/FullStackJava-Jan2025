package com.sharayu.classes;

public class Calculator {
	
	private int result;
	
	//constructor
	public Calculator()
	{
		result=0;
		System.out.println("welcome to Calculator class");
	}
	
	public void calcSum(int a,int b)
	{
		result=a+b;
		System.out.println("Sum is "+result);
	}
	
	public void calcSquare(int n)
	{
		result=n*n;
		System.out.println("Square is "+result);
		//System.out.println(a);
	}

}
