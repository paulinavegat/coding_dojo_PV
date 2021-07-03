<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
    <title>Dojo Survey Index</title>
</head>
<body>
	<div class="container border border-dark border-3 mt-4"	style="width: 700px">
		<div class="row mt-4">
			<div class="col mb-1 mx-2">
				<h4 class="text-decoration-underline">Submitted Info</h4>
				<p><c:out value="${name}" /></p>
				<p><c:out value="${location}" /></p>
				<p><c:out value="${language}" /></p>
				<p><c:out value="${comment}" /></p>
			</div>
			<div class="d-grid gap-2 d-md-flex justify-content-md-end my-2 ml-3">
				<a href="/clear" class="btn btn-secondary btn-sm" role="button">Go Back</a>
			</div>
		</div>
	</div>
</body>
</html>