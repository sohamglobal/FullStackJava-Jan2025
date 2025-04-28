<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Car Report</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
    <div class="container mt-5">
        <h1 class="text-center text-primary mb-4">Car Report</h1>
        <table class="table table-bordered table-striped">
            <thead class="table-dark">
                <tr>
                    <th>Model Name</th>
                    <th>Company</th>
                    <th>Price</th>
                </tr>
            </thead>
            <tbody>
                <!-- Rows can be added here -->
                <%
                Connection con;
                Statement st;
                ResultSet rs;

                try
                {
                	Class.forName("com.mysql.cj.jdbc.Driver");
                	con=DriverManager.getConnection("jdbc:mysql://mysql-java-ethanspringproject.h.aivencloud.com:11231/sharayudb?user=praffull&password=AVNS_3yYhAXQIaoNUH4UBk95");
                	st=con.createStatement();
                	rs=st.executeQuery("select * from cars");
                	while(rs.next())
                	{
                		%>
                		<tr>
                		<td><%=rs.getString("modelnm") %>
                		<td><%=rs.getString("company") %>
                		<td><%=rs.getFloat("price") %>
                		</tr>
                		<%
                	}
                	con.close();
                }
                catch(Exception e)
                {
                	out.println(e);
                }



                
                
                %>
                
                
            </tbody>
        </table>
        <div class="text-center mt-4">
            <a href="index.html" class="btn btn-primary">Return to Home Page</a>
        </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>