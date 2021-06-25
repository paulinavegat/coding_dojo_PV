package com.paulina.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Counter")
public class Counter extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Counter() {
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
        String count = (String) session.getAttribute("count");
        Integer number=0; 
        //debo convertir la info que viene del objeto session en un string, ya que una vez almacenados en una sesion, se convierten dato tipo objeto
        //por eso necesito un integer para guardar los datos del contador
        
        
        if(count == null) {
			session.setAttribute("count", "0");
			//si no hay visitas el contador sera cero, no necesito el num
        }
        
		else {
			number = Integer.parseInt(count);
			number += 1;
			count = number.toString();
			session.setAttribute("count", count);
			//si el contador no es null, hay que establecer la variable creada number para que contabilice las visitas. Recordar que el dato de session viene como string.
			//luego, uso la variable count, el cual es el atributo de la session y este debe ser un string, entonces tomo el valor de mi variable number y la convierto a string otra vez para
					
		}
      
        RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/view/counter.jsp");
        view.forward(request, response);
        // siempre esto, para asegurar que nos pueste el archivo correcto de jsp que he creado
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
