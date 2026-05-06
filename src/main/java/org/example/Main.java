package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button button1 = new Button("Norte");
        Button button2 = new Button("Sur");
        Button button3 = new Button("Oeste");
        Button button4 = new Button("Este");
        Button button5 = new Button("Centro");

        BorderPane borderPane = new BorderPane();

        borderPane.setTop(button1);
        borderPane.setBottom(button2);
        borderPane.setLeft(button3);
        borderPane.setRight(button4);
        borderPane.setCenter(button5);

        Scene scene = new Scene(borderPane, 400, 300);
        primaryStage.setTitle("Aplicacion  de clic de boton");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
