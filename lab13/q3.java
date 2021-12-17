import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

// Display a stage that contains nine labels. A label may display an image icon for X, an image
// icon for O, or nothing. What to display is randomly decided. Use the Math.random() method
// to generate an integer 0, 1, or 2, which corresponds to displaying a cross image icon, a not
// image icon, or nothing


/**
 * q3
 */
public class q3  extends Application{

    public static void main(String[] args) {
        launch(args);
        
    }
    @Override
    public void start(Stage arg0) throws Exception {
        GridPane pane = new GridPane();
        Image x = new Image("goldO.jpg",100, 100, false, false);
        Image o = new Image("goldX.jpg",100, 100, false, false);
        Image blank = new Image("white.png",100, 100, false, false);
        // ImageView imgX = new ImageView(x);
        // ImageView imgO = new ImageView(o);
        int[] arr = new int[9];
        for(int i=0;i<9;i++)
        {
            int r = (int)(Math.random()*3);
            if(r==0)
            {
                pane.add(new ImageView(x), i%3, i/3);
                arr[i]=1;
            }
            else if(r==1)
            {
                pane.add(new ImageView(o), i%3, i/3);
                arr[i]=2;
            }
            else
            {
                pane.add(new ImageView(blank), i%3, i/3);
                arr[i]=0;
            }
        }
        Scene scene = new Scene(pane, 300, 300);
        arg0.setScene(scene);
        arg0.show();
        

    }
}