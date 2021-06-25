package com.paulina.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.paulina.web.models.Cat;


/**
 * Servlet implementation class Cats
 */
@WebServlet("/Cats")
public class Cats extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    //proceso de request
			String name = request.getParameter("name");
	        String breed = request.getParameter("breed");
	        Double weight = Double.parseDouble(request.getParameter("weight"));
	        
	        // Crear modelo
	        Cat cat = new Cat(name, breed, weight);
	        
	        // establecer Modelo para mostrarlo en pantalla
	      		
		request.setAttribute("cat",cat);
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/view/cat.jsp");
		view.forward(request,response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
