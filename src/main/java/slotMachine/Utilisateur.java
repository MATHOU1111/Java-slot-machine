package slotMachine;

public class Utilisateur {
    private int idUtilisateur;
    private String nomUtilisateur;
    private String motDePasse;
    private int jetons;
    private int freeSpins;

    public Utilisateur(int idUtilisateur, String nomUtilisateur, String motDePasse) {
        this.idUtilisateur = idUtilisateur;
        this.nomUtilisateur = nomUtilisateur;
        this.motDePasse = motDePasse;
        this.jetons = 0;
        this.freeSpins = 0;
    }

    // Implémenter les getters et les setters
}
