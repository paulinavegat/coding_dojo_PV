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
    <div class="container">
        <div class="d-flex flex-row-reverse mt-2">
            <a href="/guest/signin">Sign In/Sign Up </a>
        </div>
        <div class="row text-center  my-3">
            <h2>Find places to swim and sleep on water bnb!</h2>
        </div>
        <div class="row text-center  my-3">
            <div class="d-flex justify-content-center">
                <form:form method="POST" action="/search">
                    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
                    <label>
                    <input type="text" name="searchQuery" placeholder= "location" class="form-control"></label>
                    <Button class="btn btn-primary" type="submit">Search</Button>
                </form:form>
            </div>
        </div>
    </div>
</body>
</html>