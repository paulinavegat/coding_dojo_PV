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
		  <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
		  		  <button type="submit" class="btn btn-link"> Home </button>
				</form>
		  	<form method="POST" action="/logout">
					<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
					<button type="submit" class="btn btn-link"> Logout </button>
				</form>
		</div>

        <div class="row">
            <div class="row my-3">
                <h2>Current Listings</h2>
            </div>

            <table class="table table-striped mt-5 border border-3">
                <tr class=" border border-3">
                    <th class=" border border-3">Address</th>
                    <th class=" border border-3">Pool Size</th>
                    <th class=" border border-3">Cost per night</th>
                    <th class=" border border-3">Details</th>
                </tr>
                <c:forEach var="row" items="${userListings}">
                    <tr class=" border border-3">
                        <td class=" border border-3">${row[1]}</td>
                        <td class=" border border-3">${row[2]}</td>
                        <td class=" border border-3">$${row[3]}</td>
                        <td class=" border border-3"><a href="/host/pools/${row[0]}">${row[4]}/5 - Edit</a></td>
                    </tr>
                </c:forEach>
            </table>
        </div>
         <div class="row mt-4">
                <div class="col-7 mx-2 p-4 border border-2">
                  <div class="row my-3">
                       <h2>New Listings</h2>
                    </div>  
                    
                    <form:errors path="pool.*" />                 
                    <form:form method="POST" action="/createPool" modelAttribute="pool">
                        
                        <div class="form-group mb-3">
                            <form:label path="address">Address</form:label>
                            <form:errors path="address"></form:errors>
                            <form:input class="form-control" path="address"></form:input>
                        </div>

                        <div class="form-group mb-2">
                            <form:label path="description">Description:</form:label>
                            <textarea name="description" class="form-control"></textarea>
                            <form:errors path="description"></form:errors>
                        </div>
                        <div class="form-group mb-2">
                            <form:label path="cost">Cost per night: $</form:label>
                            <form:errors path="cost"></form:errors>
                            <form:input type="number" class="form-control" step="100" path="cost" />
                        </div>
                        <div class="form-group mb-2">
                            <form:label path="size">Pool Size</form:label>
                            <form:select path="size" class="form-control">
                                <option selected disabled>Size</option>
                                <form:option value="Small">Small</form:option>
                                <form:option value="Medium">Medium</form:option>
                                <form:option value="Large">Large</form:option>
                            </form:select>
                        </div>
                        <div class="d-flex flex-row-reverse mt-2">
                            <Button class="btn btn-primary" type="submit">Add Listing</Button>
                        </div>
                    </form:form>
                </div>
            </div>
        </div>
    
</body>

</html>