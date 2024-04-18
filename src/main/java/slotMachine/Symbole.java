package slotMachine;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Symbole {
    protected String type;
    private Multiplicateur multiplicateur;
    private String image;
    private double spawnProbability;



    // Constructeur
    public Symbole(String type , String image, double spawnProbability, Multiplicateur multiplicateur ) {
        this.type = type;
        this.spawnProbability = spawnProbability;
        this.multiplicateur = multiplicateur;
        this.image = image;
    }




    //Getters
    public double getSpawnProbability() {
        return spawnProbability;
    }
    public Multiplicateur getMultiplicateur() {
        return multiplicateur;
    }
    public String getImage() {
        return image;
    }

    // Setters
    public void setSpawnProbability(double spawnProbability) {
        this.spawnProbability = spawnProbability;
    }
    public void setMultiplicateur(Multiplicateur multipliers) {
        this.multiplicateur = multipliers;
    }
    public void setImage(String image) {
        this.image = image;
    }

    public void afficherSymbole() {
        System.out.print("[" + this.type + "]");
    }

    public String getType() {
        return this.type;
    }
}


