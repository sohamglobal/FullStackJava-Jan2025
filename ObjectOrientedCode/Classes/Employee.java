package com.sharayu.classes;

import com.soham.interfaces.*;

//multiple inheritance with interfaces is allowed not with classes
public class Employee implements Office,Health {
	
	public void welcome()
	{
		System.out.println("Welcome to Employees Admin system");
	}

	@Override
	public void calcNetSalary(double basic) {
		// TODO Auto-generated method stub
		double netsal;
		netsal=basic+(basic*25/100)+5000-(basic*5/100);
		System.out.println("Net salary will be "+netsal);
	}

	@Override
	public void findIncomeTax(double annualIncome) {
		// TODO Auto-generated method stub
		if(annualIncome>500000)
			System.out.println("income tax will be 0");
		else
			System.out.println("income tax will be "+(annualIncome*7/100));
		
	}

	@Override
	public void showFitnessStatus() {
		// TODO Auto-generated method stub
		System.out.println("Fitness status is below average");
		
	}

	
}
