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
        for (int i = 0; i < dimensionsx; i++) {
            for (int j = 0; j < dimensionsy; j++) {
                // Sélectionnez aléatoirement un symbole dans la liste de tous les symboles possibles
                int randomIndex = random.nextInt(symboleList.length);
                Symbole symbole = symboleList[randomIndex];
                // Affectez ce symbole à la cellule correspondante dans la grille
                symboles[i][j] = symbole;
            }
        }
    }

}