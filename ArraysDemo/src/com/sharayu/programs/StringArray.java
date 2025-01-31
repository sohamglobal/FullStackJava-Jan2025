package com.sharayu.programs;

import java.util.Scanner;

public class StringArray {
	public static void main(String[] args) {
		//String[] players= {"joe root","jos buttler","pat cummins","steve smith","mohammed salah"};
		String[] nms=new String[5];
		Scanner sc=new Scanner(System.in);
		
		
		for(int i=0;i<=4;i++)
		{
			System.out.print("Enter name : ");
			nms[i]=sc.nextLine();
		}
		
//		for(int i=0;i<=4;i++)
//			System.out.println(nms[i]);
		
		for(String val:nms)
			System.out.println(val);
		
		sc.close();
	}

}
