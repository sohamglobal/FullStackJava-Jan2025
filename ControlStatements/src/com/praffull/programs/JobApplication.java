package com.praffull.programs;

import java.util.Scanner;

public class JobApplication {
	public static void main(String[] args) {
		String name;
		int age,experience;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter name ");
		name=sc.nextLine();
		System.out.print("Enter age ");
		age=sc.nextInt();
		System.out.print("Enter experience ");
		experience=sc.nextInt();
		
		if(age<=40 && experience>5)
			System.out.println("eligible for interview");
		else
			System.out.println("application rejected");
		
		sc.close();
			
	}

}
