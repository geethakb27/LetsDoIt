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
				alt="" height="48" width="80"> </a>
		</div>
	</nav>
	<h1>Welcome to Bakery page</h1>
	<form action="bakery" method="post">
		<div class="mb-3">
			<label for="formFile" class="form-label">Name</label> <input
				type="text" class="form-control" name="name" id="formFile"
				placeholder="Enter your Bakery name" />
		</div>
		<div class="mb-3">
			<label for="formFile" class="form-label">Owner Name</label> <input
				type="text" class="form-control" name="ownerName" id="formFile"
				placeholder="Enter your Owner name" />
		</div>
		<div class="mb-3">
			<label for="formFile" class="form-label">Owner Wife Name</label> <input
				type="text" class="form-control" name="ownerWifeName" id="formFile"
				placeholder="Enter your Owner Wife name" />
		</div>
		<div class="mb-3">
			Owner Married :Yes<input name="married" type="radio" value="true"/>
				 	No<input name="married" type="radio" value="false"/>
		</div>
		<div class="mb-3">
			<label for="formFile" class="form-label">Famous for</label>
			 <textarea rows="4" cols="20" name="famousFor"></textarea>
		</div>
		<div class="mb-3">
			<label for="formFile" class="form-label">Since</label> <input
				type="text" class="form-control" name="since" id="formFile"
				placeholder="Enter your bakery since in year" />
		</div>
		<input type="submit" value="Save" class="btn btn-primary">
		</form>
</body>
</html>