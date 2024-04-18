package slotMachine;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class SymboleFactory {
    static List<Symbole> symboles = new ArrayList<>();

    static {
        // Pour type0 (qui correspond à S1 dans votre tableau)
        HashMap<Integer, Double> multipliers0 = new HashMap<>();
        multipliers0.put(5, 20.0);
        multipliers0.put(4, 10.0);
        multipliers0.put(3, 4.0);
        symboles.add(new Symbole("type0", "images/type0", 0.0360, new Multiplicateur(multipliers0)));

        // Pour type1 (qui correspond à S2 dans votre tableau)
        HashMap<Integer, Double> multipliers1 = new HashMap<>();
        multipliers1.put(5, 10.0);
        multipliers1.put(4, 5.0);
        multipliers1.put(3, 2.5);
        symboles.add(new Symbole("type1", "images/type1", 0.0479, new Multiplicateur(multipliers1)));

        HashMap<Integer, Double> multipliers2 = new HashMap<>();
        multipliers2.put(5, 6.0);
        multipliers2.put(4, 3.0);
        multipliers2.put(3, 1.5);
        symboles.add(new Symbole("type2", "images/type2", 0.0719, new Multiplicateur(multipliers2)));

        HashMap<Integer, Double> multipliers3 = new HashMap<>();
        multipliers3.put(5, 5.0);
        multipliers3.put(4, 3.0);
        multipliers3.put(3, 0.6);
        symboles.add(new Symbole("type3", "images/type3", 0.0103, new Multiplicateur(multipliers3)));

        HashMap<Integer, Double> multipliers4 = new HashMap<>();
        multipliers4.put(5, 4.0);
        multipliers4.put(4, 2.0);
        multipliers4.put(3, 0.4);
        symboles.add(new Symbole("type4", "images/type4", 0.1150, new Multiplicateur(multipliers4)));

        HashMap<Integer, Double> multipliers5 = new HashMap<>();
        multipliers5.put(5, 3.0);
        multipliers5.put(4, 1.2);
        multipliers5.put(3, 0.28);
        symboles.add(new Symbole("type5", "images/type5", 0.1438, new Multiplicateur(multipliers5)));

        HashMap<Integer, Double> multipliers6 = new HashMap<>();
        multipliers6.put(5, 2.4);
        multipliers6.put(4, 0.8);
        multipliers6.put(3, 0.2);
        symboles.add(new Symbole("type6", "images/type6", 0.1917, new Multiplicateur(multipliers6)));

        HashMap<Integer, Double> multipliers7 = new HashMap<>();
        multipliers7.put(5, 2.0);
        multipliers7.put(4, 0.6);
        multipliers7.put(3, 0.16);
        symboles.add(new Symbole("type7", "images/type7", 0.1917, new Multiplicateur(multipliers7)));

        HashMap<Integer, Double> multipliers8 = new HashMap<>();
        multipliers8.put(5, 1.6);
        multipliers8.put(4, 0.4);
        multipliers8.put(3, 0.12);
        symboles.add(new Symbole("type8", "images/type8", 0.1917, new Multiplicateur(multipliers8)));
    }

    public static List<Symbole> genererSymboles() {
        return symboles;
    }
}

