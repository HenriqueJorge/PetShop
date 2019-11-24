package br.com.cesed.bd2.petshop.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	static final String URL = "jdbc:postgresql://localhost:5432/Loja";
	static final String USER = "postgres";
	static final String PASS = "6414";
	
	public static Connection criarConecao() throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		
		Connection conecao = DriverManager.getConnection(URL, USER, PASS);
		if(conecao != null) {
			System.out.println("Conexão efetuada");
			return conecao;
		}
		
		return null;
	}

}
