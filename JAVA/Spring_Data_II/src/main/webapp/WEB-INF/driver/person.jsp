<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  
 
<!DOCTYPE html>
<html>
 <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<meta charset="ISO-8859-1">
	<title>Driver</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
  </head>

  <body>
  	<div class="container">
            <div class="row">
                <div class="col-6">
                    <div class="row my-2">
                        <h1><c:out value="${person.firstName} ${person.lastName}" /></h1>
                    </div>
                    <div class="row my-2">
                        <div class="col-6">License Number: </div>
                        <div class="col-6"><c:out value="${license.number}" /></div>
                    </div>
                    <div class="row my-2">
                        <div class="col-6">State: </div>
                        <div class="col-6"><c:out value="${license.state}" /></div>
                    </div>
                    <div class="row my-2">
                        <div class="col-6">Expiration Date: </div>
                        <div class="col-6"><fmt:formatDate type="date" value="${license.expirationDate}" /></div>
                    </div>
                </div>
            </div>
          </div>
    </body>
</html>