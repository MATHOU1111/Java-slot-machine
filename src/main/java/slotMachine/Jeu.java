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
        Parent root = (Parent)fxmlLoader.load();

        // Charger votre fichier CSS
        Scene scene = new Scene(root, 1200.0, 700.0);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

        stage.setTitle("SlotMachine !");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
