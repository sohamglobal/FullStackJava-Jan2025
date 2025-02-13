package com.sharayu.programs;

import java.util.Scanner;

public class PasswordValidate {
	public static void main(String[] args) {
		String pass;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter password : ");
		pass=sc.nextLine();
		
		try
		{
			if(pass.length()<8)
				throw new Exception();

			System.out.println("password length is "+pass.length());
		}
		catch(Exception e)
		{
			System.out.println("password is too small");
		}
		sc.close();
	}

}
