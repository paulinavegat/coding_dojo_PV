<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Random Word</title>
</head>
<body>
<div class="container">
			<h3>Random Word Generator</h3>
			<p>You have generated a word <c:out value="${count}"></c:out> times.</p>
			<p> Your random word is: </p>
			<input  placeholder="<c:out value="${randword}"></c:out>">
			<a href="/RandomWord/RandomW"><button>Generate</button></a>
			<p><b>The last time you generated a word was: </b><c:out value="${date}"></c:out></p>
			
		</div>
	
</body>
</html>