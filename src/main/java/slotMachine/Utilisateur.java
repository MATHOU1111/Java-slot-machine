package slotMachine;

public class Utilisateur {
    private int idUtilisateur;
    private String nomUtilisateur;
    private String motDePasse;
    private Double tokens;

    // Constructeur
    public Utilisateur(int idUtilisateur, String nomUtilisateur, String motDePasse) {
        this.idUtilisateur = idUtilisateur;
        this.nomUtilisateur = nomUtilisateur;
        this.motDePasse = motDePasse; // Sécurise le mot de passe dès l'instanciation
        this.tokens = 200000.0; // Solde initial fixé à 200,000
    }

    // Getters et Setters
    public int getId() {
        return idUtilisateur;
    }

    public void setId(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public String getUserName() {
        return nomUtilisateur;
    }

    public void setUserName(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public String getPassword() {
        return motDePasse;
    }

    // Utiliser un mécanisme de hachage pour le mot de passe
    public void setMotDePasse(String motDePasse) {
        // Simulons un hachage simple ici. Dans la pratique, utilisez des bibliothèques sécurisées.
        this.motDePasse = hashPassword(motDePasse);
    }

    private String hashPassword(String motDePasse) {
        // Ceci est une fonction de hachage très simpliste. Utilisez des bibliothèques comme BCrypt ou SCrypt dans une application réelle.
        return Integer.toString(motDePasse.hashCode());
    }

    public double getBankAccount() {
        return this.tokens;
    }

    public void setBankAccount(double tokens) {
        this.tokens = tokens;
    }

    public void ajouterCredits(double montant) {
        this.tokens += montant;
    }

    public void retirerCredits(double montant) {
        this.tokens -= montant;
    }
}