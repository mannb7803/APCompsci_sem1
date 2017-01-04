import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class main extends Application{
    public static void main (String [] args)
    {
        Launch(args);
    }

    private static void Launch(String[] args) {
    }


    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Button b = new Button("Test");
        b.setOnAction(new EventHandler<ActionEvent>()
                      {
                          @Override
                          public void handle(ActionEvent event)
                          {

                          }
                      }
        );
        StackPane window = new StackPane();
        window.getChildren().add(b);
        Scene scene = new Scene(window, 1080, 720);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

  












}
