<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>    
<!DOCTYPE html>
<html>
  <head>
	<meta charset="ISO-8859-1">
	<title>Dashboard</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
  
  </head>

  <body>
	<div class="container">
		<a href="/new">Add New</a> | <a href="search/topTen">Top Songs</a> 
				<form action="/search" method="post">
					<input type="search" name="artist" placeholder="artist">
					<input type="submit" value="Search Artists">
				</form>
		<h2 class= 'mt-4'>Song Selection:</h2>
		<table class= "table" border="1">
		    <thead class="thead-dark">
		        <tr>
		            <th>Name</th>
		            <th>Rating</th>
		            <th>Action</th>
		        </tr>
		    </thead>
		    <tbody>
		        <c:forEach items="${songs}" var="song">
		        <tr>
		            <td><a href="songs/${song.id}"><c:out value="${song.title}"/></a></td>
		            <td><c:out value="${song.rating}"/></td>
		            <td><form action="songs/delete/${song.id}" method="post">
		    				<input type="hidden" name="_method" value="delete">
		    				<input type="submit" value="Delete">
						</form></td>
		        </tr>
		        </c:forEach>
		    </tbody>
		</table>
	</div>

  </body>
</html>