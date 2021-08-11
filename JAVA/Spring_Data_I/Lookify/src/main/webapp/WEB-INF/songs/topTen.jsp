<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>  
<!DOCTYPE html>
<html>
  <head>
	<meta charset="ISO-8859-1">
	<title>TopTen</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
 
  </head>

  <body>
  
  		<div class="container">
			<a href="/dashboard">Dashboard</a>
			<form action="/search" method="post">
			<input type="search" name="artist" placeholder="artist">
			<input type="submit" value="Search Artists">
			</form> 
			
		<h2 class= 'mt-4'>Top Ten Songs:</h2>
		<table class= "table" border="1">
		    <thead class="thead-dark">
		        <tr>
		            <th>Rating</th>
		            <th>Title</th>
		            <th>Artist</th>
		        </tr>
		    </thead>
		    <tbody>
		        <c:forEach items="${songs}" var="song">
		        <tr>
		            <td><c:out value="${song.rating}"/></td>
		            <td><a href="songs/${song.id}"><c:out value="${song.title}"/></a></td>
		            <td><c:out value="${song.artist}"/></td>
		        </tr>
		        </c:forEach>
		    </tbody>
		</table>
	</div>
	
  </body>
</html>