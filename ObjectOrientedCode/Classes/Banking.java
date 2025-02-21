package com.sharayu.classes;

public class Banking {
	
	public Banking()
	{
		System.out.println("Welcome to Banking application");
	}
	
	public void calcInterest(String type,double balance)
	{
		double interest;
		switch(type)
		{
		case "saving":
			interest=balance*3/100;
			break;
		case "fixed":
			interest=balance*5/100;
			break;
		default:
			interest=0;
		}
		System.out.println("interest will be "+interest);
	}

}
