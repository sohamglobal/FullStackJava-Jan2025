package com.sohamglobal.programs;
import java.sql.*;
import java.util.*;

public class SearchOnAccountNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ano;
		System.out.print("Enter account number : ");
		ano=sc.nextInt();
		
		//------------ JDBC
		
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
				System.out.println("Account name is "+rs.getString("accnm"));
			else
				System.out.println("not found");
			
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
