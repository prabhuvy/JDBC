package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDom {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/domfast","root","root");
			Statement statement=connection.createStatement();
			statement.execute("update domtable set name='hello' where id=3");
			statement.execute("update domtable set name='Sanju' where id=2");
			statement.execute("update domtable set name='Manju' where id=1");
			connection.close();
			System.out.println("Data Updated Sucessfully");

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
