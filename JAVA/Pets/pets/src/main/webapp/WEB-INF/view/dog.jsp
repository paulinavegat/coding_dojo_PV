<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Display </title>
	
</head>
<body>
	
	<h4>You created a <c:out value="${dog.getBreed()}"></c:out>!</h4>
		<p><c:out value="${dog.showAffection()}"/></p>
		
</body>
</html>