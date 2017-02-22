import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Created by Ben on 2/22/2017.
 */
public class Pong extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        VBox h = new VBox();
        Scene window = new Scene(h, 800, 600);
        Rectangle r = new Rectangle(80, 20, Color.BLACK);
        h.getChildren().addAll(r);
        r.setX(400);
        r.setY(300);
       
        primaryStage.setTitle("Pong");
        primaryStage.setScene(window);
        primaryStage.show();
    }
    public static void main (String args[])
    {
        launch(args);
    }
}

