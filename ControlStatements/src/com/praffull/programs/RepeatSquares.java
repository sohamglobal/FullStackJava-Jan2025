package com.praffull.programs;

import java.util.Scanner;

public class RepeatSquares {
	public static void main(String[] args) {
		int i,n=1,sq;
		Scanner sc=new Scanner(System.in);
		while(n>0)
		{
		System.out.print("Enter a number ");
		n=sc.nextInt();
		sq=n*n;
		System.out.println("square is "+sq);
		}
		sc.close();
	}

}
