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
			
		<div class="row">
		    <div class="col-6 mx-2 p-4">
		        <div class="row mb-3">
		            <h3>${pool.address}</h3>
		        </div>
		        <div class="row mb-3">
		            <p>${pool.description}</p>
		        </div>
		    </div>
		
		    <div class="col-5 mx-2 mb-3  p-4">
		        <h3>Email: ${pool.host.email}</h3>
		        <h3>Name: ${pool.host.first_name} ${pool.host.last_name}</h3>
		
		        <div class="row my-3">
		            <div class="col-6">
		                <p>Pool Size: </p>
		            </div>
		            <div class="col-6">
		                <p>${pool.size}</p>
		            </div>
		        </div>
		        <div class="row my-3">
		            <div class="col-6">
		                <p>Cost: </p>
		            </div>
		            <div class="col-6">
		                <p>$${pool.cost}</p>
		            </div>
		        </div>
		    </div>
		</div>
		
		<div class="d-flex flex-row-reverse mt-2 ">
		    <c:choose>
		        <c:when test="${principal == null}">
		            <a href="/guest/signin">Log in to leave a review</a>
		        </c:when>
		        <c:otherwise>
		            <c:if test="${currentUser.role == 'guest'}">
		                <a href="/pools/${pool.id}/review">Leave a review</a>
		            </c:if>
		        </c:otherwise>
		    </c:choose>
		</div>
		<div class="row">
		    <h3>Reviews (${pool.average_reviews}/5)</h3>
		</div>
		<div class="my-2 p-4 border border-2">
		    <c:forEach var="row" items="${reviews}" varStatus="loop">
		        <p>${row[0]} ${row[1]}</p>
		        <p>${row[3]}/5</p>
		        <p>${row[2]}</p>
		        <c:if test="${!loop.last}"> <hr/></c:if>
		    </c:forEach>
		</div>
	</div>
</body>
</html>