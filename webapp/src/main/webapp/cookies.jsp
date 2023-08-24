<%@page import="jakarta.servlet.http.Cookie"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js"
	integrity="sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V"
	crossorigin="anonymous"></script>

</head>
<body>
	<div class="container">
		<h1 class="bg-info text-center">Login Form</h1>
		<div>
			<p>Logged in as : 
			<%
			String username="Hello";
			Cookie[] cookies = request.getCookies();
			for(int i=0; i<cookies.length; i++){
				if(cookies[i].getName().equals("username")){
					username=cookies[i].getValue();
				}
			}
			out.print(username);
			%>
			
			</p>
		</div>
		<form action="cookies" method="post">
			<input type="text" name="username" placeholder="Username">
			<input type="submit" value="submit">
		</form>
		
	</div>
</body>
</html>