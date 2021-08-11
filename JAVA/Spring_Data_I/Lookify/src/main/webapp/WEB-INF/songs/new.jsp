<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
  <head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
  
  </head>

  <body>
  	<div class ="container">
			<a href="/dashboard">Dashboard</a>
			
			<form action="/search" method="post">
			<input type="search" name="artist" placeholder="artist">
			<input type="submit" value="Search Artists">
			</form> 
			
			<h2 class= 'mt-4'>Add a new song:</h2>
			<form:form action='/new' method='post' modelAttribute="song">
			<form:errors cssStyle="color: #ff0000" path="*"/>
			
               <div class='row'>
                    <form:label path="title">Title:</form:label>
                    <form:input cssClass="form-control" path="title"/>
              </div>
                
                <div class="row mt-2">
                    <form:label path="artist">Artist:</form:label>
                    <form:input cssClass="form-control" path="artist"/>
                </div>
                <div class="row mt-2">
                    <form:label path="rating">Rating (1-10):</form:label>
                    <form:input type="number" cssClass="form-control" path="rating"/>
                </div>
                <div class = "row mt-3">
                    <button class='btn btn-primary' type='submit'>Create</button>
                </div>          
	   </form:form>
  </div>	
	
  </body>
</html>