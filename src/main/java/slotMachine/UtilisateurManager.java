package slotMachine;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class UtilisateurManager {
    private static final String CSV_FILE = "src/main/resources/slotMachine/db.csv";

    public static List<Utilisateur> lireUtilisateurs() {
        List<Utilisateur> utilisateurs = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(CSV_FILE))) {
            String line;
            br.readLine(); // skip header
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                String username = data[1];
                String password = data[2];
                double bank = Double.parseDouble(data[3]);
                utilisateurs.add(new Utilisateur(id, username, password));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return utilisateurs;
    }

    public static void ajouterUtilisateur(Utilisateur utilisateur) {
        try (FileWriter fw = new FileWriter(CSV_FILE, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            // Assure-toi que le mot de passe est écrit en texte brut.
            System.out.println("Adding user: " + utilisateur.getUserName() + " with password: " + utilisateur.getPassword());
            out.println(utilisateur.getId() + "," + utilisateur.getUserName() + "," + utilisateur.getPassword() + "," + utilisateur.getBankAccount());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void mettreAJourUtilisateur(Utilisateur utilisateur) {
        File tempFile = new File(CSV_FILE + ".tmp");
        try (BufferedReader br = new BufferedReader(new FileReader(CSV_FILE));
             FileWriter fw = new FileWriter(tempFile, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            String line;
            out.println("id,username,password,bank"); // rewrite header
            while ((line = br.readLine()) != null) {
                if (!line.startsWith(utilisateur.getId() + ",")) {
                    out.println(line);
                } else {
                    out.println(utilisateur.getId() + "," + utilisateur.getUserName() + "," + utilisateur.getPassword() + "," + utilisateur.getBankAccount());
                }
            }
            // Replace old file with updated file
            Files.move(tempFile.toPath(), Path.of(CSV_FILE), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int getNextUserId() {
        int maxId = 0;
        for (Utilisateur utilisateur : lireUtilisateurs()) {
            if (utilisateur.getId() > maxId) {
                maxId = utilisateur.getId();
            }
        }
        return maxId + 1; // retourne l'ID maximum trouvé incrémenté de 1
    }
}
