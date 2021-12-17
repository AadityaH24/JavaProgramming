import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class q4 {
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

            String createTable = "CREATE TABLE STUDENTREG " +
                   "(Reg VARCHAR(45) NOT NULL, " +
                   " FName VARCHAR(45), " + 
                   " LName VARCHAR(45), " + 
                   " Gender VARCHAR(4), " + 
                   " PROGRAM VARCHAR(4), " + 
                   " CredsEarned INT(3), " + 
                   " JoiningYear Int(4), " + 
                   " PRIMARY KEY (Reg))";
                   
            stmt.executeUpdate(createTable);
            System.out.println("STUDENTREG table created");
        } catch (Exception e) {
            System.out.println(e);
        }
    }   
}