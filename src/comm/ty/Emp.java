package comm.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Emp {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/domfast","root","root");
			PreparedStatement preparedStatement=connection.prepareStatement("insert into domtable values(?,?,?)");
			while(true)
			{
				
			
			System.out.println("Welcome Dom Data Base");
			System.out.println("======================================");
			System.out.println("Enter Id");
			preparedStatement.setInt(1,s.nextInt());
			System.out.println("Enter name");
			preparedStatement.setString(2,s.next());
			System.out.println("Enter the Age");
			preparedStatement.setInt(3,s.nextInt());
			preparedStatement.execute();
			System.out.println("Data Added Sucessfully");
			System.out.println("------------------------");
			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
