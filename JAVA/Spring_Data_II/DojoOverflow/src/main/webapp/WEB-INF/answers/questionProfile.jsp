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
		<title>Question Profile</title>
</head>
<body>
<div class="container">
		<div class="row p-4 justify-content-center">
			<div class="col-sm-6">
				<h3 class="text-center"><a href="/questions">Dashboard</a></h3>
			</div>
		</div>
		
		<div class="row p-4">
			<h1 class="text-left"><c:out value="${ myquestion.question }"></c:out></h1>
		</div>
		
		<div class="row">
			<div class="col-sm-6">
				<div class="card-deck">
					<h4><span class="card text-center p-1">Tags: </span></h4>
					<c:forEach items="${qTags}" var="tag" varStatus="loop">
						<h4><span class="card text-center p-1"><c:out value="${tag.subject}"/></span></h4>
					</c:forEach>
				</div>
			</div>
		</div>
		
		<div class="row">
			<div class="card-deck">
				<div class="card p-2" style="width: 20rem;">
					<table class="table is-bordered is-fullwidth is-striped">
						<thead>
							<tr><td class="is-dark">Answers</td></tr>
						</thead>
						<tbody>
							<c:forEach items="${answers}" var="answer" varStatus="loop">
							<tr><td>
								<c:out value="${answer.answer}"/>
							</td></tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
				<div class="card p-2" style="width: 20rem;">
					<h2 class="title">Add your answer:</h2>
					<form:form action="/questions" method="post" modelAttribute="ans">
						<p>
							<form:label path="answer">Answer:</form:label>
							<p class="text-danger"><c:out value="${errors}"></c:out></p>
							<form:textarea path="answer" class="textarea"/>
							<input type="hidden" name="question" value="${thequestion.id}">
						</p>
						<div class="row justify-content-center p-4">
							<input type="submit" value="Create" class="btn btn-success"/>
						</div>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</body>

</body>
</html>