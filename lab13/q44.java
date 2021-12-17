// Develop a JavaFX program to remove a student data. Include a textfield to read the RegNo
// of the student, display the details of that student obtained from the table in appropriate
// controls. Provide a ‘Delete Record’ button to remove the record.

import java.sql.*;
import java.util.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
public class q44 extends Application {
    final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    final String DB_URL="jdbc:mysql://localhost:3306/testdb";
    final String USER="root";
    final String PASS = "lovebirds2";
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage arg0) throws Exception {
        
        GridPane pane = new GridPane();
        Label l1 = new Label("RegNo");
        TextField txtRegNo = new TextField();
        txtRegNo.setPrefWidth(400);
        Button btnDisplay = new Button("Display");
        TextField txtDetails = new TextField();

        Button btnDelete = new Button("Delete Record");

        pane.add(l1, 0, 0);
        pane.add(txtRegNo, 1, 0);
        pane.add(btnDisplay, 0, 1);
        pane.add(txtDetails, 1, 1);
        pane.add(btnDelete, 0, 2);

        Scene scene = new Scene(pane, 500, 200);
        arg0.setTitle("Delete Student");
        arg0.setScene(scene);
        arg0.show();


        btnDisplay.setOnAction(e -> {
            try {
                Class.forName(JDBC_DRIVER);
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();
                String regNo = txtRegNo.getText();
                String sql = "SELECT * FROM studentreg WHERE Reg = '" + regNo + "'";
                ResultSet rs = stmt.executeQuery(sql);
                final int columnCount = rs.getMetaData().getColumnCount();
                while (rs.next())
                {
                    List<String> columnList = new LinkedList<String>();
                    for (int column = 1; column <= columnCount; ++column) 
                    {
                        final Object value = rs.getObject(column);
                        columnList.add(String.valueOf(value));
                    }
                    txtDetails.setText(columnList.toString());
                }
                conn.close();
            
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        btnDelete.setOnAction(e -> {
            try {
                Class.forName(JDBC_DRIVER);
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();
                String regNo = txtRegNo.getText();
                String sql = "DELETE FROM studentreg WHERE Reg = '" + regNo + "'";
                stmt.executeUpdate(sql);
                txtDetails.setText("");
                System.out.println("Record deleted");
                conn.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

    }

    
}