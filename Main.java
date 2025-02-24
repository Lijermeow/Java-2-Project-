package org.example.rpg1_0;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Main extends Application {
    @Override
    public void start(Stage stage)  {
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 320, 240);
        Player player = new Player();
        root.setCenter(player.display.getDisplay());
        stage.setTitle("RPG");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}