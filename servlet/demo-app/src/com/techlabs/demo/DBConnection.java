package com.techlabs.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	
	static Connection connection = null;
	static String databaseName = "";
	static String url = "jdbc:mysql://localhost:3306/" + databaseName;
	static String username ="root";
	static String password ="12345678";	

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		
		 Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		 connection = DriverManager.getConnection(url,username,password);
		 String query1 = "SELECT * FROM swabhav.students";
		 Statement stm = connection.createStatement();
         ResultSet rs = stm.executeQuery(query1);
		 while(rs.next()) {
			 System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
		 }
		 connection.close();
			

	}

}
