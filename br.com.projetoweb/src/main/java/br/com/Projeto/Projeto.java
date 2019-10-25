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
	
	 PrintWriter write = response.getWriter();
	 write.println("<html><body>");
	 write.println("<p>O seu enderenço ip é "+request.getRemoteAddr()+"</p>");
	 write.println("</body></html>");
	 write.flush();
		
	}

}
