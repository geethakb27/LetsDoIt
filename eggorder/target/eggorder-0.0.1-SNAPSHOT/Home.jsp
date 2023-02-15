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
	<h1>Welcome to Egg page</h1>
	<form action="egg" method="post">
		<div class="mb-3">
			<label for="formFile" class="form-label">Name</label> <input
				type="text" class="form-control" name="hotelName" id="formFile"
				placeholder="Enter your Hotel name" />
		</div>
		Select your dish name <select class="form-select"
			aria-label="Default select example" name="dishName">
			<option selected>Select your type of food</option>
			<option value="Omlet">Omlet</option>
			<option value="Egg-rice">Egg-rice</option>
			<option value="Egg dosa">Egg dosa</option>
			<option value="Egg Burji">Egg Burji</option>
			<option value="Egg Masala">Egg Masala</option>
			<option value="Egg Curry">Egg Curry</option>
			<option value="Egg Chilli">Egg Chilli</option>
			<option value="Egg Bonda">Egg Bonda</option>
			<option value="Egg Maggie">Egg Maggie</option>
		</select>
		Select your type <select class="form-select"
			aria-label="Default select example" name="type">
			<option selected>Select your type</option>
			<option value="Naati">Naati</option>
			<option value="Form">Form</option>
			<option value="Boiler">Boiler</option>
			<option value="Ostrich">Ostrich</option>
		</select>
		<div class="mb-3">
			<label for="formFile" class="egg">Price</label> <input
				class="form-control" name="price" type="number" id="price"
				placeholder="Enter your Price"/>
		</div>
		Select your quantity <select class="form-select"
			aria-label="Default select example" name="quantity">
			<option selected>Select your quantity</option>
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
			<option value="5">5</option>
			<option value="5">6</option>
		</select>
		<div class="mb-3">
			Take Away :Yes<input name="takeAway" type="radio" value="true"/> No<input name="takeAway" type="radio" value="false"/>
		</div>
		<input type="submit" value="Order" class="btn btn-primary"/>
</form>
</body>
</html>