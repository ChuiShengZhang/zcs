package shopbean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnDB {
	public Connection conn = null;
	public Connection getConnection() throws ClassNotFoundException,SQLException{
		String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String url = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=ShopSystem";
		String user = "Sa";
		String psw = "123456";
		Class.forName(driverName);
		conn = DriverManager.getConnection(url,user,psw);
		return conn;
	}
	public void close() throws SQLException{
		conn.close();
	}
}
