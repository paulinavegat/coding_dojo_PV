
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Counter</title>
	</head>

<body>
	<div class="container">
		<a href="/ButtonClicker/Counter"><button>Click Me!</button></a>
		<h2>You have clicked the button <c:out value="${count} "/>time(s)!</h2>
	</div>
</body>
</html>