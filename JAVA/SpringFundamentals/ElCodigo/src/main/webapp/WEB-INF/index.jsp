<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>The code</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>

	<h3>What is the code?</h3>
		<p><c:out value="${error}"></c:out></p>
			<form action="/randomCode" method="POST">
			<input type="text" name="randomCode"/>
			<br/>
			<button>Try Code</button>
		</form>
	
	</body>
</html>