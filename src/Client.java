import java.util.ArrayList;
import java.util.List;


public class Client extends Person {
    private List<Command> commandes;

    public Client(String nom) {
        super(nom);
        commandes = new ArrayList<>();
    }
    @Override
    public String getPerson(){
        return nom + " - " + idPerson;
    }
    public void afficherClient(){
        System.out.println(nom + " id: " + idPerson);
    }
    public void passerCommande( Serveur s) {
        commandes.add(new Command(this,s));

    }

    public List<Command> getCommandes() {
        return commandes;
    }
}
