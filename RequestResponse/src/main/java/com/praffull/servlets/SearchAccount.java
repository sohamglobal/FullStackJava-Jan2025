package com.praffull.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class SearchAccount
 */
@WebServlet("/SearchAccount")
public class SearchAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchAccount() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h1>Account Search</h1><hr>");
		
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		
		int no=Integer.parseInt(request.getParameter("acno"));
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-ethanspringproject.h.aivencloud.com:11231/sharayudb?user=praffull&password=AVNS_3yYhAXQIaoNUH4UBk95");
			pst=con.prepareStatement("select * from accounts where accno=?");
			pst.setInt(1, no);
			rs=pst.executeQuery();
			if(rs.next())
			{
				out.println("<br>Name : "+rs.getString("accnm"));
				out.println("<br>Balance : "+rs.getString("balance"));
			}
			else
			{
				out.println("account not found");
			}
			con.close();
		}
		catch(Exception e)
		{
			out.println(e);
		}
	}

}
