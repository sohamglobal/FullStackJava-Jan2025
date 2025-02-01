package com.praffull.strings;

public class StringFunctions {
	public static void main(String[] args) {
		String nm="sohamglobal";
		String pincode="431603";
		String password="Ethan%786";
		String slogan="you will never walk alone";
		String s="";
		String obj=new String("technology is your future");
		
		System.out.println(nm.length());
		System.out.println(nm.charAt(1));
		System.out.println(nm.toUpperCase());
		System.out.println(nm.toLowerCase());
		System.out.println(slogan.contains("walk"));
		System.out.println(slogan.startsWith("what"));
		System.out.println(slogan.endsWith("one"));
		
		System.out.println(nm.equals("Sohamglobal"));
		System.out.println(nm.equalsIgnoreCase("SohamGlobal"));
		
		System.out.println(nm.indexOf('o'));
		System.out.println(nm.lastIndexOf('o'));
		
		System.out.println(s.isEmpty());
		String res=obj.replace("technology", "sports");
		System.out.println(res);
		System.out.println("--------------");
		
		String emp="913,sharayu,female,development,java developer,london,83500.00";
		String[] words=emp.split(",");
		for(String w:words)
			System.out.println(w);
		
		//you will never walk alone
		System.out.println(slogan.substring(5));
		System.out.println(slogan.substring(5,10));
		
		String club="           chelsea          ";
		System.out.println(club.trim());
		
		int x=786;
		String y=String.valueOf(x);
		System.out.println(y.substring(1));
			
	}

}
