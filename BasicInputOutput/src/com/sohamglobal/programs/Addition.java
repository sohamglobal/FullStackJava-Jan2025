package com.sohamglobal.programs;

import java.util.Scanner;

public class Addition {
	public static void main(String[] args) {
		float x,y,z;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter first number ");
		x=sc.nextFloat();
		System.out.print("Enter second number ");
		y=sc.nextFloat();
		
		z=x+y;
		System.out.println("sum is "+z);
		sc.close();
	}

}
