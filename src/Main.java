public class Main {
    public static void main(String[] args) {
        Client c1 = new Client("Wassime", 61);
        Serveur s1 = new Serveur("Ismail", 5);
        ServeurVIP svip1 = new ServeurVIP("Bader", 123);

        Command demande = new Command(c1);


        c1.passerCommande(demande);
        s1.prendreCommande(demande);
        svip1.prendreCommande(demande);
        svip1.offrirServiceVIP();
    }
}
