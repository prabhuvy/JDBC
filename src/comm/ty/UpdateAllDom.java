package comm.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateAllDom {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int times=0;
		while(true)
		{
			
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/domfast","root","root");
			PreparedStatement preparedStatement=connection.prepareStatement("update domtable set name=? where id=?");
			System.out.println("Go and Update the Data");
			System.out.println("====================================");
			System.out.println("Enter Id");
			preparedStatement.setInt(2,s.nextInt());
			System.out.println("Enter the name");
			preparedStatement.setString(1,s.next());
			preparedStatement.execute();
			connection.close();
			System.out.println("Data Updated Sucessfully");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("--------------------------------------");
		times++;
		System.out.println(times+"Updated");
		}
		
	}

}
