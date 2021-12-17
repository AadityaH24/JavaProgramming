import java.sql.*;
import java.util.LinkedList;
import java.util.List;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class q42 extends Application {
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
        Button prev = new Button("Previous");
        prev.setPrefWidth(100);
        Button next = new Button("Next");
        next.setPrefWidth(100);
        Button clear = new Button("Clear");
        clear.setPrefWidth(100);

        TextField text = new TextField();
        text.setPrefWidth(500);

        pane.add(text, 1, 0);
        pane.add(prev, 0, 1);
        pane.add(next, 1, 1);
        pane.add(clear, 2, 1);


        
        
        Scene scene = new Scene(pane, 700, 100);
        arg0.setScene(scene);
        arg0.setTitle("View Registration");
        arg0.show();

        List<List<String>> rowList = new LinkedList<List<String>>();
        try {
            Class.forName(JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM studentreg");
            final ResultSetMetaData meta = rs.getMetaData();
            final int columnCount = meta.getColumnCount();
            while (rs.next())
            {
                List<String> columnList = new LinkedList<String>();
                System.out.println("b4" + columnList);
                for (int column = 1; column <= columnCount; ++column) 
                {
                    final Object value = rs.getObject(column);
                    columnList.add(String.valueOf(value));
                }
                System.out.println("after" + columnList);
                rowList.add(columnList);

            }
            System.out.println(rowList);
            conn.close();
        } catch (Exception err1) {
            err1.printStackTrace();
        }
        
        int idx[] = {0};

        prev.setOnAction(e -> {
            text.setText(rowList.get(idx[0]).toString());
            if(idx[0] > 0) idx[0]--;
        });

        next.setOnAction(e -> {
            text.setText(rowList.get(idx[0]).toString());
                if(idx[0] < rowList.size()-1) idx[0]++;
        });

        clear.setOnAction(e -> {
            text.setText("");
        });
    }

    
    
}