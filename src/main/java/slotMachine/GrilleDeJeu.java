package slotMachine;
import java.util.Random;

public class GrilleDeJeu {
    private Symbole[][] symboles;
    private int dimensionsx;
    private int dimensionsy;
    private Random random = new Random();

    public GrilleDeJeu(int dimensionsx, int dimensionsy) {
        this.dimensionsx = dimensionsx;
        this.dimensionsy = dimensionsy;
        this.symboles = new Symbole[dimensionsx][dimensionsy];
        //this.genererSymboles();
    }

    public int getDimensionsx() {
        return this.dimensionsx;
    }

    public int getDimensionsy() {
        return this.dimensionsy;
    }

    public Symbole[][] getSymboles() {
        return this.symboles;
    }

    public void afficherGrille() {
        System.out.println("Dimensions: " + this.dimensionsx + "x" + this.dimensionsy);

        for(int i = 0; i < this.dimensionsx; ++i) {
            for(int j = 0; j < this.dimensionsy; ++j) {
                if (this.symboles[i][j] != null) {
                    this.symboles[i][j].afficherSymbole();
                } else {
                    System.out.print("[NULL] ");
                }
            }

            System.out.println();
        }

    }

    public void genererSymboles() {
        Symbole[] symboleList = SymboleFactory.genererSymboles(); // Obtenez la liste de tous les symboles possibles

        // Calcul de la somme totale des probabilités d'apparition
        double sommeProbabilites = 0.0;
        for (Symbole symbole : symboleList) {
            sommeProbabilites += symbole.getSpawnProbability();
        }

        for (int i = 0; i < dimensionsx; i++) {
            for (int j = 0; j < dimensionsy; j++) {
                // Génération d'un nombre aléatoire entre 0 et la somme totale des probabilités
                double rand = Math.random() * sommeProbabilites; //permet de vérifier que le nombre générer est bien entre 0 et 1
                double probaCumulée = 0.0;

                // Parcourir la liste des symboles et sélectionner celui dont la probabilité cumulée dépasse rand
                for (Symbole symbole : symboleList) {
                    probaCumulée += symbole.getSpawnProbability();
                    if (rand <= probaCumulée) {
                        symboles[i][j] = symbole;
                        break;
                    }
                }
            }
        }
    }


}