package com.sharayu.programs;

import java.util.Scanner;

public class IntegerArrays {
	public static void main(String[] args) {
		int[] arr=new int[5];
		int[] num= {9,26,13,1};
		int i;
		Scanner sc=new Scanner(System.in);
	
		//System.out.println(num[2]);
		
		System.out.println("Enter 5 numbers -");
		for(i=0;i<=4;i++)
			arr[i]=sc.nextInt();
		
		System.out.println("elements in the array - ");
		
		for(i=0;i<5;i++)
			System.out.println(arr[i]);
		
		System.out.println("---------------");
		for(int val:arr)
			System.out.println(val);
	}

}

