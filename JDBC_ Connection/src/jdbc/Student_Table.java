package jdbc;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;

public class Student_Table {
	public static void main(String[] args) {
		    String jdbcUrl = "jdbc:mysql://localhost:3306/college";
		    String username = "root";
		    String password = "Pratik@447799";


		try 
			(Connection con = DriverManager.getConnection(jdbcUrl, username, password);
			Statement st1 = con.createStatement();)
			{
				String s ="CREATE TABLE student ("
	                    + "studentId INT NOT NULL,"
	                    + "studentName VARCHAR(45) NOT NULL,"
	                    + "studentMarks INT NOT NULL)";
	                   

			st1.executeUpdate(s);
			
			System.out.println("Table created successfully");
			st1.close();
			con.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
	}
 }		

}
