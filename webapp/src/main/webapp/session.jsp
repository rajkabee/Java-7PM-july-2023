<%@page import="jakarta.servlet.http.Cookie"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Session Tracker</title>
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
			
		</div>
		<form action="sessions" method="post">
			<input type="text" name="item" placeholder="Item">
			<input type="submit" value="submit">
		</form>
		
		<h1>Items</h1>
		<ul>
		${ myitems }
			<c:forEach var="item" items="${ myitems }">
				<li>${ item }</li>
			</c:forEach>
		</ul>
	</div>
</body>
</html>