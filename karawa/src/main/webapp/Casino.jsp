<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"><img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" height="48" width="80"> </a> <a href="index.jsp">Home
				Page</a>
		</div>
	</nav>
	<h2>Welcome to Casino</h2>
	<form action="juice" method="get">
		<div class="mb-3">
			<label for="formFile" class="form-label">Name</label> <input
				type="text" class="form-control" name="casinoName" id="formFile"
				placeholder="Enter your Casino name" />
		</div>
		<div class="mb-3">
			<label for="formFile" class="form-label">Cruise Name</label> <input
				type="text" class="form-control" name="cruiseName" id="formFile"
				placeholder="Enter your Cruise name" />
		</div>
		<div class="mb-3">
			<label for="formFile" class="form-label">Entry Fee</label> <input
				class="form-control" name="entryFee" type="text"
				placeholder="Enter your entry fee"/>
		</div>
		<div class="mb-3">
			Free Food :Yes<input name="freeFood" type="radio" value="true"/>
				 	No<input name="freeFood" type="radio" value="false"/>
		</div>
		<div class="mb-3">
			Free Alcohol :Yes<input name="freeAlcohol" type="radio" value="true"/>
				 	No<input name="freeAlcohol" type="radio" value="false"/>
		</div>
		<input type="submit" value="Click to enter" class="btn btn-primary">
</form>
</body>
</html>