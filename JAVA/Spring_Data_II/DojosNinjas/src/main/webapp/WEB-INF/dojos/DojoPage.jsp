<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
        crossorigin="anonymous">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dojo Page</title>
</head>
<body>
   <div class="container">
        <h1><c:out value="${dojo.name}"/> Ninjas</h1>
           <table class="table">
            <thead>
                <tr>
                    <th scope="col">First Name</th>
                    <th scope="col">Last Name</th>
                    <th scope="col">Age</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${dojo.ninjas}" var="d">
                    <tr>
                        <td><c:out value="${d.firstName}" /></td>
                        <td><c:out value="${d.lastName}" /></td>
                        <td><c:out value="${d.age}" /></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>


</body>
</html>