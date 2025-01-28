package com.praffull.programs;

import java.util.Scanner;

public class StudentResult {
	public static void main(String[] args) {
		String nm;
		int marks;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name ");
		nm=sc.nextLine();
		System.out.print("Enter marks ");
		marks=sc.nextInt();
		
		if(marks>=35)
			System.out.println(nm+" you are pass");
		else
			System.out.println("sorry you are fail");
		
	}

}
