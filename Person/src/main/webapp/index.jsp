<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>x-Workz</title>
</head>
<body>
	<h1>page to send Message</h1>
	<form action="details" method="POST">
		<pre>
  		
FirstName<input type="text" name="firstName" />
LastName<input type="text" name="lastName" />
Gender:
Male<input type="radio" name="gender" value="male">
Female<input type="radio" name="gender" value="female">
Other<input type="radio"name="gender" value="other">

Reason<textarea row="5" cols="25" name="reason"/></textarea>
Address<textarea row="5" cols="25" name="address"/></textarea>

<input type="submit" value="Send">
  
  </pre>


	</form>
</body>
</html>