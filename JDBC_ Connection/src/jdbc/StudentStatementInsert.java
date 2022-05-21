package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class StudentStatementInsert {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/college";
		Properties p = new Properties();
		p.put("user", "root");
		p.put("password","Pratik@447799");
		Connection con = DriverManager.getConnection(url, p);
		Statement st = con.createStatement();
		String query = "insert into student values(3,'Aniket',20)";
		int i = st.executeUpdate(query);//
		boolean t = st.execute("insert into student values(4,'Pratik',40)");
		System.out.println("No of rows affected:" + i);//1
		System.out.println("Query executed" + t);//
		System.out.println("Row inserted successfully");
		st.close();
		con.close();

	}

}
