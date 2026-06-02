package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtils {
	private static Connection connection;
	private static String url = "jdbc:sqlserver://localhost:1433;databaseName=AdventureWorks;encrypt=true;trustServerCertificate=true";
	//private static String url = "jdbc:sqlserver://sql_server_container:1433;databaseName=AdventureWorks;encrypt=true;trustServerCertificate=true";
	private static String user = "sa";
	private static String password = "ManpreetDB@2026";

	// Open connection
	public static Connection getConnection() {
		try {
			if (connection == null || connection.isClosed()) {
				connection = DriverManager.getConnection(url, user, password);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

	// Execute SELECT query
	public static ResultSet executeQuery(String query) {
		ResultSet rs = null;
		try {
			Statement stmt = getConnection().createStatement();
			rs = stmt.executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

	// Execute INSERT/UPDATE/DELETE
	public static int executeUpdate(String query) {
		int rows = 0;
		try {
			Statement stmt = getConnection().createStatement();
			rows = stmt.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rows;
	}

	// Get single value (very common in Selenium validations)
	public static String getSingleValue(String query, String columnName) {
		String value = null;
		try {
			ResultSet rs = executeQuery(query);
			if (rs.next()) {
				value = rs.getString(columnName);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return value;
	}

	// Close connection
	public static void closeConnection() {
		try {
			if (connection != null)
				connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
