public class ServeurVIP extends Serveur {

    public ServeurVIP(String nom, int idPerson) {
        super(nom, idPerson);
    }

    @Override
    public void offrirServiceVIP() {
        System.out.println("Serveur VIP " + getNom() + " offre un service exceptionnel.");
    }
}
