package com.jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 1. Import jav.sql.*;
 * 2.load and register the driver ->com.mysql.jdbc.Driver
 * 3.create connection
 * 4.create statement
 * 5.execute the query
 * 6.process the results
 * 7.close
 */
public class Driver {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url="jdbc:mysql://localhost:3306/alians";
		String uname="root";
		String pass="";

		String query ="select username from student where userid=3";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		String name= rs.getString("username");
		
		System.out.println(name);
		
		st.close();
		con.close();
	}
}
