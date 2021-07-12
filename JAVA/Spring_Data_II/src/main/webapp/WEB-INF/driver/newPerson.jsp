<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
  <head>
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<title>New Person</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
  
  </head>

  <body>
  	 <div class="container">
            <div class="row">
                <div class="col-6">
                    <div class="row my-2">
                        <h1>New Person</h1>
                    </div>
                    
                    <form:form action="/persons" method="post" modelAttribute="person">
                    	<div class="row my-2">
	                        <div class="col-6">First Name: </div>
	                        <form:input path="firstName" class="col-6" name="firstName"/>
	                    </div>
	                    <div class="row my-2">
	                        <div class="col-6">Last Name: </div>
	                        <form:input path="lastName" class="col-6" name="lastName"/>
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