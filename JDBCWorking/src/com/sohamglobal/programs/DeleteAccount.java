package com.sohamglobal.programs;

import java.util.Scanner;
import java.sql.*;

public class DeleteAccount {
	public static void main(String[] args) {
		int ano;
		String cho;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter account number : ");
		ano=sc.nextInt();
		sc.nextLine();
		 //------------JDBC
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		
		try
		{
        	Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-ethanspringproject.h.aivencloud.com:11231/sharayudb?user=praffull&password=AVNS_3yYhAXQIaoNUH4UBk95");
			pst=con.prepareStatement("select * from accounts where accno=?");
			pst.setInt(1, ano);
			rs=pst.executeQuery();
			if(rs.next())
			{
				System.out.println(rs.getString("accnm"));
				System.out.println(rs.getString("acctype"));
				System.out.println(rs.getFloat("balance"));
				
				System.out.print("Do you really want to delete this account? (yes/no) ");
				cho=sc.nextLine();
				
				if(cho.equalsIgnoreCase("yes"))
				{
					pst=con.prepareStatement("delete from accounts where accno=?");
					pst.setInt(1, ano);
					pst.executeUpdate();
					System.out.println("account deleted successfully");
										
				}
				else
					System.out.println("Delete cancelled by the user");
			}
			else
				System.out.println("account not found");
			
			
			
			con.close();
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
