package com.sharayu.programs;

import java.util.Scanner;

public class JaggedArray {
	public static void main(String[] args) {
		int[][] arr=new int[3][];
		arr[0]=new int[2];
		arr[1]=new int[5];
		arr[2]=new int[3];
		int i,j;
		Scanner sc=new Scanner(System.in);
		
		for(i=0;i<=2;i++)
		{
			System.out.println(arr[i].length+"----------");
			for(j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("-------------------");
		
		for(i=0;i<=2;i++)
		{
			
			for(j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
