import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.security.Key;

/**
 * Created by Ben on 2/22/2017.
 */
public class Pong extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        VBox h = new VBox();
        Scene window = new Scene(h, 800, 600, Color.GRAY);
        Rectangle r = new Rectangle(80, 20, Color.BLACK);
        Circle  c1 = new Circle(40, 40, 10,  Color.BLUE);
        h.getChildren().addAll(r, c1);
        c1.setCenterX(400);
        c1.setCenterY(400);
        Rectangle r1 = new Rectangle(80, 20, Color.BLACK); r1.setX(r.getX()+distance);


        moveC(window, r, h);


       
        primaryStage.setTitle("Pong");
        primaryStage.setScene(window);
        primaryStage.show();
    }
final int distance = 20;
    private void moveC(Scene window, Rectangle r, VBox h) {
        window.setOnKeyPressed(new EventHandler<KeyEvent>(){
            @Override
            public void handle(KeyEvent event) {
                switch(event.getCode())
                {
                    case UP:    System.out.println("Test"); break;
//                    case UP:    c1.setCenterY(c1.getCenterY() - distance); break;
                    case RIGHT: Rectangle r1 = new Rectangle(80, 20, Color.BLACK); r1.setY(r.getY()+distance); h.getChildren().remove(r);
                        h.getChildren().add(r1); break;
//                    case DOWN:  c1.setCenterY(c1.getCenterY() + distance); break;
//                    case LEFT:  c1.setCenterX(c1.getCenterX() - distance); break;
                }
            }


    });
    }



    public static void main (String args[])
    {
        launch(args);
    }
}

