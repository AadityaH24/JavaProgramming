import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

// Read employee name, department and designation and insert a new record. EmpID should be generated automatically such that max employee id + 1. 
// a. Given an employee ID, your program should display other details.
//  b. Given a department name, your program should print all employees belong to that department.
//  c. Given a employee ID, your program should be able to change either her department or designation



/**
 * q7
 */
public class q7 {

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

            Scanner sc = new Scanner(System.in);
            System.out.println("1. for insert record, 2. for get emp from id, 3. for get all emp from dept, 4. update emp dept and desig");
            int x = sc.nextInt();
            switch (x) {
                case 1: String name, desig;
                        int dept;
                        System.out.println("Enter name: ");
                        name = sc.next();
                        System.out.println("Enter dept: ");
                        dept = sc.nextInt();
                        System.out.println("Enter desig: ");
                        desig = sc.next();
                        String insert = "INSERT INTO EMPLOYEE (EmpName, Department, Designation) VALUES ('" + name + "', " + dept + ", '" + desig + "')";
                        stmt.executeUpdate(insert);
                    
                    break;
                case 2: System.out.println("Enter emp id: ");
                        int id = sc.nextInt();
                        String getEmp = "SELECT * FROM EMPLOYEE WHERE EmpID = " + id;
                        ResultSet rs = stmt.executeQuery(getEmp);
                        while (rs.next()) {
                            System.out.println("EmpID: " + rs.getInt("EmpID") + " EmpName: " + rs.getString("EmpName") + " Department: " + rs.getInt("Department") + " Designation: " + rs.getString("Designation"));
                        }
                    break;
                case 3: System.out.println("Enter dept: ");
                        int dept1 = sc.nextInt();
                        String getAllEmp = "SELECT * FROM EMPLOYEE WHERE Department = " + dept1;
                        ResultSet rs1 = stmt.executeQuery(getAllEmp);
                        while (rs1.next()) {
                            System.out.println("EmpID: " + rs1.getInt("EmpID") + " EmpName: " + rs1.getString("EmpName") + " Department: " + rs1.getInt("Department") + " Designation: " + rs1.getString("Designation"));
                        }
                    break;
                case 4: System.out.println("Enter emp id: ");
                        int id1 = sc.nextInt();
                        System.out.println("Enter dept: ");
                        int dept2 = sc.nextInt();
                        System.out.println("Enter desig: ");
                        String desig1 = sc.next();
                        String update = "UPDATE EMPLOYEE SET Department = " + dept2 + ", Designation = '" + desig1 + "' WHERE EmpID = " + id1;
                        stmt.executeUpdate(update);
                    break;
                        
                default:
                    break;
            }

            
        } catch (Exception e) {
            System.out.println(e);
        }
    }   
}