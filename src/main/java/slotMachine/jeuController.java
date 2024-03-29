//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package slotMachine;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class grilleDeJeuController {
    private Utilisateur player;
    private MachineASous.GrilleDeJeu grille;
    @FXML
    private GridPane gridPane;
    @FXML
    private Label joueur;
    @FXML
    private Label banque;

    public grilleDeJeuController() {
    }

    @FXML
    private void initialize() {
        this.generateGUI();
    }

    public void generateGUI() {
        this.grille = new MachineASous.GrilleDeJeu(3, 5);
        this.player = new Joueur("Mathis", 200000.0);
        this.updateLabels();
    }

    @FXML
    private void onGenerateClick() {
        this.player.retirerCredits(100.0);
        this.updateLabels();
        this.grille.genererSymboles();
        this.AffichageDeLaGrille();
        GestionDesGains.verifierGrille(this.grille, this.player);
    }

    public void updateLabels() {
        this.joueur.setText(this.player.getName());
        double value = this.player.getBankAccount();
        this.banque.setText(String.valueOf(value));
    }

    private void AffichageDeLaGrille() {
        this.gridPane.getChildren().clear();

        for(int i = 0; i < this.grille.getDimensionsx(); ++i) {
            for(int j = 0; j < this.grille.getDimensionsy(); ++j) {
                Symbole symbole = this.grille.getSymboles()[i][j];
                String cheminImage = "/images/" + symbole.getType() + ".png";
                Image image = new Image(this.getClass().getResourceAsStream(cheminImage));
                ImageView imageView = new ImageView(image);
                imageView.setFitWidth(50.0);
                imageView.setFitHeight(50.0);
                this.gridPane.add(imageView, j, i);
            }
        }

    }
}
