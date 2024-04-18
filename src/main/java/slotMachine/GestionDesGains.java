package slotMachine;

import java.util.ArrayList;
import java.util.List;

public class GestionDesGains {
    public double calculerGains(List<Symbole> symbolesGagnants) {
        double gains = 0.0;
        // Implémentez le calcul des gains en fonction des symboles gagnants
        return gains;
    }

    public double retirerTokens() {
        double gains = 0.0;
        // Implémentez la logique pour retirer les tokens
        return gains;
    }

    public static void verifierGrille(GrilleDeJeu grille, Utilisateur joueur, double miseParTour) {
        Symbole[][] grilleSymboles = grille.getSymboles();

        String[][] tableauPattern3 = {
                {"XXX  ", "     ", "     "}, // SHAPE1
                {"     ", "XXX  ", "     "}, // SHAPE2
                {"     ", "     ", "XXX  "}, // SHAPE3
                {"X    ", " X   ", "  X  "}, // SHAPE4
                {"  X  ", " X   ", "X    "}, // SHAPE5
                {" XX  ", "X    ", "     "}, // SHAPE6
                {"     ", " XX  ", "X    "}, // SHAPE7
                {"     ", "X    ", " XX  "}, // SHAPE8
                {"X    ", " XX  ", "     "}, // SHAPE9
                {"     ", "  X  ", "XX   "}, // SHAPE10
                {"XX   ", "  X  ", "     "}, // SHAPE11
                {"     ", "X X  ", " X   "}, // SHAPE12
                {" X   ", "X X  ", "     "}, // SHAPE13
                {"X X  ", " X   ", "     "}, // SHAPE14
                {"     ", " X   ", "X X  "}, // SHAPE15
                {"  X  ", "XX   ", "     "}, // SHAPE16
                {"     ", "XX   ", "  X  "}, // SHAPE17
                {"  X  ", "     ", "XX   "}, // SHAPE18
                {"XX   ", "     ", "  X  "}, // SHAPE19
                {" XX  ", "     ", "X    "}, // SHAPE20
                {"X    ", "     ", " XX  "}, // SHAPE21
                {"  X  ", "X    ", " X   "}, // SHAPE22
                {" X   ", "X    ", "  X  "}, // SHAPE23
                {"X X  ", "     ", " X   "}, // SHAPE24
                {" X   ", "     ", "X X  "}  // SHAPE25
        };

        String[][] tableauPattern4 = {
                {"XXXX ", "     ", "     "}, // SHAPE1
                {"     ", "XXXX ", "     "}, // SHAPE2
                {"     ", "     ", "XXXX "}, // SHAPE3
                {"X    ", " X X ", "  X  "}, // SHAPE4
                {"  X  ", " X X ", "X    "}, // SHAPE5
                {" XXX ", "X    ", "     "}, // SHAPE6
                {"     ", " XXX ", "X    "}, // SHAPE7
                {"     ", "X    ", " XXX "}, // SHAPE8
                {"X    ", " XXX ", "     "}, // SHAPE9
                {"   X ", "  X  ", "XX   "}, // SHAPE10
                {"XX   ", "  X  ", "   X "}, // SHAPE11
                {"   X ", "X X  ", " X   "}, // SHAPE12
                {" X   ", "X X  ", "   X "}, // SHAPE13
                {"X X  ", " X X ", "     "}, // SHAPE14
                {"     ", " X X ", "X X  "}, // SHAPE15
                {"  X  ", "XX X ", "     "}, // SHAPE16
                {"     ", "XX X ", "  X  "}, // SHAPE17
                {"  X  ", "     ", "XX X "}, // SHAPE18
                {"XX X ", "     ", "  X  "}, // SHAPE19
                {" XXX ", "     ", "X    "}, // SHAPE20
                {"X    ", "     ", " XXX "}, // SHAPE21
                {"  X  ", "X    ", " X X "}, // SHAPE22
                {" X X ", "X    ", "  X  "}, // SHAPE23
                {"X X  ", "     ", " X X "}, // SHAPE24
                {" X X ", "     ", "X X  "}  // SHAPE25
        };


        String[][] tableauPattern5 = {
                {"XXXXX", "     ", "     "}, // SHAPE1
                {"     ", "XXXXX", "     "}, // SHAPE2
                {"     ", "     ", "XXXXX"}, // SHAPE3
                {"X   X", " X X ", "  X  "}, // SHAPE4
                {"  X  ", " X X ", "X   X"}, // SHAPE5
                {" XXX ", "X   X", "     "}, // SHAPE6
                {"     ", " XXX ", "X   X"}, // SHAPE7
                {"     ", "X   X", " XXX "}, // SHAPE8
                {"X   X", " XXX ", "     "}, // SHAPE9
                {"   XX", "  X  ", "XX   "}, // SHAPE10
                {"XX   ", "  X  ", "   XX"}, // SHAPE11
                {"   X ", "X X X", " X   "}, // SHAPE12
                {" X   ", "X X X", "   X "}, // SHAPE13
                {"X X X", " X X ", "     "}, // SHAPE14
                {"     ", " X X ", "X X X"}, // SHAPE15
                {"  X  ", "XX XX", "     "}, // SHAPE16
                {"     ", "XX XX", "  X  "}, // SHAPE17
                {"  X  ", "     ", "XX XX"}, // SHAPE18
                {"XX XX", "     ", "  X  "}, // SHAPE19
                {" XXX ", "     ", "X   X"}, // SHAPE20
                {"X   X", "     ", " XXX "}, // SHAPE21
                {"  X  ", "X   X", " X X "}, // SHAPE22
                {" X X ", "X   X", "  X  "}, // SHAPE23
                {"X X X", "     ", " X X "}, // SHAPE24
                {"X X X", "     ", " X X "}, // SHAPE24
                {" X X ", "     ", "X X X"}  // SHAPE25
        };

        rechercherEtAfficherPatterns(grilleSymboles, tableauPattern5, joueur, "Pattern5", grille, miseParTour);
        rechercherEtAfficherPatterns(grilleSymboles, tableauPattern4, joueur, "Pattern4", grille, miseParTour);
        rechercherEtAfficherPatterns(grilleSymboles, tableauPattern3, joueur, "Pattern3", grille, miseParTour);
    }


    private static void rechercherEtAfficherPatterns(Symbole[][] grille, String[][] patterns, Utilisateur joueur, String patternName, GrilleDeJeu grilleDeJeu, double miseParTour) {
        for (String[] pattern : patterns) {
            int patternHeight = pattern.length; // Hauteur du pattern
            int patternWidth = pattern[0].length(); // Largeur du pattern (supposant que toutes les lignes ont la même largeur)

            for (int i = 0; i <= grille.length - patternHeight; i++) { // grille.length est le nombre de lignes dans la grille
                for (int j = 0; j <= grille[0].length - patternWidth; j++) { // grille[0].length est le nombre de colonnes
                    List<int[]> positionsGagnantes = verifierPattern(grille, pattern, i, j);
                    if (positionsGagnantes != null && !positionsGagnantes.isEmpty()) {
                        traiterCombinaisonGagnante(positionsGagnantes, joueur, patternName, grilleDeJeu, miseParTour);
                    }
                }
            }
        }
    }

    private static List<int[]> verifierPattern(Symbole[][] grille, String[] pattern, int startX, int startY) {
        List<int[]> positionsGagnantes = new ArrayList<>();
        String expectedType = null; // Type attendu, initialisé à null
        boolean hasNonWild = false; // Flag pour vérifier si un symbole non-WILD a été rencontré

        for (int x = 0; x < pattern.length; x++) {
            for (int y = 0; y < pattern[x].length(); y++) {
                char charToMatch = pattern[x].charAt(y);
                if (charToMatch == 'X') {
                    Symbole symbole = grille[startX + x][startY + y];
                    String symType = symbole.getType();

                    if (!hasNonWild && symType.equals("type0")) {
                        positionsGagnantes.add(new int[]{startX + x, startY + y});
                    } else {
                        if (!hasNonWild) { // Si aucun symbole non-WILD n'a encore été fixé comme référence
                            expectedType = symType; // Le premier symbole non-WILD détermine le type attendu
                            hasNonWild = true;
                        }

                        if (symType.equals("type0") || symType.equals(expectedType)) {
                            positionsGagnantes.add(new int[]{startX + x, startY + y});
                        } else {
                            return null; // Si un symbole non correspondant est rencontré, retourne null
                        }
                    }
                }
            }
        }
        return positionsGagnantes; // Retourne les positions des symboles gagnants si le pattern est valide
    }

    public static double calculerGainsPourSymbole(Symbole symbole, int nombreSymboles, double miseParTour) {
        Double multiplicateur = symbole.getMultiplicateur().getMultiplicateur().get(nombreSymboles);
        if (multiplicateur != null) {
            return multiplicateur * miseParTour;
        }
        return 0.0;
    }

    private static void traiterCombinaisonGagnante(List<int[]> positionsGagnantes, Utilisateur joueur, String patternName, GrilleDeJeu grille, double miseParTour) {
        double gain = 0;
        int nombreSymboles = positionsGagnantes.size();
        for (int[] position : positionsGagnantes) {
            Symbole symbole = grille.getSymboles()[position[0]][position[1]];
            System.out.println(grille.getSymboles()[position[0]][position[1]].getType() + " à la position [" + position[0] + "][" + position[1] + "]");
            gain = calculerGainsPourSymbole(symbole, nombreSymboles, miseParTour);
            grille.getSymboles()[position[0]][position[1]] = null; // Supprimer le symbole gagnant
        }
        joueur.ajouterCredits(gain);  // Ajouter les gains au solde de l'utilisateur
        grille.faireTomberEtRemplirSymboles();  // Faire tomber et remplir les symboles
        System.out.println("Gains totaux pour " + patternName + ": " + gain);
    }
}