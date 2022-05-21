package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author imssbora
 */
public class CreateTableExample {
  
  private static final String CREATE_TABLE_SQL="CREATE TABLE users ("
                    + "UID INT NOT NULL,"
                    + "NAME VARCHAR(45) NOT NULL,"
                    + "DOB DATE NOT NULL,"
                    + "EMAIL VARCHAR(45) NOT NULL,"
                    + "PRIMARY KEY (UID))";
  
  public static void main(String[] args) {
    String jdbcUrl = "jdbc:mysql://localhost:3306/college";
    String username = "root";
    String password = "Pratik@447799";

    Connection conn = null;
    Statement stmt = null;

    try {

      conn = DriverManager.getConnection(jdbcUrl, username, password);
      stmt = conn.createStatement();

      stmt.executeUpdate(CREATE_TABLE_SQL);

      System.out.println("Table created");

    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        // Close connection
        if (stmt != null) {
          stmt.close();
        }
        if (conn != null) {
          conn.close();
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}
