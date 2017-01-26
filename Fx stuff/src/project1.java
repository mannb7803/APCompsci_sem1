import com.sun.scenario.effect.Offset;
import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by mannb7803 on 1/26/2017.
 */
public class project1 extends Application{
    public void start(Stage primaryStage) throws Exception
    {
        Pane window  = new Pane();
        window.setPrefSize(1920, 1080);
        primaryStage.setTitle("project1");
        Scene scene = new Scene(window);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public class Menu extends Parent
    {
        VBox menu1 = new VBox(10);

        button b1 = new button("Test");
        menu1.getChildren().addAll(b1);

//        menu1.setTranslateX(100);
//        menu1.setTranslatey(100);
    }
    public static class button extends StackPane
    {
        private Text text;
        public button(String n)
        {
            text = new Text(n);
            text.setFill(Color.WHITE);
            Rectangle b = new Rectangle(200, 30);
            b.setOpacity(.8);
            b.setFill(Color.BLACK);
            b.setEffect(new GaussianBlur(3.5));

            this.setAlignment(Pos.CENTER_LEFT);
            setRotate(-0.5);
            getChildren.addAll(b, text);

            this.setOnMouseEntered(e ->{
                b.setTranslateX(10);
                text.setTranslateX(10);
                b.setFill(Color.WHITE);
                text.setFill(Color.BLACK);
            });
            this.setOnMouseExited(e ->{
               b.setTranslateX(0);
                text.setTranslateX(0);
                b.setFill(Color.BLACK);
                text.setFill(Color.WHITE);
            });
        }
    }

}
