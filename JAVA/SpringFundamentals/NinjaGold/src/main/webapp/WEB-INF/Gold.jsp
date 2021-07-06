<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
 		<meta charset="ISO-8859-1">
		<title>Ninja Gold Game</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">

	</head>
	
<body>
<div id="container mt-4">
   	 <div class="row mx-3 my-3">
   	   <div class="col-3 "> 
   	     <form>
		   <label for="coins" class="form-label">Your Gold:</label>
		    <input type="text" class="form-control border-2" value="${count}"> 
		  </form>
		</div>
      </div>
     <div class="row g-3 md-center my-3 mx-3">
       <div class="col-auto border border-secondary border-2 mx-3">
           <form action="making_money" method="POST">
			    <label>Farm</label>
			    <input type="hidden" class="form-control" name="forms" value="farm">
			    <p>(earns 10-20 golds)</p>
			    <button type="submit" class="btn btn-secondary btn-sm my-3" value="Find Gold!">Find Gold!</button>
		   </form>
		 </div> 
	   <div class="col-auto border border-secondary border-2 mx-3">
           <form action="making_money" method="POST">
			    <label>Cave</label>
			    <input type="hidden" class="form-control" name="forms" value="cave">
			    <p>(earns 5-10 golds)</p>
			    <button type="submit" class="btn btn-secondary btn-sm my-3" value="Find Gold!">Find Gold!</button>
		   </form>
		</div> 
       <div class="col-auto border border-secondary border-2 mx-3">
           <form action="making_money" method="POST">
			    <label>House</label>
			    <input type="hidden" class="form-control" name="forms" value="house">
			    <p>(earns 2-5 golds)</p>
			    <button type="submit" class="btn btn-secondary btn-sm my-3" value="Find Gold!">Find Gold!</button>
		   </form>
		 </div>  
	 <div class="col-auto border border-secondary border-2 mx-3">
           <form action="making_money" method="POST">
			    <label>Farm</label>
			    <input type="hidden" class="form-control" name="forms" value="casino">
			    <p>(earns/takes 0-50 golds)</p>
			    <button type="submit" class="btn btn-secondary btn-sm my-3" value="Find Gold!">Find Gold!</button>
		   </form>
		 </div> 
	  </div>
	  
	  <div class="row mx-3 mb-3 ">
		 <label for="comment">Activities:</label>
	 </div>
	<div class="row  mx-3 mb-3">
		<div class="col mb-2 mx-auto">
			<textarea class="form-control border-2" id="floatingTextarea" name="comment" rows="6" cols ="100">
			<c:forTokens items="${actions}" delims ="," var = "name">
			<c:out value = "${name}"/>
			</c:forTokens>
			</textarea>
		</div>
	</div>
	  
	  
	  
	  
	  </div>
	  
	  
	  
	  
  </div>	
</body>
</html>