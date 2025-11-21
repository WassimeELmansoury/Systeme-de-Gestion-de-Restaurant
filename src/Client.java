import java.util.ArrayList;
import java.util.List;

public class Client extends Person {
    private List<Command> commandes;

    public Client(String nom, int idPerson) {
        super(nom, idPerson);
        commandes = new ArrayList<>();
    }
    @Override
    public void passerCommande(String demande) {
        commandes.add(demande);
        System.out.println("Client " + getNom() + " a passé la commande: " + demande.getCommandId());
    }

    public List<String> getCommandes() {
        return commandes;
    }
}
