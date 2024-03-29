package slotMachine;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Symbole {
    private Multiplicateur multiplicateur;
    private Image image;
    private float spawnProbability;

    public Symbole(String nom, float spawnProbability, Multiplicateur multiplicateur, int taille, Image image) {
        this.spawnProbability = spawnProbability;
        this.multiplicateur = multiplicateur;
        this.image = image;
    }


    public float getSpawnProbability() {
        return spawnProbability;
    }

    public Multiplicateur getMultiplicateur() {
        return multiplicateur;
    }


    public Image getImage() {
        return image;
    }

    // Setters

    public void setSpawnProbability(float spawnProbability) {
        this.spawnProbability = spawnProbability;
    }

    public void setMultiplicateur(Multiplicateur multipliers) {
        this.multiplicateur = multipliers;
    }


    public void setImage(Image image) {
        this.image = image;
    }
}
