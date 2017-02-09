package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

       VBox window = new VBox();
        Button b = new Button("Click me");
        Button exit = new Button("Exit");


        exit.setOnAction(e -> System.exit(0));
        b.setOnAction(e -> {
            System.out.println("Test");
            System.out.println("Leave me alone");
                });


        window.getChildren().addAll(b, exit);
        Scene scene = new Scene(window, 1080, 720);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Test3");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
