// Using any database of your choice, create a table VITStudent with the following fields: RegNo,
// FirstName, LastName, Gender, Program (BCE, BEE, BME, BAI, BCL), NoOfCreditsEarned,
// Joining Year.

// 1. Design a JavaFX program to read the above details from the user and save them into the
// table. Use appropriate UI controls.


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class q41 extends Application{
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
        TextField regNo = new TextField();
        TextField firstName = new TextField();
        TextField lastName = new TextField();
        // TextField gender = new TextField();
        // TextField pgm = new TextField();
        TextField creds = new TextField();
        TextField jYear = new TextField();

        pane.add(new Label("Registration Number:"),0,0);
        pane.add(regNo,0,1);
        pane.add(new Label("First Name:"),1,0);
        pane.add(firstName,1,1);
        pane.add(new Label("Last Name:"),2,0);
        pane.add(lastName,2,1);
        // pane.add(new Label("Gender"),3,0);
        // pane.add(gender,3,1);

        //Toggle group of radio buttons     
        ToggleGroup groupGender = new ToggleGroup(); 
        RadioButton maleRadio = new RadioButton("male"); 
        maleRadio.setToggleGroup(groupGender); 
        RadioButton femaleRadio = new RadioButton("female"); 
        femaleRadio.setToggleGroup(groupGender); 

        pane.add(new Label("Gender"),3,0);
        pane.add(maleRadio,3,1);
        pane.add(femaleRadio,3,2);
        pane.add(new Label("Program"),4,0);
        // pane.add(pgm,4,1);
        ChoiceBox<String> pgmChoice = new ChoiceBox<String>();
        pgmChoice.getItems().addAll("BCE","BEE","BME","BAI","BCL");
        pane.add(pgmChoice,4,1);


        pane.add(new Label("Credits Earned"),5,0);
        pane.add(creds,5,1);
        pane.add(new Label("Joining Year"),6,0);
        pane.add(jYear,6,1);


        Button submit = new Button("Submit");
        submit.setPrefWidth(150);
        pane.add(submit,1,3);

        Scene scene = new Scene(pane,900,100);
        arg0.setTitle("VIT Student Registration");
        arg0.setScene(scene);
        arg0.show();



        //Handle Submit button action
        submit.setOnAction(e -> {
            String regNo1 = regNo.getText();
            String firstName1 = firstName.getText();
            String lastName1 = lastName.getText();

            RadioButton genderRb = (RadioButton)groupGender.getSelectedToggle();
            String gender1 = genderRb.getText();

            System.out.println(gender1);
            String pgm1 = pgmChoice.getValue().toString();
            int creds1 = Integer.parseInt(creds.getText());
            int jYear1 = Integer.parseInt(jYear.getText());

            System.out.println("Registration Number: " + regNo1);
            System.out.println("First Name: " + firstName1);
            System.out.println("Last Name: " + lastName1);
            System.out.println("Gender: "+ gender1);
            System.out.println("Program: "+ pgm1);
            System.out.println("Credits: "+ creds1);
            System.out.println("Joining Year: " + jYear1);

            // Upload to DB

            try {
                Class.forName(JDBC_DRIVER);
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                System.out.println("Connection succesful");

                // String insert = "INSERT INTO studentreg VALUES ('" + regNo1 + "', " + firstName1 + ", '" + lastName1 + "', " + gender1 + "', " + pgm1 + "', " + creds1 + ", '" + jYear1 + "')";
                
                String insert = "INSERT INTO studentreg VALUES (?,?,?,?,?,?,?)";
                PreparedStatement pstmt = conn.prepareStatement(insert);
                pstmt.setString(1,regNo1);
                pstmt.setString(2,firstName1);
                pstmt.setString(3,lastName1);
                pstmt.setString(4,gender1);
                pstmt.setString(5,pgm1);
                pstmt.setInt(6,creds1);
                pstmt.setInt(7,jYear1);
                pstmt.executeUpdate();
                System.out.println("Inserted");
                conn.close();
                
                
            } catch (Exception err) {
                err.printStackTrace();
            }

        });

    }
    
}