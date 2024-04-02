package slotMachine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestionDesGains {
    private Map<String, Integer> tableauDeGains = new HashMap();
    private Map<String, Double> multiplicateurs = new HashMap();

    public double calculerGains(List<Symbole> symbolesGagnants) {
        double gains = 0.0;
        return gains;
    }

    public double retirerTokens() {
        double gains = 0.0;
        return gains;
    }

    /*public static void verifierGrille(GrilleDeJeu grille, Utilisateur joueur) {
        for (int x = 0; x < grille.getDimensionsx() - 1; ++x) {
            for (int y = 1; y <= grille.getDimensionsy() - 4; ++y) {
                boolean combinaisonValide = true;
            }
             String typePremierSymbole = grille.getSymboles()[x][y].getType();

                for (int k = 1; k < 3; ++k) {
                    if (y + k >= grille.getDimensionsy() || !grille.getSymboles()[x][y + k].getType().equals(typePremierSymbole)) {
                        combinaisonValide = false;
                        break;
                    }
                }

                if (combinaisonValide && x == 1 && grille.getSymboles()[x + 1][y - 1].getType().equals(typePremierSymbole) && grille.getSymboles()[x + 1][y + 3].getType().equals(typePremierSymbole)) {
                    System.out.println("(" + x + "," + y + ")");
                    //joueur.ajouterCredits(1.5);
                }



     */
        }







