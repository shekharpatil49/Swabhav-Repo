package com.techlab.transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class TestTransaction {
	
	static Connection conn;

	public static void main(String[] args) throws SQLException {
	
		try {
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav","root","12345678");
		conn.setAutoCommit(false);
		String sql ="INSERT INTO swabhav.customerMVC (id,firstname,lastName,dob,balance,cartType) VALUES(?,?,?,?,?,?)";
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		preparedStatement.setString(1, "10");
		preparedStatement.setString(2, "Shekhar");
		preparedStatement.setString(3, "Patil");
		preparedStatement.setString(4, "1/2/2009");
		preparedStatement.setInt(5,2000);
		preparedStatement.setString(6,"CREDIT");
	    preparedStatement.executeUpdate();
	    
		String sql1 ="INSERT INTO swabhav.customerMV (id,firstname,lastName,dob,balance,cartType) VALUES(?,?,?,?,?,?)";
		preparedStatement = conn.prepareStatement(sql1);
		preparedStatement.setString(1, "10");
		preparedStatement.setString(2, "Shekhar");
		preparedStatement.setString(3, "Patil");
		preparedStatement.setString(4, "1/2/2009");
		preparedStatement.setInt(5,2000);
		preparedStatement.setString(6,"CREDIT");
	    preparedStatement.executeUpdate();
	    conn.commit();
        }
        catch(Exception e) {
        	  System.out.println(e.getMessage());
        	 conn.rollback();
        }

	}

}
