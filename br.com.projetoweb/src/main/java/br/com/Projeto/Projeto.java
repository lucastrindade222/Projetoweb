package br.com.Projeto;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Projeto")
public class Projeto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
   
	 

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			
			throws ServletException, IOException {

	 
		
//
	float a = Float.parseFloat(request.getParameter("a"));
		float b = Float.parseFloat(request.getParameter("b"));
		
		float total;
		
		total=a+b;
		
		
	
		
		 
		 
			
		request.setAttribute("total",total);
		request.getRequestDispatcher("exemplo.jsp").forward(request, response);
		
	}

}
