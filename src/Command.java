
import java.util.ArrayList;
import java.util.List;

public class Command {

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Command.count = count;
    }

    private int commandId;
    private int commandDate;
    private static int count = 1;
    private Client client;
    private Serveur serveur;

    List<LigneCommande> lignes = new ArrayList<>();

    public Command(Client client, int commandDate, int commandId, Serveur serveur) {
        this.client = client;
        this.commandDate = commandDate;
        this.commandId = commandId;
        this.serveur = serveur;
    }

    public void addLigne(Plat p, int quantite) {
        LigneCommande lignes = new LigneCommande(p, quantite);
        this.lignes.add(lignes);
    }

    public double calculateTotal() {
        double total = 0;
        for (LigneCommande l : lignes) {
            total += l.getSousTotal();
        }
        return total;
    }
//             +==== display =====+
    public void display() {
        System.out.println("client nom: " + " " + client.getNom());
        System.out.println("pris par: " + " " + serveur.getServeur());
        System.out.println("command Id: " + " " + commandId);

        System.out.println("");
        for (LigneCommande l : lignes) {
            System.out.println(l.getQuantite() + "x" + l.getPlat().getPrix() + "=" + l.getSousTotal() + "DH");
        }
        System.out.println("Total: " + calculateTotal() + "DH");
    }

    public int getCommandId() {
        return commandId;
    }

    public void setCommandId(int commandId) {
        this.commandId = commandId;
    }

    public int getCommandDate() {
        return commandDate;
    }

    public void setCommandDate(int commandDate) {
        this.commandDate = commandDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Serveur getServeur() {
        return serveur;
    }

    public void setServeur(Serveur serveur) {
        this.serveur = serveur;
    }

    @Override
    public String toString() {
        return "Command [commandId=" + commandId + ", commandDate=" + commandDate + ", client=" + client + ", serveur="
                + serveur + ", lignes=" + lignes + ", calculateTotal()=" + calculateTotal();
    }

    

}
