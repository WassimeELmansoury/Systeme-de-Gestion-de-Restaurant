public class ServeurVIP extends Serveur {

    public ServeurVIP(String nom) {
        super(nom);
    }

    @Override
    public String getPerson(){
        return nom + " - " + idPerson;
    }
    public void offrirServiceVIP() {
        System.out.println("Serveur VIP " + getNom() + " offre un service exceptionnel.");
    }
}
