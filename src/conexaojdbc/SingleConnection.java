package conexaojdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingleConnection {
	
	private static Connection connection = null;
	
	public SingleConnection(String url, String user, String password) {
		conectar(url, user, password);
	}


	private static void conectar(String url, String user, String password) {
		try {
			if(connection == null) {
				Class.forName("org.postgresql.Driver");
				connection = DriverManager.getConnection(url, user, password);
				connection.setAutoCommit(false);
				System.out.println("Conectou ao banco com sucesso!");
			}
		}catch(Exception e) {
			System.out.println("Erro ao se conectar ao banco!");
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		return connection;
	}

}
