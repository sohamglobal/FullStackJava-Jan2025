<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body style="margin-top:45px">
<div class="container">

<%
String cho=request.getParameter("choice");
Cookie c1=new Cookie("entchoice",cho);
c1.setMaxAge(30);
response.addCookie(c1);
%>



<h1>Data stored in cookies successfully</h1>
<hr>
<a href="index.html">Home</a>
</div>

</body>
</html>