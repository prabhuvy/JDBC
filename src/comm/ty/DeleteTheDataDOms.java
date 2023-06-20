package comm.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteTheDataDOms {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		while(true)
		{
			
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/domfast","root","root");
			PreparedStatement preparedStatement = connection.prepareStatement("delete from domtable where id=?");
			System.out.println("Enter Id to be deleted");
			preparedStatement.setInt(1,s.nextInt());
			preparedStatement.execute();
			connection.close();
			System.out.println("Deleted Sucessfully");
			System.out.println("-------------------------");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}

}
