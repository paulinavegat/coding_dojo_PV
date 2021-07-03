<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
	<meta charset="ISO-8859-1">
	<title>Dojo Survey Index</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
  </head>

<body>
	<div class="container border border-dark border-3 mt-4"style="width: 700px">
		<div class="row md-center mt-4">
			<div class="col mb-2 mx-2">
				<form method="POST" action="/submit">
					<div class="mb-3 row">
						<label for="name" class="col-4 col-form-label">Your Name:</label>
						<div class="col-8">
							<input type="text" class="form-control border-2" id="userName" name="name">
						</div>
					</div>
					<div class="mb-3 row">
						<label for="location" class="col-4 col-form-label">Dojo Location:</label>
						<div class="col-8">
							<select class="form-select  border-2"
								aria-label="Default select example" name="location">
								<option selected>Select a Location</option>
								<option value="San Jose">San Jose</option>
								<option value="Bellevue">Bellevue</option>
								<option value="Chicago">Chicago</option>
								<option value="Dallas">Dallas</option>
							</select>
						</div>
					</div>
					<div class="mb-3 row">
						<label for="labelLanguage" class="col-4 col-form-label">Favorite language:</label>
						<div class="col-8">
							<select class="form-select  border-2" aria-label="Default select example" name="language">
								<option selected>Select a Language</option>
								<option value="Python">Python</option>
								<option value="Ruby">Ruby</option>
								<option value="Java">Java</option>
								<option value="PHP">PHP</option>
							</select>
						</div>
					</div>
					<div class="mb-3 row">
						<label for="comment" class="col-4 col-form-label">Comment (optional):</label>
					</div>
					<div class="mb-3 row">
						<div class="col">
							<textarea class="form-control border-2" id="textArea" rows="3" name="comment"></textarea>
						</div>
					</div>
					<div class="d-grid gap-2 d-md-flex justify-content-md-end">
						<button type="submit" class="btn btn-secondary  btn-sm ">Submit</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>

</html>