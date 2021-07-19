<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
        crossorigin="anonymous">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dojo Page</title>
</head>
<body>
   <div id = "ninjas" class="mx-5 my-3" style="width: 800px;" >
	    <h1 class="text-center">Dojos</h1>
	    
	    <a href = "/">Click here to view all the dojos and ninjas</a><br>
		<a href = "/ninjas/1">Click here to view the ninjas in alphabetical order</a>

	    <table class = "table table-striped table-bordered table-hover">
	        <thead>
	        	<tr class = "table-success">
		        	<th>Dojo name</th>
		            <th>Ninja first name</th>
		            <th>Ninja last name</th>
	        	</tr>
	        </thead>
	        <tbody>
	            <c:forEach var = "dojo" items = "${dojos.content}">                 
	            <tr>
	            	<td>${dojo[0].name}</td>
		            <td>${dojo[1].firstName}</td>
		            <td>${dojo[1].lastName}</td>
	            </tr>
	            </c:forEach>
	        </tbody>
	    </table>
	    
	    <div id = "pages">
			<c:forEach begin = "1" end = "${totalPages}" var = "index">
		        <a href = "/dojos/${index}">${index}</a>
		    </c:forEach>
		</div>
	</div>
</body>
</body>
</html>