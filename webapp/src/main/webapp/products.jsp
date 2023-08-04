<%@page import="webapp.entities.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js" integrity="sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V" crossorigin="anonymous"></script>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products</title>
</head>
<body>
	<div class="container">
		<h1 class="display-2 text-white bg-primary text-center">Products</h1>
		<a href="addProduct"><button class="btn btn-primary">Add Product</button></a>	
	
	<table class="table table-striped">
		<thead>
			<tr>
			<th scope="col">Sn.</th>
			<th scope="col">Name</th>
			<th scope="col">Description</th>
			<th scope="col">Price</th>
			<th scope="col">Action</th>
			</tr>
		</thead>
		<tbody>
			<%-- <%
				List<Product> products = (List<Product>)request.getAttribute("products");
				int sn=1;
				for(Product pd:products){
					out.print("<tr><td scope='row'>");
					out.print(sn+"</td><td>");
					out.print(pd.getName()+"</td><td>");
					out.print(pd.getDescription()+"</td><td>");
					out.print(pd.getPrice()+"</td></tr>");
					sn++;
					
				}
			%> --%>
			
			<c:forEach var="pd" items="${ products }">
				<tr>
					<td>${ pd.id }</td>
					<td>${ pd.name }</td>
					<td>${ pd.description }</td>
					<td>${ pd.price }</td>
					<td>
					<a href="updateProduct?id=${pd.id}"><button class="btn btn-primary btn-sm">Edit</button></a>
					<button class="btn btn-primary btn-sm" onclick="deleteProduct(${pd.id})" >Delete</button>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	<!-- 
		${ products }
		<hr>
		<%=request.getAttribute("products") %>
		<br>
		<%="hello" %>
		<br>
		<%=3+9/4 %>
		<%!	int x=123; float price=234.43f; %>
		<%=x*price %>
		<%
			
			String fName = "Sanjay";
			String lName = "Pajiyar";
			String fullName = fName+lName;
			
			out.print("<h1>"+fullName+"</h1>");
		%>
		
		 -->
	</div>
	
</body>
<script type="text/javascript">
	function deleteProduct(id){
		let confirmed = window.confirm("Delete Confire? ");
		if(confirmed){
			const xhttp = new XMLHttpRequest();
			  xhttp.onload = function() {
				console.log(this.responseText);
			    window.alert("Product deleted from the database!");
			    window.location.href = "products";
			    }
			  xhttp.open("POST", "deleteProduct?id="+id, true);
			  xhttp.send();
		}
	}
</script>
</html>