package com.sharayu.programs;

import java.util.Scanner;

public class StudentResult {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int marks;
		
		System.out.print("Enter marks out of 100 : ");
		marks=sc.nextInt();
		
		try
		{
		if(marks<0 || marks>100)
			throw new Exception();
		
		if(marks>=35)
			System.out.println("you are pass");
		else
			System.out.println("you are fail");
		}
		catch(Exception e)
		{
			System.out.println("invalid marks..cant show result");
		}
	}

}
