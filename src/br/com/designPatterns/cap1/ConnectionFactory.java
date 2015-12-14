package br.com.designPatterns.cap1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection() throws SQLException{
		
		/* 
		 * Faça com que a fábrica de conexões tenha alguma lógica 
		 * dentro que decida se o banco deve ser MySql ou Postgres. 
		 * De um para o outro, basta mudar a palavra "mysql" para 
		 * "postgres" na string de conexão.
		 */
		
		
		try {
			Connection connection = null;
			String tipoBanco = System.getenv("tipoBanco");
			if(tipoBanco.equals("mysql")){
				connection = DriverManager.getConnection("jdbc:mysql://localhost/banco", "root", "root");
			}else if(tipoBanco.equals("postgres")){
				connection = DriverManager.getConnection("jdbc:postgres://localhost/banco", "root", "root");
			}
			return connection;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
