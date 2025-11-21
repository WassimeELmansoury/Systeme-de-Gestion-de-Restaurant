
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

    List<Plat> Plates = new ArrayList<>();

    public Order(int commandId, int commandDate, Client client, Waiter waiter) {
        this.commandId = count++;
        this.commandDate = commandDate;
        this.client = client;
        this.waiter = waiter;
    }

    public void addPlat(Plat d) {
        Plats.add(d);
    }

    public double calculateTotal() {
        double total = 0;
        for (Plat d : Plates) {
            total += d.getPrice();
        }
        return total;
    }

    public void display() {
        System.out.println("client nom: " + " " + client.getNom());
        System.out.println("pris par: " + " " + serveur.getServeur());

        System.out.println("");
        for (Plat d : Plates) {
            System.out.println("client nom: " + " " + d.getNom() + "id:" + " " + d.getId());
        }
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

    public List<Plat> getPlates() {
        return Plates;
    }

    public void setPlates(List<Plat> Plates) {
        this.Plates = Plates;
    }
}
