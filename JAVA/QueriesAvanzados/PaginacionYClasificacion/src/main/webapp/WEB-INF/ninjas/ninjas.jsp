<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
		<title>New Ninja</title>
</head>
<body>
    <div id = "ninjas" class="mx-5 my-3" style="width: 800px;" >
	    <h1 class="text-center">Ninjas </h1>
	    
	    <div id = "links">
		    <a href = "/">Click here to view all the dojos and ninjas</a><br>
			<a href = "/dojos/1">Click here to view the dojos in alphabetical order</a>
	    </div>
	    
	    <table class = "table table-striped table-bordered table-hover">
	        <thead>
	        	<tr class = "table-primary">
		        	<th>First Name</th>
		            <th>Last Name</th>
	        	</tr>
	        </thead>
	        <tbody>
	            <c:forEach var = "ninja" items = "${ninjas.content}">                 
	            <tr>
	                <td>${ninja.firstName}</td>
	                <td>${ninja.lastName}</td>
	            </tr>
	            </c:forEach>
	        </tbody>
	    </table>
	    
	    <div id = "pages">
			<c:forEach begin = "1" end = "${totalPages}" var = "index">
		        <a href = "/ninjas/${index}">${index}</a>
		    </c:forEach>
		</div>
	</div>
</body>
</body>
</html>