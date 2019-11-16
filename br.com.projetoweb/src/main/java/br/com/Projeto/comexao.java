package br.com.Projeto;

import java.sql.Connection;
import java.sql.DriverManager;

public class comexao implements IMyconnection {

	
	static  Connection conexao=null;
	
	public static Connection getcon() {
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexao = DriverManager.getConnection(ConnUr1, userneme, pwd);
			
			System.out.println("iniciado");
		} catch (Exception e) {
			System.out.println("erro"+e);
		}
		
		return conexao;
		
	}
	public void closedatabase() {
		try {
			conexao.close();
			System.out.println("fim");
		} catch (Exception e) {
		 System.out.println("Erro"+e.getMessage());
		}
	}
	
	

	
}
