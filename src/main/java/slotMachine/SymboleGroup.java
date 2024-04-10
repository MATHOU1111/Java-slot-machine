package slotMachine;
import javafx.scene.Group;

public class SymboleGroup {
    private Symbole[] symboles;
    private Group[] vueSymboles;

    // Constructeur
    public SymboleGroup(Symbole[] symboles, Group[] vueSymboles) {
        this.symboles = symboles;
        this.vueSymboles = vueSymboles;
    }

    // Getters
    public Symbole[] getSymboles() {
        return symboles;
    }

    // Setters
    public Group[] getVueSymboles() {
        return vueSymboles;
    }
}

