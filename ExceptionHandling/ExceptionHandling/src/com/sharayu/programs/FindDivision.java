package com.sharayu.programs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FindDivision {
	public static void main(String[] args) {
		int x,y,z;
		Scanner sc=new Scanner(System.in);
		
		try
		{
		System.out.print("Enter first number : ");
		x=sc.nextInt();
		System.out.print("Enter second number : ");
		y=sc.nextInt();
		}
		catch(InputMismatchException e)
		{
			x=1;
			y=1;
			System.out.println("invalid input..reset to 1");
		}
		
		
		try
		{
		z=x/y;
		}
		catch(ArithmeticException e)
		{
			y=1;
			z=x/y;
			System.out.println("cant divide by 0..dividing by 1 instead");
		}
		System.out.println("division is "+z);
		sc.close();
	}

}
