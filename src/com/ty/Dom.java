package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Dom {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/domfast","root","root");
			Statement statement=connection.createStatement();
			statement.execute("insert into domtable values(1,'prabhu',23)");
			statement.execute("insert into domtable values(2,'Ram',24)");
			statement.execute("insert into domtable values(3,'Sam',28)");
			connection.close();
			System.out.println("Data Added Sucessfully");

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
