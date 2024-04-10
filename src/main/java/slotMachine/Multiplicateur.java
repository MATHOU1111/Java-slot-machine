package slotMachine;
import java.util.HashMap;

public class Multiplicateur {
    private HashMap<Integer, Double> multiplicateurs;

    // Constructor
    public Multiplicateur(HashMap<Integer, Double> multiplicateurs) {
        this.multiplicateurs = multiplicateurs;
    }

    // Getters
    public HashMap<Integer, Double> getMultiplicateur() {
        return multiplicateurs;
    }

    // Setters
    public void setMultiplicateur(HashMap<Integer, Double> multiplicateurs) {
        this.multiplicateurs = multiplicateurs;
    }
}

