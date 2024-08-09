package com.pharmacystore.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	public static Connection getDatabaseConnection()
	{
		try {
			
	Connection	con = DriverManager.getConnection(
					DbDetails.CONSTR,
					DbDetails.USERNAME,
					DbDetails.PASSWORD);
			return con;
			
		} catch (SQLException | NullPointerException  ex) {
			ex.printStackTrace();
			return null;
		}
	}
}
