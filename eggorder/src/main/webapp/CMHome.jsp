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
			<a class="navbar-brand" href="#"
				class="d-inline-block align-text-top"><img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" height="48" width="80"> </a> <a href="index.jsp">Home
				Page</a>
		</div>
	</nav>
	<h1>Welcome to CM page</h1>
	<form action="cm" method="post">
		<div class="mb-3">
			<label for="formFile" class="form-label">Name</label> <input
				type="text" class="form-control" name="name" id="formFile"
				placeholder="Enter your Cm name" />
		</div>
		Select your party <select class="form-select"
			aria-label="Default select example" name="party">
			<option selected value="">Select your type of party</option>
			<option>BJP</option>
			<option>Congress</option>
			<option>JDS</option>
			<option>AAP</option>
			<option>KJP</option>
			
		</select>
		Select your state <select class="form-select"
			aria-label="Default select example" name="state">
			<option selected value="">Select your state</option>
			<option>KA</option>
			<option>UP</option>
			<option>TS</option>
			<option>AP</option>
		</select>
		
		Tenure <select class="form-select"
			aria-label="Default select example" name="tenure">
			<option selected value="">Select</option>
			<option>1</option>
			<option>2</option>
			<option>3</option>
			<option>4</option>
			<option>5</option>
			<option>6</option>
		</select>
		<div class="mb-3">
			Portfolio<textarea rows="3" cols="50  name="portfolio"></textarea>
			</div>
			<input type="submit" value="Save" class="btn btn-primary"/>
</form>
</body>
</html>