package com.sohamglobal.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.sohamglobal.services.Authenticator;

/**
 * Servlet implementation class Check
 */
@WebServlet("/Check")
public class Check extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Check() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id,ps;
		id=request.getParameter("userid");
		ps=request.getParameter("password");
		Authenticator obj=new Authenticator();
		obj.setUserId(id);
		obj.setPassword(ps);
		String status=obj.getAuthStatus();
		if(status.equals("success"))
			response.sendRedirect("AdminPanel.jsp");
		else
			response.sendRedirect("Failure.html");
		
	}

}
