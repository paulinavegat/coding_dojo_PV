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
	 <div class="row my-2">
            <h2>Welcome</h2>
            <hr />
        </div>
            <div class="row">
                <div class="col-5 mx-2 p-4 border border-2">
                    <div class="row my-2">
                    	<h2>Register</h2>
                    	 </div>

			                <form:errors path="user.*" />
			                <form:form method="POST" action="/registration" modelAttribute="user">
			
			                 <div class="form-group mb-3">
						        <form:label path="first_name">First Name</form:label>
						        <form:errors path="first_name"/>
						        <form:input class="form-control" path="first_name" />
						    </div>
						    <div class="form-group mb-3">
						        <form:label path="last_name">Last Name</form:label>
						        <form:errors path="last_name"/>
						        <form:input class="form-control" path="last_name" />
						    </div>
							 <div class="form-group mb-3">
						        <form:label path="email">Email</form:label>
						        <form:errors path="email"/>
						        <form:input type="email" class="form-control" path="email" />
						    </div>
			                     <div class="form-group mb-3">
						        <form:label path="password">Password</form:label>
						        <form:errors path="password"/>
						        <form:password class="form-control" path="password" />
						    </div>
						    <div class="form-group mb-3">
						        <form:label path="passwordConfirmation">Confirm Password</form:label>
						        <form:errors path="passwordConfirmation"/>
						        <form:password class="form-control" path="passwordConfirmation" />
						    </div>
			                    <div class="col-4 mt-2">
			                        <form:select class="form-control"  path="role">
			                            <option selected disabled>User Type</option>
			                            <form:option value="host">Host</form:option>
			                            <form:option value="guest">Guest</form:option>
			                        </form:select>
			                    </div>
			                    <div class="d-flex flex-row-reverse mt-2">
			                        <Button class="btn btn-primary" type="submit">Register</Button>
			                    </div>
			                </form:form>
			            </div>
			        	<div class="col"></div>
			       	    <div class="col-5 mx-2 p-4 border border-2">
			          	  <div class="row my-2">
			                <c:if test="${logoutMessage != null}">
			                    <p>${logoutMessage}</p>
			                </c:if>
			                <h2>Login</h2>
			            </div>
			            <c:if test="${errorMessage != null}">
			                <p>${errorMessage}</p>
			            </c:if>
			            <div class="form-group mb-3">
			                <form:form method="POST" action="/guest/signin">
			
			                <div class="form-group mb-3">
								<label for="email">Email</label>
								<input type="email" name="username" class="form-control" />
							</div>
							
							<div class="form-group mb-3">
						        <label for="password">Password</label>
						        <input type="password" name="password"class="form-control" />		        
						    </div>
			
			                    <input type="hidden"  name="${_csrf.parameterName}" value="${_csrf.token}" />
			                    <div class="d-flex flex-row-reverse mt-2">
			                        <Button class="btn btn-primary" type="submit">Login</Button>
			                    </div>
			                </form:form>
			            </div>
			        </div>
			    </div>
			</div>
</body>

</html>