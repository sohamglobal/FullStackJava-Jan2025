package com.sohamglobal.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TryConnectionWithCloudDB {
	public static void main(String[] args) {
		
		Connection con;
		
		try {
			//load suitable jdbc driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver ready...");
			//establish connection with the database
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-ethanspringproject.h.aivencloud.com:11231/sharayudb?user=praffull&password=AVNS_3yYhAXQIaoNUH4UBk95");
			System.out.println("Connection established");
			
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error loading JDBC Driver");
			//e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error connecting to DB..."+e);
			//e.printStackTrace();
		}
	}

}
