package com.sohamglobal.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TryBasicSelect {
	public static void main(String[] args) {
		Connection con;
		Statement st;
		ResultSet rs;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-ethanspringproject.h.aivencloud.com:11231/sharayudb?user=praffull&password=AVNS_3yYhAXQIaoNUH4UBk95");
			System.out.println("Driver & connection successful");
			//initialize the statement object
			st=con.createStatement();
			rs=st.executeQuery("select * from students");
			System.out.println("select query executed...");
			
			while(rs.next())
			{
			System.out.println(rs.getString("studnm")+" | "+rs.getString("course"));
				//System.out.println(rs.getString(2)+" | "+rs.getString(3));
			}
			
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
