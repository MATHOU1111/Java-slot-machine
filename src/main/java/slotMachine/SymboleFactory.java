package slotMachine;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.Group;
import javafx.scene.image.Image;

public class SymboleFactory {
    public static List<Symbole> genererSymboles() {
        List<Symbole> symboles = new ArrayList<>();

        // Création du symbole 1 avec ses multiplicateurs
        HashMap<Integer, Double> multipliers1 = new HashMap<>();
        multipliers1.put(5, 20.0);
        multipliers1.put(4, 10.0);
        multipliers1.put(3, 4.0);
        Image imageSymbole1 = new Image("file:src/main/resources/symbole1.png");
        Symbole symbole1 = new Symbole("S1", 6.25f, new Multiplicateur(multipliers1), 1, imageSymbole1);
        symboles.add(symbole1);

        // Création du symbole 2
        HashMap<Integer, Double> multipliers2 = new HashMap<>();
        multipliers2.put(5, 10.0);
        multipliers2.put(4, 6.0);
        multipliers2.put(3, 1.6);
        Image imageSymbole2 = new Image("file:src/main/resources/symbole2.png");
        Symbole symbole2 = new Symbole("S2", 8.33f, new Multiplicateur(multipliers2), 1, imageSymbole2);
        symboles.add(symbole2);

        // Création du symbole 3
        HashMap<Integer, Double> multipliers3 = new HashMap<>();
        multipliers3.put(5, 6.0);
        multipliers3.put(4, 4.0);
        multipliers3.put(3, 1.0);
        Image imageSymbole3 = new Image("file:src/main/resources/symbole3.png");
        Symbole symbole3 = new Symbole("S3", 12.5f, new Multiplicateur(multipliers3), 1, imageSymbole3);
        symboles.add(symbole3);

        // Création du symbole 4
        HashMap<Integer, Double> multipliers4 = new HashMap<>();
        multipliers4.put(5, 5.0);
        multipliers4.put(4, 3.0);
        multipliers4.put(3, 0.6);
        Image imageSymbole4 = new Image("file:src/main/resources/symbole4.png");
        Symbole symbole4 = new Symbole("S4", 16.67f, new Multiplicateur(multipliers4), 1, imageSymbole4);
        symboles.add(symbole4);

        // Création du symbole 5
        HashMap<Integer, Double> multipliers5 = new HashMap<>();
        multipliers5.put(5, 4.0);
        multipliers5.put(4, 2.0);
        multipliers5.put(3, 0.4);
        Image imageSymbole5 = new Image("file:src/main/resources/symbole5.png");
        Symbole symbole5 = new Symbole("S5", 20.0f, new Multiplicateur(multipliers5), 1, imageSymbole5);
        symboles.add(symbole5);

        // Création du symbole 6
        HashMap<Integer, Double> multipliers6 = new HashMap<>();
        multipliers6.put(5, 3.0);
        multipliers6.put(4, 1.2);
        multipliers6.put(3, 0.28);
        Image imageSymbole6 = new Image("file:src/main/resources/symbole6.png");
        Symbole symbole6 = new Symbole("S6", 25.0f, new Multiplicateur(multipliers6), 1, imageSymbole6);
        symboles.add(symbole6);

        // Création du symbole 7
        HashMap<Integer, Double> multipliers7 = new HashMap<>();
        multipliers7.put(5, 2.4);
        multipliers7.put(4, 0.8);
        multipliers7.put(3, 0.2);
        Image imageSymbole7 = new Image("file:src/main/resources/symbole7.png");
        Symbole symbole7 = new Symbole("S7", 33.33f, new Multiplicateur(multipliers7), 1, imageSymbole7);
        symboles.add(symbole7);

        // Création du symbole 8
        HashMap<Integer, Double> multipliers8 = new HashMap<>();
        multipliers8.put(5, 2.0);
        multipliers8.put(4, 0.6);
        multipliers8.put(3, 0.16);
        Image imageSymbole8 = new Image("file:src/main/resources/symbole8.png");
        Symbole symbole8 = new Symbole("S8", 33.33f, new Multiplicateur(multipliers8), 1, imageSymbole8);
        symboles.add(symbole8);

        // Création du symbole 9
        HashMap<Integer, Double> multipliers9 = new HashMap<>();
        multipliers9.put(5, 1.6);
        multipliers9.put(4, 0.4);
        multipliers9.put(3, 0.12);
        Image imageSymbole9 = new Image("file:src/main/resources/symbole9.png");
        Symbole symbole9 = new Symbole("S9", 33.33f, new Multiplicateur(multipliers9), 1, imageSymbole9);
        symboles.add(symbole9);


        return symboles;
    }
}
