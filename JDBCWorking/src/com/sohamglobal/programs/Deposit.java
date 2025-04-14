package com.sohamglobal.programs;

import java.util.Scanner;
import java.sql.*;

public class Deposit {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int ano;
		float amount;
		
		System.out.println("DEPOSIT AMOUNT");
		System.out.println("-------------------------");
		System.out.print("Enter account number : ");
		ano=scanner.nextInt();
		System.out.print("Enter deposit amount : ");
		amount=scanner.nextFloat();
		
		//--------------JDBC
		Connection con;
		PreparedStatement pst;
		
		try
        {
        	Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-ethanspringproject.h.aivencloud.com:11231/sharayudb?user=praffull&password=AVNS_3yYhAXQIaoNUH4UBk95");
			pst=con.prepareStatement("update accounts set balance=balance+? where accno=?");
			pst.setFloat(1, amount);
			pst.setInt(2, ano);
			int cnt=pst.executeUpdate();
			con.close();
			if(cnt==1)
			System.out.println("Deposit done...");
			else
				System.out.println("Account number "+ano+" does not exist");
        }
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
