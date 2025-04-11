package com.sohamglobal.programs;
import java.sql.*;

public class JoinsSelect {
	public static void main(String[] args) {
		Connection con;
		Statement st;
		ResultSet rs;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-ethanspringproject.h.aivencloud.com:11231/sharayudb?user=praffull&password=AVNS_3yYhAXQIaoNUH4UBk95");
			st=con.createStatement();
			rs=st.executeQuery("select customers.custnm,cars.modelnm,cars.company,cars.price from customers inner join cars on customers.carid=cars.carid");
			
			while(rs.next()) 
			{
				System.out.println(rs.getString("custnm")+" | "+rs.getString("modelnm"));
			}
			
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
