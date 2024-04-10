package slotMachine;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Jeu extends Application {
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Jeu.class.getResource("grille-jeu.fxml"));
        Scene scene = new Scene((Parent)fxmlLoader.load(), 1200.0, 900.0);
        stage.setTitle("Casino!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
