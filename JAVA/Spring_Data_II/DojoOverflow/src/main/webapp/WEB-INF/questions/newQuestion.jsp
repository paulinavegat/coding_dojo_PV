<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
		<title>New Question</title>
</head>

<body>
<div class="container">
		<div class="row p-4 justify-content-center">
			<div class="col-sm-6">
				<h3 class="text-center"><a href="/questions">Dashboard</a></h3>
				<h1 class="text-center">What is your question?</h1>
			</div>
	</div>
		<div class="row justify-content-center">
			<div class="col-4 p-2">
				<form:form action="/questions/new" method="post" modelAttribute="addQuestion">
					<div class="row justify-content-start">
					<div class="col-6">
							<form:label path="question">Question</form:label>
							<p class="text-danger"><form:errors path="question"/></p>
					</div>
					<div class="col-6">
							<form:textarea path="question"/>
						</div>
					</div>
					<div class="row justify-content-start">
						<div class="col-6">
							<label>Tags</label>
							<p class="text-danger"><c:out value="${errors}"></c:out></p>
						</div>
						<div class="column is-two-thirds">
							<input name="qTag" class="input"/> 
						</div>
					</div>
					<div class="row justify-content-center p-4">
						<input type="submit" value="Create" class="btn btn-success"/>
					</div>
				</form:form>
			</div>
		</div>
	</div>
	
</body>
</html>