<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
</head>
<body>
<h1>valentine success</h1>
<form action="search" method="get">
Search by id <input  type="text" name="id"/>
<input type="submit" value="search"/> 
</form>
 <div>
 <h3>save and search details</h3>
 <pre>
 Name : ${dto.name}
 ValenrainName:${dto.valentineName} 
 Places :${dto.places}
 Gifts : ${dto.gifts}
 </pre>
 </div>

</body>
</html>