package com.paulina.web.controllers;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Game
 */
@WebServlet("/Game")
public class Game extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Game() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/game.jsp");
		view.forward(request,response);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		Integer guess = Integer.parseInt(request.getParameter("guess"));
		Integer number = (Integer) session.getAttribute("number");
		Random random = new Random();
		String result = "";
		
		// el numero que suponemos "guess" será tomado en los parametros
		// nuestra sesión almacenará el num que supondremos
		// y necesitamos un numero aletarorio para jugar
		// el resultado es el string que mostrará´el juego
		
		if(session.getAttribute("number")==null) {
			session.setAttribute("number", random.nextInt(100));
		}
		
		else {			
			if(guess.equals(number)) {
				result = (" was the number!");
				session.setAttribute("number", random.nextInt(100));
			}
			else if(guess > number) {
				result = "Too high!";
			}
			else if (guess < number){
				result = "Too low!";
			}
			session.setAttribute("result", result);
		}
	
	
		
		doGet(request, response);
	}

}
