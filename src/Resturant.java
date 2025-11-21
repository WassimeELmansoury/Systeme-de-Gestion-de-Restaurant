import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Resturant {
    private String nom;
    private static List<Client> clients = new ArrayList<>(List.of(new Client("Mehdi") ,  new Client("Wassim")));
    private static List<Serveur> serveurs = new ArrayList<>(List.of(new Serveur("Ahmed") , new Serveur("Marouane")));
    private static List<Plat> plats = new ArrayList<>(List.of(new Plat("Tajine de Poulet Citron", 45.0, true) , new Plat("Pizza 4 Fromages", 35.0, true), new Plat("Couscous Royal", 65.0, true)));;
    private static List<Plat> platDisponible;
    private List<Command> commands;
    public Resturant(String nom) {
        this.nom = nom;
        this.commands = new ArrayList<>();
        platDisponible = new ArrayList<>();
    }
    public void addPlat(Plat plat){
        plats.add(plat);
        System.out.println("Plat ajouté avec succès");
    }

    public void displayPlats(){
        for (Plat p : plats){
            if (!platDisponible.contains(p)){
                if (p.isEstDisponible() == true){
                    platDisponible.add(p);
                }
            }
        }
        int i = 1;
        for (Plat p : platDisponible){
            System.out.println(i + " : " + p.getNom() + " - " + p.getPrix());
            i++;
        }
    }
    public void getMenu(){
        try {
            Scanner s = new Scanner(System.in);
            displayClients();
            System.out.print("Entrez Client Id: ");
            int id = s.nextInt();
            displayServeurs();
            System.out.print("Entrez serveur Id: ");
            int sId = s.nextInt();
            for (Plat p : plats){
                if (p.isEstDisponible() == true){
                    platDisponible.add(p);
                }
            }
            int i = 1;
            for (Plat p : platDisponible){

                System.out.println(i + " : " + p.getNom() + " - " + p.getPrix());
                i++;
            }

            System.out.print("Entrez votre choix: ");
            int num = s.nextInt();
            System.out.print("Combien: ");
            int quantite = s.nextInt();
            Command c = new Command( clients.get(id - 1),  serveurs.get(sId - 1));
            commands.add(c);
            c.addLigne(platDisponible.get(num-1) , quantite);

        } catch (Exception e) {
            System.out.println("Quelque chose s'est mal passé");
            System.out.println(e);
            getMenu();
        }
    }
    public void addCommand(Command c){
        commands.add(c);
        System.out.println("Command ajouté avec succès");
    }
    public void getCommands(){
        for (Command c : commands){
            System.out.println(c.getCommandId() + " - " + c.getCommandDate());
        }
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Plat> getPlats() {
        return plats;
    }

    public List<Client> getClients() {
        return clients;
    }
    public void addClinet(Client client){
        clients.add(client);
    }
    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
    public void displayClients(){
        for (Client c : clients){
            c.afficherClient();
        }
    }
    public void addServeur(Serveur s){
        serveurs.add(s);
    }
    public  void displayServeurs(){
        int i = 1;
        for (Serveur s : serveurs){
            System.out.println(s.afficherServeur() + " Id : " + i++);
        }
    }
    public void setPlats(List<Plat> plats) {
        this.plats = plats;
    }

    public void displayCommandes(){
        for (Command c : commands){
            c.display();
        }
    }
}
