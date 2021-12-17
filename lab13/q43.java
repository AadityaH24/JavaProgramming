
// Develop a JavaFX program to modify a student data. Include a textfield to read the RegNo
// of the student, display the details of that student obtained from the table in appropriate
// controls. The user should be allowed to modify only the NoOfCreditsEarned. Once new
// value is entered, provide a ‘Update Record’ button to update the record.

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class q43 extends Application {
    final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    final String DB_URL="jdbc:mysql://localhost:3306/testdb";
    final String USER="root";
    final String PASS = "lovebirds2";
    
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage arg0) throws Exception {
        
        // Create a grid pane
        GridPane pane = new GridPane();
        Label label = new Label("Enter Registration Number");
        TextField regField = new TextField();

        pane.add(label, 0, 0);
        pane.add(regField, 1, 0);
        
        Button displayBtn = new Button("Display Details");
        TextField details = new TextField();
        details.setPrefWidth(500);
        Label label2 = new Label("Enter new Credit Total");
        TextField creditField = new TextField();
        Button updateBtn = new Button("Update Credits");


        pane.add(displayBtn, 0, 1);
        pane.add(details, 1, 1);
        pane.add(label2, 0, 4);
        pane.add(creditField, 1, 4);
        pane.add(updateBtn, 0, 5);


        displayBtn.setOnAction(e -> {
            try {
                Class.forName(JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            String regNo = regField.getText();
            String query = "SELECT * FROM studentreg WHERE Reg = '" + regNo + "'";
            ResultSet rs = stmt.executeQuery(query);
            final int columnCount = rs.getMetaData().getColumnCount();
            while (rs.next())
            {
                List<String> columnList = new LinkedList<String>();
                for (int column = 1; column <= columnCount; ++column) 
                {
                    final Object value = rs.getObject(column);
                    columnList.add(String.valueOf(value));
                }
                details.setText(columnList.toString());
            }
            conn.close();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        });

        updateBtn.setOnAction(e -> {
            try {
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();
                String regNo = regField.getText();
                String query = "UPDATE studentreg SET CredsEarned = " + creditField.getText() + " WHERE Reg = '" + regNo + "'";
                stmt.executeUpdate(query);
                System.out.println("Record updated");
                conn.close();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        });
        
        
        Scene scene = new Scene(pane, 700, 150);
        arg0.setScene(scene);
        arg0.setTitle("Update Registration");
        arg0.show();

        
    }

    
    
}
