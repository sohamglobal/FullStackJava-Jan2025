package com.sharayu.programs;

import java.util.Scanner;

public class Searching {
	public static void main(String[] args) {
		int[] arr= {9,26,13,1,10,30,45,11,39,15};
		Scanner sc=new Scanner(System.in);
		int n;
		boolean flag=false;
		System.out.print("Enter a number : ");
		n=sc.nextInt();
		
		for(int i=0;i<=9;i++)
		{
			if(n==arr[i])
			{
				System.out.println("found at "+i);
				flag=true;
			}
			
		}
		
		if(flag==false)
			System.out.println("not found in the array");
		
	}

}
