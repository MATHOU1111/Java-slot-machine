package slotMachine;
import java.util.HashMap;

public class Multiplicateur {
    private HashMap<Integer, Double> multiplicateurs;

    public Multiplicateur(HashMap<Integer, Double> multiplicateurs) {
        this.multiplicateurs = multiplicateurs;
    }

    public HashMap<Integer, Double> getMultiplicateur() {
        return multiplicateurs;
    }

    public void setMultiplicateur(HashMap<Integer, Double> multiplicateurs) {
        this.multiplicateurs = multiplicateurs;
    }
}

