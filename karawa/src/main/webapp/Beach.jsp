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
	<h2>Welcome to Beach</h2>
	<form action="foreighners" method="post">
		<div class="mb-3">
			<label for="formFile" class="form-label">Name</label> <input
				type="text" class="form-control" name="beachName" id="formFile"
				placeholder="Enter your Casino name" />
		</div>
		Select your location <select class="form-select"
			aria-label="Default select example" name="location">
			<option selected>Select your location</option>
			<option value="North goa">North goa</option>
			<option value="South goa">South goa</option>
			<option value="Central goa">Central goa</option>
		</select>
		<div class="mb-3">
			Clean :Yes<input name="clean" type="radio" value="true"/>
				 	No<input name="clean" type="radio" value="false"/>
		</div>
		Select your game <select class="form-select"
			aria-label="Default select example" name="gameType">
			<option selected>Select your game</option>
			<option value="Volleyball">Volleyball</option>
			<option value="Football">Football</option>
			<option value="Kabaddi">Kabaddi</option>
			<option value="Throwball">Throwball</option>
		</select>
		<input type="submit" value="Click to register" class="btn btn-primary">
		</form>
</body>
</html>