package org.joonzis.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection getConnection()
		throws ClassNotFoundException, SQLException{
		Connection conn = null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String user = "scott";
		String password = "tiger";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		conn = DriverManager.getConnection(url, user, password);
		return conn;
	}
}
