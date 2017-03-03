package Try2;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.awt.*;





/**
 * Created by mannb7803 on 3/3/2017.
 */
public class Pong extends Application{

    @Override
    public void start(Stage Primarystage) throws Exception {
        Pane window = new Pane();

        Rectangle r = new Rectangle(80, 25, Color.BLACK);
        Circle c = new Circle(17, Color.BLUE);
        Circle shot = new Circle(5, Color.RED);
        shot.setCenterY(575);
        shot.setCenterX(r.getX());
        window.getChildren().addAll(c, r, shot);
        c.relocate(400, 300);
        r.setX(0);
        r.setY(575);
        System.out.println(r.getX());

        Scene x = new Scene(window, 800, 600);
        Primarystage.setScene(x);
        Primarystage.setTitle("Pong");
        Primarystage.show();

            x.setOnKeyPressed(new EventHandler<KeyEvent>() {
                @Override
                public void handle(KeyEvent event) {
                    switch (event.getCode()) {
                        case RIGHT: {
                            if (r.getX() == 720) {
                            break;
                            }
                            r.setX(r.getX() + 60);
                            break;
                        }
                        case LEFT:{
                            if(r.getX() == 0)
                            {
                                break;
                            }
                            r.setX(r.getX() - 60);
                            break;
                        }
                        case UP: {
                            shot.relocate(r.getX(), r.getY());
                            r.setOpacity(0);
                            System.out.println(shot.getCenterX());
                            while (shot.getCenterX() < 600)
                            {
                                shot.relocate(r.getX(), r.getY()- 20);
                            }
                            break;
                        }

                    }
                    System.out.println(r.getX());
                }
            });

        }

    public static void main (String args[])
    {
        launch(args);
        boolean game = true;
        while(game = true)
        {
            System.exit(0);
        }

    }



}
