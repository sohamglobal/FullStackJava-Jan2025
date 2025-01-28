package com.praffull.programs;
import java.util.*;

public class Billing {
	public static void main(String[] args) {
		String custnm;
		float amount,discount,netbill;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter customer name ");
		custnm=sc.nextLine();
		System.out.print("Enter purchase amount ");
		amount=sc.nextFloat();
		
		if(amount>20000)
		{
			System.out.println("13% discount is applicable");
			discount=amount*13/100;
		}
		else
		{
			System.out.println("9% discount applicable");
			discount=amount*9/100;
		}
		
		netbill=amount-discount;
		System.out.println("----------------------------");
		System.out.println("Customer Name : "+custnm);
		System.out.println("Purchase amount : "+amount);
		System.out.println("Discount : "+discount);
		System.out.println("NetBill : "+netbill);
		
		sc.close();
		
	}

}
