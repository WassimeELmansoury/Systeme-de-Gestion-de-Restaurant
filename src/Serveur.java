import java.util.ArrayList;
import java.util.List;

public class Serveur extends Person {
    private List<String> commandes;

    public Serveur(String nom, int idPerson) {
        super(nom, idPerson);
        commandes = new ArrayList<>();
    }

    @Override
    public void prendreCommande(String demande) {
        commandes.add(demande);
        System.out.println("Serveur " + getNom() + " a pris la commande: " + demande);
    }

    public List<String> getCommandes() {
        return commandes;
    }
}
