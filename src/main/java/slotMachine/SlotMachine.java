package slotMachine;

import java.util.ArrayList;
import java.util.List;

public class SlotMachine {
    private List<GrilleDeJeu> listDesGrilles = new ArrayList();
    private GestionDesGains gestionnaireDeGains;
    private double soldeTotal;

    public SlotMachine(int nombreDeGrilles, double soldeTotal) {
        for(int i = 0; i < nombreDeGrilles; ++i) {
            this.listDesGrilles.add(new GrilleDeJeu(5, 3));
        }

        this.gestionnaireDeGains = new GestionDesGains();
        this.soldeTotal = soldeTotal;
    }
}



