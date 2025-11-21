import java.util.ArrayList;
import java.util.List;

public class Serveur extends Person {
    private List<String> commandes;

    public Serveur(String nom) {
        super(nom);
        commandes = new ArrayList<>();
    }

    public void prendreCommande(String demande) {
        commandes.add(demande);
        System.out.println("Serveur " + getNom() + " a pris la commande: " + demande);
    }
    public String afficherServeur(){
        return nom ;
    }

    public List<String> getCommandes() {
        return commandes;
    }
}
