package com.sohamglobal.programs;
import java.util.*;
import java.sql.*;

public class CallTransferSP {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int fno,tno;
		float amt;
		String details;
		
		System.out.print("Enter FROM account number : ");
		fno=sc.nextInt();
		System.out.print("Enter TO account number : ");
		tno=sc.nextInt();
		System.out.print("Enter transfer amount : ");
		amt=sc.nextFloat();
		sc.nextLine();
		System.out.print("Enter details : ");
		details=sc.nextLine();
		
		//----------------- JDBC
		
		Connection con;
		CallableStatement cst;
		
		try
		{
        	Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-ethanspringproject.h.aivencloud.com:11231/sharayudb?user=praffull&password=AVNS_3yYhAXQIaoNUH4UBk95");
			cst=con.prepareCall("{call transfer(?,?,?,?)}");
			cst.setInt(1, fno);
			cst.setInt(2, tno);
			cst.setFloat(3, amt);
			cst.setString(4, details);
			cst.execute();
			con.close();
			System.out.println("Money transferred and log maintained");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}

}
