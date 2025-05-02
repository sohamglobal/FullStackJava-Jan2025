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
<h1>Content using Cookies</h1>
<hr>
<%
Cookie c[]=request.getCookies();

if(c!=null)
{
	for(int i=0;i<c.length;i++)
	{
		out.println("<br>Name : "+c[i].getName());
		out.println("<br>Value : "+c[i].getValue());
		
		if(c[i].getValue().equals("movies"))
		{
			%>
			<iframe width="560" height="315" src="https://www.youtube.com/embed/iJtkNz5wVUc?si=0vmyH9XCOwfRwhLB" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>
			<%
		}
		if(c[i].getValue().equals("music"))
		{
			%>
			<iframe width="560" height="315" src="https://www.youtube.com/embed/lEMMGb4xMQQ?si=BaQEHB9mRhq_EcjJ" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>
			<%
		}
		
	}
}
else
	out.println("No cookies found");

%>
</div>
</body>
</html>