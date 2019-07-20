package com.techlabs.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestPreparedStatement {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav","root","12345678");
		Statement stmt = conn.createStatement();
		
		Scanner sc = new Scanner(System.in);
		String number = sc.nextLine();
		
		String query = "SELECT * FROM swabhav.dept where deptno=?";
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setString(1,number );
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getString(1) +"      "+ rs.getString(2) +"     " + rs.getString(3));
		}
		conn.close();

	}

}
