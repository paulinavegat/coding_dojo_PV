<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page import="java.util.Date, java.text.SimpleDateFormat, java.text.ParseException" %>
<!DOCTYPE html>
<html>
  <head>
  		<meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<title>New License</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
  
  </head>

  <body>
	 <div class="container">
            <div class="row">
                <div class="col-6">
                    <div class="row my-2">
                        <h1>New License</h1>
                    </div>
                    <form:form action="/licenses/new" method="post" modelAttribute="license">
	                    <div class="row my-2">
	                        <div class="col-6">Person: </div>
	                        <form:select path="person" name="person" id="person">
	                        	<c:forEach items="${person}" var="person">
	                            	<form:option value="${person}"><c:out value="${person.firstName} ${person.lastName }"></c:out></form:option>
	                            </c:forEach>
	                        </form:select>
	                    </div>
	                    <div class="row">
	                    	<form:errors class="text-danger" path="person"/>
	                    </div>
	                    <div class="row my-2">
	                        <div class="col-6">State: </div>
	                        <form:input path="state" type="text" class="col-6" name="state"></form:input>
	                    </div>
	                    <div class="row">
	                    	<form:errors class="text-danger" path="state"/>
	                    </div>
	                    <div class="row my-2">
	                        <div class="col-6">Expiration Date: </div>
	                        <form:input path="expirationDate" type="date" class="col-6" name="state"></form:input>
	                   </div>
	                    <div class="row">
	                    	<form:errors class="text-danger" path="expirationDate"/>
	                    </div>
	                    <div class="row my-2 justify-content-end">
	                        <div class="col-3">
	                            <Button class="btn btn-primary" type="submit">Create</Button>
	                        </div>
	                    </div>
                    </form:form>
                                     
                </div>
            </div>
        </div>
  </body>
</html>