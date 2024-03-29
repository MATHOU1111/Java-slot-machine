package slotMachine;
import java.util.HashMap;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Symbole {
    private String nom;
    private float spawnProbability;
    private Multiplicateur multiplicateur;
    private int taille;
    private Image image;

    public Symbole(String nom, float spawnProbability, Multiplicateur multiplicateur, int taille, Image image) {
        this.nom = nom;
        this.spawnProbability = spawnProbability;
        this.multiplicateur = multiplicateur;
        this.taille = taille;
        this.image = image;
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public float getSpawnProbability() {
        return spawnProbability;
    }

    public Multiplicateur getMultiplicateur() {
        return multiplicateur;
    }

    public int getTaille() {
        return taille;
    }

    public Image getImage() {
        return image;
    }

    // Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setSpawnProbability(float spawnProbability) {
        this.spawnProbability = spawnProbability;
    }

    public void setMultiplicateur(Multiplicateur multipliers) {
        this.multiplicateur = multipliers;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
