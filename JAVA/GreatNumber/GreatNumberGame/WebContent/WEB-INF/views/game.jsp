<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Great Number Game</title>
		</head>
		<style>
		*{
			padding: 0px;
			font-family: sans-serif;
		}
			
		.container{
			text-align: center;
			padding: 20px;
			width: 300px;
			margin: 50px auto;
		}
		.wrong {
			background-color: red;
		}
		
		.correct {
		  background-color: green;
		}
		.correct, .wrong {
			margin: 20px auto;
			padding: 20px;
			text-align: center;
			color:white;
			width: 100px;
		    border: 3px solid black;
		
		}
		button{
		 box-shadow: 3px 5px black;
		 padding:5px
		 }
			</style>
	<body>
		<div class="container">
			<h2>Welcome to the Great Number Game!</h2>
			<p>I'm thinking of a number between 1-100.<br> Take a guess!</p>

		<c:set var="result" value="${result}"/>
		<c:choose>
			<c:when test="${result == 'Too high!' }">
				<div class="wrong">
					<h4><c:out value="${result}"/></h4>
				</div>
			</c:when>
			<c:when test="${result == 'Too low!' }">
				<div class="wrong">
					<h4><c:out value="${result}"/></h4>
				</div>
			</c:when>
			<c:when test="${result == ' was the number!' }">
				<div class="correct">
				    <h4><c:out value="${random}${result}"/></h4>
					<a href="Reset"><button>Play Again?</button></a>
				</div>
			</c:when>
			
		</c:choose>

			<form method="post" action="/GreatNumberGame/Game">
				<input type="text" name="guess"><br><br>
				<button>Submit</button>
        
			</form>
		</div>
	
	</body>
</html>