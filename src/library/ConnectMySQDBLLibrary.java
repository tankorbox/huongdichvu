package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectMySQDBLLibrary {
	private Connection connection;
	private String url;
	private String user;
	private String password;
	
	
	public ConnectMySQDBLLibrary(){
		this.url = "jdbc:mysql://localhost:3306/mobileshopmoi?useUnicode=true&characterEncoding=UTF-8";
		this.user = "root";
		this.password = "";
	}
	public Connection getConnectMySQL(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return connection;
	}
}
