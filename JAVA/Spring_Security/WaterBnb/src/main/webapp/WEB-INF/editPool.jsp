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
            <form method="POST" action="/host/dashboard">
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
                <button type="submit" class="btn btn-link"> Home </button>
            </form>
            <form method="POST" action="/logout">
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
                <button type="submit" class="btn btn-link"> Logout </button>
            </form>
        </div>

        <div class="row">
            <div class="col-5 mx-2 p-4">
                <div class="row mb-3">
                    <h2>${pool.address}</h2>
                </div>
                <div class="row mb-3">
                    <h2>${row[1]}</h2>
                        <form:errors path="pool.*" />
                        <form:form method="POST" action="/edit" modelAttribute="pool">
                        <form:hidden path="id" value="${row[0]}" />
                        <form:label class="mb-2" path="description">Description:</form:label>
                        <div class="input-group input-group-lg mb-2">
                            <form:textarea path="description" value="${row[2]}" class="form-control" aria-label="With textarea"></form:textarea>
                            <form:errors path="description"></form:errors>
                        </div>
                        <Button class="btn btn-primary mt-2" type="submit">Save Changes</Button>
                	</div>
            </div>


            <div class="col-5 mx-2 mb-3  p-4">
                    <h3>Email: ${currentUser.email}</h3>
                    <h3>Name: ${currentUser.first_name} ${currentUser.last_name}</h3>

                    <h2>${row[1]}</h2>
                    <div class="row my-3">
                        <div class="col-6">
                            <form:label path="size" >Pool Size</form:label>
                        </div>
                        <div class="col-6">
                            <form:select path="size" class="form-control">
                                <option selected disabled>Size</option>
                                <form:option value="Small">Small</form:option>
                                <form:option value="Medium">Medium</form:option>
                                <form:option value="Large">Large</form:option>
                            </form:select>
                        </div>
                    </div>
                    <div class="row mb-2">
                        <div class="col-6">
                            <form:label path="cost">Cost per night: $ </form:label>
                        </div>
                        <div class="col-6">
                            <form:input type="number" class="form-control" min="100.00" step="100.00" path="cost" value="${row[3]}"></form:input>
                        </div>
                    </div>
                  </form:form>
                </div>
            </div>
            <div class="row">
                <h3>Reviews (${pool.average_reviews}/5):</h3>
                <c:forEach var="row" items="${reviews}" varStatus="loop">
                    <p>${row[0]} ${row[1]}</p>
                    <p>${row[3]}/5</p>
                    <p>${row[2]}</p>
                    <c:if test="${!loop.last}">__________________________</c:if>
                </c:forEach>
            </div>
        </div>
</body>

</html>