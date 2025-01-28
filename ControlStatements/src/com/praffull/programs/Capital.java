package com.praffull.programs;

import java.util.Scanner;

public class Capital {
	public static void main(String[] args) {
		String country;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter country ");
		country=sc.nextLine();
		
		switch(country)
		{
		case "usa":
			System.out.println("washington dc");
			break;
		case "germany":
			System.out.println("berlin");
			break;
		case "pakistan":
			System.out.println("islamabad");
			break;
		default:
			System.out.println("information not found");
		}
	
		sc.close();
	}

}
