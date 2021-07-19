<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
		<title>New Ninja</title>
</head>
<body>
    <div class="container mx-auto mt-5" style="width: 500px">
        <h1>New Ninja</h1>
        <form:form action="/ninjas/new" method="post" modelAttribute="ninja">
            <div class="form-group mb-3">
                <form:label path="dojo" class="form-label">Dojo:</form:label>
                <form:errors path="dojo" class="form-text"></form:errors>
                <form:select path="dojo" class="form-select">
                    <c:forEach items="${dojos}" var="dojo">
                        <form:option value="${dojo.id}">${dojo.name}</form:option>
                    </c:forEach>
                </form:select>
            </div>
            <div class="form-group mb-3">
                <form:label path="firstName" class="form-label">First Name:</form:label>
                <form:errors path="firstName" class="form-text"></form:errors>
                <form:input path="firstName" class="form-control"></form:input>
            </div>
            <div class="form-group mb-3">
                <form:label path="lastName" class="form-label">Last Name:</form:label>
                <form:errors path="lastName" class="form-text"></form:errors>
                <form:input path="lastName" class="form-control"></form:input>
            </div>
            <div class="form-group mb-3">
                <form:label path="age" class="form-label">Age:</form:label>
                <form:errors path="age" class="form-text"></form:errors>
                <form:input path="age" class="form-control" type="number"></form:input>
            </div>
            <button type="submit" class="btn btn-primary">Create</button>
        </form:form>
    </div>
</body>
</html>