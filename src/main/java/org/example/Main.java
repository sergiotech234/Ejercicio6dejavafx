package org.example;

// Importación de clases necesarias de JavaFX
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

// Clase principal que hereda de Application
public class Main extends Application {

    // Método que inicia la interfaz gráfica
    @Override
    public void start(Stage primaryStage) {

        // Creación de los botones con nombres según su posición
        Button button1 = new Button("Norte");
        Button button2 = new Button("Sur");
        Button button3 = new Button("Oeste");
        Button button4 = new Button("Este");
        Button button5 = new Button("Centro");

        // Creación del contenedor BorderPane
        // Este panel divide la ventana en:
        // arriba, abajo, izquierda, derecha y centro
        BorderPane borderPane = new BorderPane();

        // Coloca el botón en la parte superior
        borderPane.setTop(button1);

        // Coloca el botón en la parte inferior
        borderPane.setBottom(button2);

        // Coloca el botón a la izquierda
        borderPane.setLeft(button3);

        // Coloca el botón a la derecha
        borderPane.setRight(button4);

        // Coloca el botón en el centro
        borderPane.setCenter(button5);

        // Creación de la escena con tamaño 400x300
        Scene scene = new Scene(borderPane, 400, 300);

        // Título de la ventana
        primaryStage.setTitle("Aplicacion de clic de boton");

        // Se asigna la escena a la ventana
        primaryStage.setScene(scene);

        // Muestra la ventana en pantalla
        primaryStage.show();
    }

    // Método principal que ejecuta la aplicación
    public static void main(String[] args) {
        launch(args);
    }
}
