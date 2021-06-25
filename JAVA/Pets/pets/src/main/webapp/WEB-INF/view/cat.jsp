<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Display <c:out value="${cat.getName()}"></c:out> </title>
		<!-- usamos el gato creado en Cat.controller para traer los metodos asoiados -->
</head>
<body>
	 <h3>You created a <c:out value="${cat.breed}"/>!</h3>
	<c:out value="${cat.showAffection()}"/>
</body>
</html>