package com.soham.programs;

import com.praffull.interfaces.Banking;

public class AnonymousClass {
	public static void main(String[] args) {
		Banking sbi=new Banking() {

			@Override
			public String calcInterest(double balance) {
				// TODO Auto-generated method stub
				double interest=balance*4/100;
				return "SBI offers interest "+interest;
			}
			
		};
		
		System.out.println(sbi.calcInterest(250000));
	}

}
