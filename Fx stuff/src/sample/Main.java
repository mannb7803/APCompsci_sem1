package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.swing.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Java fx tests");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        Text scenetitle = new Text("Please enter your username and password");
        scenetitle.setFont(Font.font("Tohama", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);

        Button b = new Button("Sign in");
        HBox hb = new HBox(10);
        hb.setAlignment(Pos.BOTTOM_RIGHT);
        hb.getChildren().add(b);
        grid.add(hb, 1, 4);
        b.setOnAction(new EventHandler<ActionEvent>()
        {
        @Override
            public void handle(ActionEvent e)
          {
            actiontarget.setFill(Color.FIREBRICK);
              actiontarget.setText("Logged in");
         }
        });

        Label userName = new Label("User name");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label pw = new Label("Password");
        grid.add(pw, 0, 2);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);

        Scene scene = new Scene(grid, 1080, 720);
        primaryStage.setScene(scene);
        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}
