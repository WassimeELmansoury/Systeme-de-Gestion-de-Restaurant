import java.util.ArrayList;
import java.util.List;

public class Resturant {
    private String nom;
    private List<Plat> plats;
    private Command commands;
    public Resturant(String nom) {
        this.nom = nom;
        this.plats = new ArrayList<>();
        this.commands = new ArrayList<>();
    }
    public void addPlat(Plat plat){
        plats.add(plat);
        System.out.println("Plat ajouté avec succès");
    }
    public void getMenu(){
        for (Plat p : plats){
            if (p.isEstDisponible() == true){
                System.out.println(p.getNom() + " - " + p.getPrix());
            }
        }
    }
    public void addCommand(Command c){
        commands.add(c);
        System.out.println("Command ajouté avec succès");
    }
    public void getCommands(){
        for (Command c : commands){
            System.out.println(c.getCommandId + " - " + c.getCommandDate);
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

    public void setPlats(List<Plat> plats) {
        this.plats = plats;
    }
}
