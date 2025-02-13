package com.sharayu.programs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestErrors {
	public static void main(String[] args) {
		
		        double balance,interest;
		        Scanner sc=new Scanner(System.in);
		        try
		        {
		        	System.out.print("Enter Balance : ");
		            balance=sc.nextDouble();
		        }
		        catch(InputMismatchException e)
		        {
		        	System.out.println("Invalid balance...");
		        	balance=0.0;
		        }
		        finally
		        {
		        	System.out.println("thanks for banking with us.");
		        }
		        
		        interest=balance*0.03;
		        System.out.println("saving interest is "+interest);

		    }   
		
}
