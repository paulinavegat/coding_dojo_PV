<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Pets</title>
</head>
<body>
		<div class="dog">
			<h4>Make a Dog!</h4>
			<form method="get" action="/pets/Dogs">
			<p>Name: <input class="inputs" type="text" name="name"></p>
			<p>Breed: <input class="inputs" type="text" name="breed"></p>
			<p>Weight: <input class="inputs" type="text" name="weight"></p>
			<input class="btn" type="submit" value="Submit">
			</form>
		</div>
		<div class="cat">
			<h4>Make a Cat!</h4>
			<form method="get" action="/pets/Cats">
			<p>Name: <input class="inputs" type="text" name="name"></p>
			<p>Breed: <input class="inputs" type="text" name="breed"></p>
			<p>Weight: <input class="inputs" type="text" name="weight"></p>
			<input class="btn" type="submit" value="Submit">
			</form>
		</div>	
</body>
</html>