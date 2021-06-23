package com.paulina.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//http://localhost:8080/SimpleProject/Home?firstName=Paulina&lastName=Vega&language=Java&cityFav=Valparaiso
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String language = request.getParameter("language");
		String cityFav = request.getParameter("cityFav");
		
		if(cityFav == null) {
			cityFav = "Unknown";
		}
		if(language == null) {
			language = "Unknown";
		}
		if(lastName == null) {
			lastName = "Unknown";
		}
		if(firstName == null) {
			firstName = "Unknown";
		}
		// Si el parámetro no es dado, hacer que por defecto sea Unknown.
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("<h1>Welcome, " + firstName + " " + lastName + "</h1>");
		out.write("<h3>Your favourite language is: " + language + "</h3>");
		out.write("<h3>Your favourite city: " + cityFav + "</h3>");
		// esta info se desplegara en la pagina
	}
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
