
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
    private String commandDate;
    LocalDate myDateObj = LocalDate.now();
    private static int count = 1;
    private Client client;
    private Serveur serveur;
    private static int commandCounter = 1;

    private static List<LigneCommande> lignes = new ArrayList<>();

    public Command(Client client, Serveur serveur) {
        this.client = client;
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MMM dd yyyy");
        this.commandDate =  myDateObj.format(myFormatObj);
        this.commandId = commandCounter++;
        this.serveur = serveur;
    }

    public void addLigne(Plat p, int quantite) {
        LigneCommande lignes = new LigneCommande(p, quantite);
        this.lignes.add(lignes);
        System.out.println("Client " + client.getNom() + " a passé la commande NR " + getCommandId() + ", Serveur: " + getServeur().getNom() +" Total: " + lignes.getSousTotal() + "Mad");
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
        System.out.println("pris par: " + " " + serveur.getPerson());
        System.out.println("command Id: " + " " + commandId);
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

    public String getCommandDate() {
        return commandDate;
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
