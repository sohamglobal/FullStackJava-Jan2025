package com.praffull.programs;

import java.util.Scanner;

import com.sharayu.classes.Calculator;

public class Addition {
	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		a=sc.nextInt();
		System.out.print("Enter second number : ");
		b=sc.nextInt();
		
		//create object of the class & run the function
		Calculator obj=new Calculator();
		obj.calcSum(a, b);
		//private members cant be accessed
		//System.out.println(obj.result); 
		sc.close();
	}

}
