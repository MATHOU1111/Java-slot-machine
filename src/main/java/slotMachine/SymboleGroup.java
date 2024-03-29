package slotMachine;
import javafx.scene.Group;

public class SymboleGroup {
    private Symbole[] symboles;
    private Group[] vueSymboles;

    public SymboleGroup(Symbole[] symboles, Group[] vueSymboles) {
        this.symboles = symboles;
        this.vueSymboles = vueSymboles;
    }

    public Symbole[] getSymboles() {
        return symboles;
    }

    public Group[] getVueSymboles() {
        return vueSymboles;
    }
}

