package jdbc;

import java.sql.*;

public class StudentPreparedStatementInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pt = null;
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","Pratik@447799" );
			pt = con.prepareStatement("insert into student values(?,?,?)");
			pt.setInt(1,2);
			pt.setString(2,"Rushikesh");
			pt.setInt(3, 30);
			boolean i = pt.execute();
			System.out.println("No of rows affectred:" + i);
			System.out.println("Rows inserted successfully");
		}
		catch(Exception e) {
		System.out.println(e);
	}
		finally {
			try {
				if(pt!=null) {
					pt.close();
					pt =null;
				}	
			}
			catch(Exception e) {
				System.out.println(e);
			}
			try {
				if(con!=null) {
					con.close();
					con =null;
				}
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
    }
}	
	