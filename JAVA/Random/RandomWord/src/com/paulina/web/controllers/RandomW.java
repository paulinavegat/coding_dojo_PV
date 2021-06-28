package com.paulina.web.controllers;

import java.io.IOException;
import java.util.Date;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/RandomW")
public class RandomW extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RandomW() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String count = (String) session.getAttribute("count");
		Integer number = 0;
		Random random = new Random();
		char[] chars = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f','g','h','i','j','k','l','m','m','o','p','q','r','s','t','u','v','w','x','y','z'};
		String randomW = "";
		int randomString;
		// count y number son usados para mantener el record de los numeros de veces que se 
		//ha hecho click para genera un palabra

		
		if(count == null) {
			session.setAttribute("count", 0);
			session.setAttribute("date", "N/A");
			
		}
		else {
			number = Integer.parseInt(count);
			number += 1;
			count = number.toString();
			session.setAttribute("count", count);
			Date date = new Date();
			session.setAttribute("date", date);
		
		}
		for(int i = 0; i <= 10; i++) {
			randomString = random.nextInt(chars.length);
			randomW += chars[randomString];
		}
		//genera un string radom de 10 caracteres
		
		request.setAttribute("randword",randomW);
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/random.jsp");
        view.forward(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
