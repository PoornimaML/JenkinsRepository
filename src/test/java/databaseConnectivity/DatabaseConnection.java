package databaseConnectivity;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	public static void main(String[] args) throws ClassNotFoundException {
		String dbURL="jdbc:mysql://localhost:3306/advanceselenium";
		//just specify the path of the database
		Class.forName("com.mysql.cj.jdbc.Driver");
		//connector file path to database
		try {
			DriverManager.getConnection(dbURL,"root","root");//(dburl,username,password) , it establishes then connection
			System.out.println("connection established");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("connection failed");
		}
	}

}
