<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
        crossorigin="anonymous">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>WaterBnB</title>

</head>
<body>
	<div class="container" style="width: 920px">
		<div class="d-flex flex-row-reverse mt-2">
				<c:choose>
					<c:when test="${principal == null}">
						<a href="/landing">Home</a>
						<a href="/guest/signin">Log In |</a>
					</c:when>
					<c:otherwise>
						<c:if test="${currentUser.role == 'host'}">
							<a href="/host/dashboard">Home</a>
						</c:if>
						<c:if test="${currentUser.role == 'guest'}">
							<a href="/landing">Home</a>
						</c:if>
								
									
						<form method="POST" action="/logout">
							<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
							<button type="submit" class="btn btn-link"> Logout </button>
						</form>
					</c:otherwise>
				</c:choose>
			</div>
			   	<div class="row my-3">		
					<h2>Find Your Pool!</h2>
				</div>
				<div class="row my-3">
            		<div class="d-flex">
					<form:form method="POST" action="/search">
						<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
						<label>Search:
					
						<input type="text" name="searchQuery"></label>
						<Button class="btn btn-primary" type="submit">Search</Button>
					</form:form>
				</div>	
			 </div>	
				 <table class="table table-striped mt-5 border border-3">
					<tr class=" border border-3">
						<th class=" border border-3">Address</th>
						<th class=" border border-3">Pool Size</th>
						<th class=" border border-3">Cost per night</th>
						<th class=" border border-3">Details</th>
					</tr>
					<c:forEach var="pool" items="${pools}">
						<tr>
							<td class=" border border-3">${pool.address}</td>
							<td class=" border border-3">${pool.size}</td>
							<td class=" border border-3">${pool.cost}</td>
							<td class=" border border-3"><a href="/pools/${pool.id}">${pool.average_reviews}/5 - See More</a></td>
						</tr>
					</c:forEach>
				</table>
	       </div>
				
</body>
</html>
