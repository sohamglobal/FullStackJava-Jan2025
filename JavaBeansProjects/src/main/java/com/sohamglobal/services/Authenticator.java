package com.sohamglobal.services;
import java.sql.*;

public class Authenticator {
	//properties
	private String userId;
	private String password;
	private String authStatus;
	
	//constructor
	public Authenticator()
	{
		userId="";
		password="";
		authStatus="failed";
	}

	public String getAuthStatus() {
		checkUser();
		return authStatus;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	private void checkUser()
	{
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-ethanspringproject.h.aivencloud.com:11231/sharayudb?user=praffull&password=AVNS_3yYhAXQIaoNUH4UBk95");
			pst=con.prepareStatement("select * from users where userid=? and password=?");
			pst.setString(1, userId);
			pst.setString(2, password);
			rs=pst.executeQuery();
			if(rs.next())
				authStatus="success";
			
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
