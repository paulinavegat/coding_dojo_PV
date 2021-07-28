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
	        <form method="POST" action="/landing">
	            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
	            <button type="submit" class="btn btn-link"> Home </button>
	        </form>
	        <form method="POST" action="/logout">
	            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
	            <button type="submit" class="btn btn-link"> Logout </button>
	        </form>
	    </div>
	
	    <div class="row">
	        <div class="col-8 mx-2 p-4">
	            <div class="row mb-3">
	                <h3>${pool.address}</h3>
	            </div>
	
	            <form:errors path="reviewObj.*" />
	            <form:form method="POST" action="/addReview" modelAttribute="reviewObj">
	                <form:hidden path="guest.id" value="${currentUser.id}" />
	                <form:hidden path="pool.id" value="${pool.id}" />
	
	                <form:label path="review" class="mb-2">Review:</form:label>
	                <div class="input-group input-group-lg mb-2">
	                    <form:textarea path="review" class="form-control" aria-label="With textarea"></form:textarea>
	                </div>
	
	                <form:label path="rating" class="mb-2">Rating:</form:label>
	                <form:input type="number" min="1" max="5" path="rating" class="form-control"/>
	                
	                <div class="d-flex flex-row-reverse mt-2">
	                    <Button class="btn btn-primary" type="submit">Submit Review</Button>
	                </div>
	            </form:form>
	        </div>
	    </div>
	</div>
</body>
</html>