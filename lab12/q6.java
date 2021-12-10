import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class q6 {
    public static void main(String[] args) {
        final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
        final String DB_URL="jdbc:mysql://localhost:3306/testdb";
        final String USER="root";
        final String PASS = "lovebirds2";
        
        try {
            Class.forName(JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            System.out.println("Connection succesful");

            String createTable = "CREATE TABLE EMPLOYEE " +
                   "(EmpID INT NOT NULL AUTO_INCREMENT, " +
                   " EmpName VARCHAR(45), " + 
                   " Department INT, " + 
                   " Designation VARCHAR(45), " + 
                   " PRIMARY KEY (EmpID))";
                   
            stmt.executeUpdate(createTable);
            System.out.println("EMPLOYEE table created");
        } catch (Exception e) {
            System.out.println(e);
        }
    }   
}