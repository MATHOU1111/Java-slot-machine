package slotMachine


public class SymboleFactory{
    // Création des symboles représentant des Pokémon
    private static final Symbole type0 = new Symbole("type0", 0.0359, 1);
    private static final Symbole type1 = new Symbole("type1", 0.0479, 1);
    private static final Symbole type2 = new Symbole("type2", 0.0719, 1);
    private static final Symbole type3 = new Symbole("type3", 0.0103, 1);
    private static final Symbole type4 = new Symbole("type4", 0.1150, 1);
    private static final Symbole type5 = new Symbole("type5", 0.1438, 1);
    private static final Symbole type6 = new Symbole("type6", 0.1917,1);
    private static final Symbole type7 = new Symbole("type7", 0.1917, 1);
    private static final Symbole type8 = new Symbole("type8", 0.1917, 1);

    // Méthode pour obtenir tous les symboles Pokémon avec leurs probabilités
    public static Symbole[] genererSymboles() {
        return new Symbole[]{type0, type1, type2, type3, type4, type5, type6, type7, type8};
    }
