package com.techlabs.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestStatement {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav","root","12345678");
		Statement stmt = conn.createStatement();
		
		Scanner sc = new Scanner(System.in);
		
		ResultSet rs = stmt.executeQuery("SELECT * FROM swabhav.dept where deptno="+sc.nextLine());
		rs=stmt.getResultSet();
		while(rs.next()) {
			System.out.println(rs.getInt(1) +"      "+ rs.getString(2) +"     " + rs.getString(3));
		}
		
		
		
	}

}
