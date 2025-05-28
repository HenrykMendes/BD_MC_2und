package conexaojdbc;

import io.github.cdimascio.dotenv.Dotenv;

public class TesteConexao {
	public static void main(String[] args) {
		
		Dotenv dotenv = Dotenv.load();
		
		String url = dotenv.get("DB_URL");
		String user = dotenv.get("DB_USER");
		String password = dotenv.get("DB_PASSWORD");
		
		SingleConnection connection = new SingleConnection(url, user, password);
		
	}
}
