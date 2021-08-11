<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
	<meta charset="ISO-8859-1">
	<title>Details of a song</title>
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
			<h3 class="mt-5 mb-2">Song Details</h3>
				<p class="font-weight-bold">Title: <c:out value="${song.title}"/></p>
				<p>Artist: <c:out value="${song.artist}"/></p>
				<p>Rating: <c:out value="${song.rating}"/></p>
			
				<form action="songs/delete/${song.id}" method="post">
		    	<input type="hidden" name="_method" value="delete">
		    	<input type="submit" value="Delete">
		</form>

</div>
	
  </body>
</html>