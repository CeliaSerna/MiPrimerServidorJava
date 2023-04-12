package com.cursoceat.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("<h1>Hola Mundo</h1>");
	//muy importante, para leer html en java//
	response.setContentType("text/html");
		////////////////////////////////
	String elNombre=request.getParameter("nombre");
	String elApellido=request.getParameter("apellidos");
	//por consola//
	System.out.println("El nombre es: "+ elNombre);
	System.out.println("Los apellidos son: "+ elApellido);
	///////////////////////////////////
	PrintWriter out=response.getWriter();
	out.append(elNombre);
	
	out.append("&nbsp;");
	out.append(elApellido);
	out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
