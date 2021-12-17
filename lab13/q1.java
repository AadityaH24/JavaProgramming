// Write a program that displays the following stage using more than one pane for 6 buttons

import javafx.application.Application;  
import javafx.scene.Scene;  
import javafx.scene.control.*;  
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * q1
 */
public class q1 extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage arg0) throws Exception {
        
        GridPane grid = new GridPane();
        HBox leftbox = new HBox();
        HBox rightbox = new HBox();

        Button b1 = new Button("Button 1");
        Button b2 = new Button("Button 2");
        Button b3 = new Button("Button 3");
        Button b4 = new Button("Button 4");
        Button b5 = new Button("Button 5");
        Button b6 = new Button("Button 6");

        leftbox.getChildren().addAll(b1,b2,b3);
        rightbox.getChildren().addAll(b4,b5,b6);
        leftbox.setSpacing(5);
        rightbox.setSpacing(5);

        grid.add(leftbox,0,0);
        grid.add(rightbox,1,0);
        grid.setHgap(10);

        Scene scene = new Scene(grid,400,50);
        arg0.setScene(scene);
        arg0.show();


        

    }
}

