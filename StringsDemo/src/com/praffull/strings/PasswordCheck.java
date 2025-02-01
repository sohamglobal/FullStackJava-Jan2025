package com.praffull.strings;

import java.util.Scanner;

public class PasswordCheck {
	public static void main(String[] args) {
		String ops="ethan786";
		String ups;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter your password : ");
		ups=sc.nextLine();
		
		if(ups.equals(ops))
			System.out.println("welcome to java21");
		else
			System.out.println("sorry password failed");
		
	}

}
