package br.com.Projeto;
import br.com.Projeto.comexao;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/testt")
public class testt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    
     
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			
			throws ServletException, IOException {
		
		
	 
		String nome = request.getParameter("nome");
		 
		 try {
			 
			 
			 Connection cm = comexao.getcon();
			 String sql = "insert into fornecedores(nome) values(?)";
			 
			PreparedStatement st = cm.prepareStatement(sql);
			
			st.setString(1,nome);
			st.executeQuery();
			st.close();
			 
		 } catch (Exception e) {
			 System.out.println("erro"+e);
			 
		 }
	
		 
	}

}
