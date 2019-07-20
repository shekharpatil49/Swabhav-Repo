package com.techlabs.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
       
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav","root","12345678");
		System.out.println(connection.getClass());
		System.out.println(connection.getCatalog());
	    System.out.println(connection.getMetaData().getUserName());
	    
	    System.out.println("server "+connection.getMetaData().getURL());
		
	}

}
