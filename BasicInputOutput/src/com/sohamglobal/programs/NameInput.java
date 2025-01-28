package com.sohamglobal.programs;

import java.util.Scanner;

public class NameInput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String nm;
		System.out.print("Enter your name ");
		nm=sc.nextLine();
		
		System.out.println("Thanks "+nm+" for joining sohamglobal");
		sc.close();
	
	}

}
