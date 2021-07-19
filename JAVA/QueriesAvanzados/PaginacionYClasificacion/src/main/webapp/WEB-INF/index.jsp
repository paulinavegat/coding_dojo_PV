<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">

 <title>Dojos and Ninjas</title>
</head>
<body>
	<div id = "wrapper" class="mx-5 my-3" style="width: 800px;" >
	   
		<table class = "table table-bordered table-hover">
		    <thead class = "table-active">
		    	<tr>
			    	<th>Dojo name</th>
			        <th>Ninja first name</th>
			        <th>Ninja last name</th>
		    	</tr>
		    </thead>
		    <tbody>
		        <c:forEach var = "row" items = "${table}">                
		        <tr>
		            <td>${row[0].name}</td>
		            <td>${row[1].firstName}</td>
		            <td>${row[1].lastName}</td>
		        </tr>
		        </c:forEach>
		    </tbody>
		</table>
	</div>
</body>
</html>