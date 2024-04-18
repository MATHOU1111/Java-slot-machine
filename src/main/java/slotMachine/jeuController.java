package slotMachine;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class jeuController {
    private Utilisateur player;
    private GrilleDeJeu grille;
    @FXML
    private GridPane gridPane;
    @FXML
    private Label joueur;
    @FXML
    private Label banque;

    private double mise; // Variable pour stocker la mise actuelle
    @FXML
    private ComboBox<String> comboBoxNiveau1; // Ajoute les autres ComboBox de la même manière
    @FXML
    private ComboBox<String> comboBoxNiveau2; // Ajoute les autres ComboBox de la même manière
    @FXML
    private ComboBox<String> comboBoxNiveau3; // Ajoute les autres ComboBox de la même manière
    @FXML
    private ComboBox<String> comboBoxNiveau4; // Ajoute les autres ComboBox de la même manière
    @FXML
    private ComboBox<String> comboBoxNiveau5; // Ajoute les autres ComboBox de la même manière
    @FXML
    private ComboBox<String> comboBoxNiveau6; // Ajoute les autres ComboBox de la même manière
    @FXML
    private ComboBox<String> comboBoxNiveau7; // Ajoute les autres ComboBox de la même manière
    @FXML
    private ComboBox<String> comboBoxNiveau8; // Ajoute les autres ComboBox de la même manière
    @FXML
    private ComboBox<String> comboBoxNiveau9; // Ajoute les autres ComboBox de la même manière
    @FXML
    private ComboBox<String> comboBoxNiveau10; // Ajoute les autres ComboBox de la même manière
    @FXML
    private ComboBox<String> comboBoxNiveau11; // Ajoute les autres ComboBox de la même manière
    @FXML
    private ComboBox<String> comboBoxNiveau12; // Ajoute les autres ComboBox de la même manière
    @FXML
    private ComboBox<String> comboBoxNiveau13; // Ajoute les autres ComboBox de la même manière
    @FXML
    private ComboBox<String> comboBoxNiveau14; // Ajoute les autres ComboBox de la même manière
    @FXML
    private ComboBox<String> comboBoxNiveau15; // Ajoute les autres ComboBox de la même manière
    @FXML
    private ComboBox<String> comboBoxNiveau16; // Ajoute les autres ComboBox de la même manière
    @FXML
    private ComboBox<String> comboBoxNiveau17; // Ajoute les autres ComboBox de la même manière
    @FXML
    private ComboBox<String> comboBoxNiveau18; // Ajoute les autres ComboBox de la même manière
    @FXML
    private ComboBox<String> comboBoxNiveau19; // Ajoute les autres ComboBox de la même manière
    @FXML
    private ComboBox<String> comboBoxNiveau20; // Ajoute les autres ComboBox de la même manière
    @FXML
    private ComboBox<String> comboBoxNiveau21; // Ajoute les autres ComboBox de la même manière
    @FXML
    private Label errorLabel;
    @FXML
    private Label miseLabel;



    @FXML
    private void initialize() {
        Platform.runLater(this::showLoginDialog);
        // Configuration initiale des ComboBox
        setupComboBoxes();
    }


    private void updateErrorAndBetLabels(String message, double mise, boolean isError) {
        Platform.runLater(() -> {
            if (!message.isEmpty()) {
                if (isError) {
                    errorLabel.setTextFill(javafx.scene.paint.Color.web("#b52619")); // Couleur pour les erreurs
                    errorLabel.setText("Erreur : " + message);
                } else {
                    errorLabel.setTextFill(javafx.scene.paint.Color.web("#fed863")); // Couleur pour les gains
                    errorLabel.setText("Gains : " + message);
                }
            }
            miseLabel.setText("Mise actuelle: " + String.format("%.2f", mise));
        });
    }

    private void updateGainLabel(String gainMessage) {
        Platform.runLater(() -> {
            if (!gainMessage.isEmpty()) {
                errorLabel.setTextFill(javafx.scene.paint.Color.web("#fed863")); // Couleur pour les gains
                errorLabel.setText("Gains : " + gainMessage);
            }
        });
    }

    private void setupComboBoxes() {
        ComboBox<String>[] comboBoxes = new ComboBox[]{
                comboBoxNiveau1, comboBoxNiveau2, comboBoxNiveau3, comboBoxNiveau4, comboBoxNiveau5, comboBoxNiveau6,
                comboBoxNiveau7, comboBoxNiveau8, comboBoxNiveau9, comboBoxNiveau10, comboBoxNiveau11, comboBoxNiveau12,
                comboBoxNiveau13, comboBoxNiveau14, comboBoxNiveau15, comboBoxNiveau16, comboBoxNiveau17, comboBoxNiveau18,
                comboBoxNiveau19, comboBoxNiveau20, comboBoxNiveau21
        };
        // Ajoute des écouteurs de changement à toutes les ComboBox
        for (ComboBox<String> comboBox : comboBoxes) {
            comboBox.valueProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue != null && !newValue.isEmpty()) {
                    System.out.println("Mise sélectionnée: " + newValue);
                    mise = Double.parseDouble(newValue); // Mise à jour de la variable mise
                    updateErrorAndBetLabels("", mise, true);
                }
            });
        }
    }

    public void generateGUI() {
        // S'assure que l'utilisateur est bien défini avant de générer l'interface
        if (player != null) {
            this.grille = new GrilleDeJeu(3, 5); // Initialisation de la grille avec les dimensions par défaut
            updateLabels(); // Met à jour les labels avec les données de l'utilisateur
        } else {
            showAlert("Erreur de l'interface", "Aucun utilisateur n'est chargé dans l'interface.");
        }
    }

    private void showLoginDialog() {
        Dialog<Utilisateur> dialog = new Dialog<>();
        dialog.setTitle("Connexion");
        dialog.setHeaderText("Veuillez vous connecter ou créer un compte");

        // Boutons de la boîte de dialogue
        ButtonType loginButtonType = new ButtonType("Connexion", ButtonBar.ButtonData.OK_DONE);
        ButtonType createAccountButtonType = new ButtonType("Créer un compte", ButtonBar.ButtonData.OTHER);
        dialog.getDialogPane().getButtonTypes().addAll(loginButtonType, createAccountButtonType, ButtonType.CANCEL);

        // Layout pour les champs de connexion
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        TextField username = new TextField();
        PasswordField password = new PasswordField();
        username.setPromptText("Nom d'utilisateur");
        password.setPromptText("Mot de passe");
        grid.add(new Label("Nom d'utilisateur:"), 0, 0);
        grid.add(username, 1, 0);
        grid.add(new Label("Mot de passe:"), 0, 1);
        grid.add(password, 1, 1);
        dialog.getDialogPane().setContent(grid);

        Platform.runLater(username::requestFocus);

        dialog.setResultConverter(dialogButton -> {
            if (dialogButton == loginButtonType) {
                return new Utilisateur(0, username.getText(), password.getText());
            } else if (dialogButton == createAccountButtonType) {
                showCreateAccountDialog();
                return null; // Ne ferme pas la boîte de dialogue principale si l'utilisateur décide de créer un compte
            }
            return null;
        });

        Optional<Utilisateur> result = dialog.showAndWait();
        result.ifPresent(this::handleLogin);
    }


    private void showCreateAccountDialog() {
        Dialog<Utilisateur> dialog = new Dialog<>();
        dialog.setTitle("Création de compte");
        dialog.setHeaderText("Entrez les informations pour créer un compte");

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        TextField username = new TextField();
        PasswordField password = new PasswordField();
        username.setPromptText("Nom d'utilisateur");
        password.setPromptText("Mot de passe");
        grid.add(new Label("Nom d'utilisateur:"), 0, 0);
        grid.add(username, 1, 0);
        grid.add(new Label("Mot de passe:"), 0, 1);
        grid.add(password, 1, 1);
        dialog.getDialogPane().setContent(grid);

        dialog.getDialogPane().getButtonTypes().addAll(ButtonType.OK, ButtonType.CANCEL);

        dialog.setResultConverter(dialogButton -> {
            if (dialogButton == ButtonType.OK) {
                Utilisateur newUser = new Utilisateur(UtilisateurManager.getNextUserId(), username.getText(), password.getText());
                UtilisateurManager.ajouterUtilisateur(newUser);
                showAlert("Succès", "Compte créé avec succès. Veuillez vous connecter.");
                System.out.println("Nom d'utilisateur: " + username.getText());
                System.out.println("Mot de passe: " + password.getText());
            }
            return null;
        });

        dialog.showAndWait();
    }

    private void handleLogin(Utilisateur userInput) {
        List<Utilisateur> utilisateurs = UtilisateurManager.lireUtilisateurs();
        boolean found = false;
        for (Utilisateur u : utilisateurs) {
            if (u.getUserName().equals(userInput.getUserName()) && u.getPassword().equals(userInput.getPassword())) {
                this.player = u; // Sauvegarde l'utilisateur connecté dans 'player'
                generateGUI(); // Génère l'interface utilisateur avec les données de l'utilisateur
                found = true;
                break;
            }
        }
        if (!found) {
            Platform.runLater(() -> {
                showAlert("Erreur de connexion", "Nom d'utilisateur ou mot de passe incorrect.");
                showLoginDialog(); // Relance la boîte de dialogue de connexion en cas d'échec
            });
        }
    }

    @FXML
    private void onGenerateClick() {
        if (mise > this.player.getBankAccount()) {
            updateErrorAndBetLabels("Vous n'avez pas assez de crédits pour miser cette somme.", mise , true);
        } else if (mise == 0) {
            updateErrorAndBetLabels("Veuillez sélectionner une mise.", 0, true);
        }
        else{
            this.player.retirerCredits(mise);
            this.updateLabels();
            this.grille.genererSymboles();
            this.AffichageDeLaGrille();
            GestionDesGains.verifierGrille(this.grille, this.player, mise);
            this.grille.faireTomberEtRemplirSymboles(); // Ajout de la logique pour faire tomber et remplir les symboles
            this.AffichageDeLaGrille(); // Mise à jour de l'affichage après la chute des symboles
        }
    }

    private void updateLabels() {
        joueur.setText(player.getUserName());
        banque.setText(String.format("%.2f", player.getBankAccount()));
    }


    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    private void AffichageDeLaGrille() {
        System.out.println("-------------------- Affichage de la grille --------------------");
        this.gridPane.getChildren().clear();

        for (int i = 0; i < this.grille.getDimensionsx(); ++i) {
            for (int j = 0; j < this.grille.getDimensionsy(); ++j) {
                Symbole symbole = this.grille.getSymboles()[i][j];
                System.out.print(symbole.getType() + " "); // Afficher le type de symbole avec un espace
                String cheminImage = "images/" + symbole.getType() + ".png";
                Image image = new Image(Objects.requireNonNull(this.getClass().getResourceAsStream(cheminImage)));
                ImageView imageView = new ImageView(image);
                imageView.setFitWidth(50.0);
                imageView.setFitHeight(50.0);
                this.gridPane.add(imageView, j, i);
            }
            System.out.println();
        }
    }
}


