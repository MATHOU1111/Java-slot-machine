package slotMachine;

import javafx.application.Application;
import javafx.stage.Stage;
import java.util.List;

public class Jeu extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Générer les symboles
        List<Symbole> vueSymboles = SymboleFactory.genererSymboles();

        // Afficher les informations de chaque symbole dans la console
        afficherInformationsSymboles(vueSymboles);
    }

    public static void main(String[] args) {
        launch(args);
    }

    private void afficherInformationsSymboles(List<Symbole> vueSymboles) {
        int numeroSymbole = 1;
        for (Symbole symbole : vueSymboles) {
            String nomSymbole = "S" + numeroSymbole;
            double tauxApparition = symbole.getSpawnProbability();
            String multiplicateurs = symbole.getMultiplicateur().toString();

            System.out.println("Symbole " + nomSymbole + " : " + tauxApparition + "%" +
                    " || " + multiplicateurs + " || ");
            numeroSymbole++;
        }
    }
}
