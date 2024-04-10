package slotMachine;

public class Utilisateur {
    private int idUtilisateur;
    private String nomUtilisateur;
    private String motDePasse;

    private Double tokens;

    // Constructeur
    public Utilisateur(int idUtilisateur, String nomUtilisateur, String motDePasse, Double tokens) {
        this.idUtilisateur = idUtilisateur;
        this.nomUtilisateur = nomUtilisateur;
        this.motDePasse = motDePasse;
        this.tokens = tokens;
    }

    // Getters
    public String getUserName(){
        return nomUtilisateur;
    }

    public double getBankAccount() {
        return this.tokens;
    }

    public void ajouterCredits(double montant) {
        this.tokens += montant;
    }

    public void retirerCredits(double montant) {
        this.tokens -= montant;
    }

}
