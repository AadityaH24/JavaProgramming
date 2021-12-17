import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

// Write a program that displays four lines of text in four Labels:
// • Write your name, ID, Address, Phone in labels respectively.
// • Set the background of the labels to white.
// • Set the text color of the labels to black, blue, cyan, green respectively.
// • Set the font of each label to TimesRoman, bold, and 20 pixels.
// • Set the border of each label to a line border with yellow colour.

public class q2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage arg0) throws Exception {
        
        Label name = new Label("Aaditya");
        name.setStyle("-fx-background-color: white; -fx-text-fill: black; -fx-font: TimesRoman bold 20px; -fx-border-color: yellow;");
        Label id = new Label("19BAI1098");
        id.setStyle("-fx-background-color: white; -fx-text-fill: blue; -fx-font: TimesRoman bold 20px; -fx-border-color: yellow;");
        Label address = new Label("Girdhar Park, Malad W");
        address.setStyle("-fx-background-color: white; -fx-text-fill: cyan; -fx-font: TimesRoman bold 20px; -fx-border-color: yellow;");
        Label phone = new Label("+91 9876543210");
        phone.setStyle("-fx-background-color: white; -fx-text-fill: green; -fx-font: TimesRoman bold 20px; -fx-border-color: yellow;");
        GridPane gp = new GridPane();
        gp.add(name, 0, 0);
        gp.add(id, 0, 1);
        gp.add(address, 0, 2);
        gp.add(phone, 0, 3);
        
        Scene scene = new Scene(gp, 400, 400);
        arg0.setScene(scene);
        arg0.show();

    }
    
}