<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
</head>
<body>

<div style="background-color: yellow">
<!-- Background image -->
	<h1>Display details</h1>
		<form action="mail" method="get">
			<h3>display email : ${email}</h3>
			<input type="submit" />
		</form>
		<form action="mobile" method="get">
			<h3>display mobile : ${mobile}</h3>
			<input type="submit" />
		</form>
		<form action="adhar" method="get">
			<h3>display adhar : ${adhar}</h3>
			<input type="submit" />
		</form>
		<form action="age" method="get">
			<h3>display age : ${age}</h3>
			<input type="submit" />
		</form>
		<form action="dob" method="get">
			<h3>display dob : ${dob}</h3>
			<input type="submit" />
		</form>
		<form action="desiredSal" method="get">
			<h3>display desiredSal : ${desiredSal}</h3>
			<input type="submit" />
		</form>
		<form action="friendslist" method="get">
			<h3>display friendslist :</h3>
			<input type="submit" />
			<ul>
				<c:forEach items="${friendslist}" var="item">
					<li>${item}</li>
				</c:forEach>
			</ul>
		</form>
		<form action="visitedPlace" method="get">
			<h3>display visitedPlace :</h3>
			<input type="submit" />
			<ul>
				<c:forEach items="${visitedPlace}" var="item">
					<li>${item}</li>
				</c:forEach>
			</ul>
		</form>
		<form action="listofSkills" method="get">
			<h3>display listofSkills :</h3>
			<input type="submit" />
			<ul>
				<c:forEach items="${listofSkills}" var="item">
					<li>${item}</li>
				</c:forEach>
			</ul>
		</form>
		<form action="e" method="get">
			<h3>display Eduction details :</h3>
			<h2>Degree: ${dispalyDegree}</h2>
			<h2>Course: ${dispalyCourse}</h2>
			<h2>Branch: ${dispalyBranch}</h2>
			<h2>Year : ${dispalyyear}</h2>
			<input type="submit" />
		</form>
		<form action="f" method="get">
			<h3>display Family details :</h3>

			<h2>FatherName: ${fatherName}</h2>
			<h2>MotherName: ${motherName}</h2>
			<h2>Sisters: ${sisters}</h2>
			<h2>Borthers : ${borthers}</h2>
			<h2>GrandFathe : ${cousin}</h2>
			<h2>GrandMother : ${grandFather}</h2>
			<h2>Cousin : ${grandMother}</h2>
			<h2>Uncle : ${uncle}</h2>
			<h2>Aunts : ${aunts}</h2>
			<h2>Nices : ${nices}</h2>
			<input type="submit" />
		</form>
		<form action="m" method="get">
			<h3>display Modile details :</h3>
			<h2>Name: ${name}</h2>
			<h2>Price: ${price}</h2>
			<h2>Size: ${size}</h2>
			<h2>Model : ${model}</h2>
			<h2>Color : ${color}</h2>
			<input type="submit" />
		</form>
		<form action="b" method="get"></br>
			<h3>display Family details :</h3>
			<h2>Applejuice: ${Applejuice}</h2>
			<h2>Mangojuice: ${Mangojuice}</h2>
			<h2>Orengjuice: ${Orengjuice}</h2>
			<h2>Watermelonjuice: ${Watermelonjuice}</h2>
			<h2>Wine : ${Wine}</h2>
			<h2>Kivijuice : ${Kivijuice}</h2>
			<h2>Soda : ${getSoda}</h2>
			<input type="submit" />
		</form>
		<form action="c" method="get">
			<h3>display Family details :</h3>
			<h2>Chat1: ${Chat1}</h2>
			<h2>Chat2: ${Chat2}</h2>
			<h2>Chat3: ${Chat3}</h2>
			<h2>Chat4: ${Chat4}</h2>
			<h2>Chat5 : ${Chat5}</h2>
			<h2>Chat6 : ${Chat6}</h2>
			<h2>Chat7 : ${Chat7}</h2>
			<h2>Chat8 : ${Chat8}</h2>
			<h2>Chat9 : ${Chat9}</h2>
			<h2>Chat10 : ${Chat10}</h2>
			<h2>Chat11 : ${Chat11}</h2>
			<input type="submit" />
		</form>

	</div>
</body>
</html>