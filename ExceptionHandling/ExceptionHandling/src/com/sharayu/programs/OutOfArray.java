package com.sharayu.programs;

import java.util.Scanner;

public class OutOfArray {
	public static void main(String[] args) {
		int[] arr= {9,26,13,1,30};
		int index;
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.print("Enter index : ");
			index=sc.nextInt();
			System.out.println(arr[index]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("not in array");
		}
		
		}
	}


