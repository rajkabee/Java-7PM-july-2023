<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js" integrity="sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V" crossorigin="anonymous"></script>
<style type="text/css">
	.forms{
		width: 60%;
		margin: auto;
	}
</style>
</head>
<body>
	<div class="container">
		<h1 class="display-2 text-white bg-primary text-center">Products</h1>
		
		<form class="forms bg-secondary p-5 text-dark" action="addProduct" method="post">
			<h1 class="text-white text-center">New Product Form</h1>
			<div class="mb-3">
			  <label for="name" class="form-label">Product Name: </label>
			  <input type="text" class="form-control" name="name" id="name" placeholder="Product Name">
			</div>
			<div class="mb-3">
			  <label for="description" class="form-label">Product Description</label>
			  <textarea class="form-control" id="description" name="description"  rows="3"></textarea>
			</div>
			<div class="mb-3">
			  <label for="price" class="form-label">Product Price: </label>
			  <input type="text" class="form-control" name="price" id="price" placeholder="Price">
			</div>
			<div class="mb-3">
			  <input class="form-control btn btn-primary" type="submit" value="Submit">
			</div>
			
		</form>
	</div>
	
</body>
</html>