package comm.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class GetAllDataDoms {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("All Data is here");



		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/domfast","root","root");
			PreparedStatement preparedStatement = connection.prepareStatement("select * from domtable");

			ResultSet resultset =  preparedStatement.executeQuery();
			while (resultset.next()) {
				System.out.println(resultset.getInt(1));
				System.out.println(resultset.getString(2));
				System.out.println(resultset.getInt(3));
				System.out.println("----------------------");
			}
			connection.close();



		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Data Got Sucessfully");


	}

}
