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
		<title>Questions Dashboard</title>
</head>

<body>
	<div class="container">
		<div class="row p-4 justify-content-center">
			<div class="col-sm-6">
				<h1 class="text-center">Questions Dashboard</h1>
			</div>
		</div>
		
		<div class="row">
			<h3>Categories</h3>
			 <table class="table table-bordered table-striped">
				<thead class="thead-dark">
					<tr>
						<th><h4>Question</h4></th>
						<th><h4>Tags</h4></th>
					</tr>					        		
				</thead>
				<tbody>
					<c:forEach items="${questions}" var="q" varStatus="loop">
						<tr>	
							<td><a href="/questions/${q.id}"><c:out value="${q.question}"/></a></td>
							<td>
								<c:forEach items="${q.tags}" var="tags">
									${tags.subject}
								</c:forEach>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		
		<div class="row justify-content-end">
			<div class="col-2-offset-5">
				<h3><a href="/questions/new">New Question</a></h3>
			</div>
		</div>
	</div>
</body>
</html>