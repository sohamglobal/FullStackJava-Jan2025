package com.sharayu.classes;

public class Student {
	
	//parameterized constructor
	public Student(String schoolname)
	{
		System.out.println("Welcome to "+schoolname);
	}
	
	public void showResult(int marks)
	{
		if(marks>=35)
			System.out.println("you are pass");
		else
			System.out.println("you are fail");
	}

}
