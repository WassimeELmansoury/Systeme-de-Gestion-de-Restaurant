import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Client> clients = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Resturant restaurant = new Resturant("Kfc"); // your manager class

        int choice;

        do {
            System.out.println("\n====== MENU RESTAURANT ======");
            System.out.println("1. Gérer Clients");
            System.out.println("2. Gérer Plats");
            System.out.println("3. Gérer Serveurs");
            System.out.println("4. Gérer Commandes");
            System.out.println("5. Quitter");
            System.out.print("Choix : ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    menuClients(sc, restaurant);
                    break;

                case 2:
                    menuPlats(sc, restaurant);
                    break;

                case 3:
                    menuServeurs(sc, restaurant);
                    break;

                case 4:
                    menuCommandes(sc, restaurant);
                    break;

                case 5:
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide !");
            }

        } while (choice != 5);
    }

    // -----------------------------------------
    //              MENU CLIENTS
    // -----------------------------------------
    public static void menuClients(Scanner sc, Resturant r) {

        int c;

        do {
            System.out.println("\n---- MENU CLIENTS ----");
            System.out.println("1. Ajouter client");
            System.out.println("2. Afficher clients");
            System.out.println("3. Retour");
            System.out.print("Choix : ");
            c = sc.nextInt();

            switch (c) {

                case 1:
                    System.out.print("Nom client : ");
                    String nom = sc.next();
                    r.addClinet(new Client(nom));
                    break;

                case 2:
                    r.displayClients();
                    break;

                case 3:
                    break;

                default:
                    System.out.println("Choix invalide !");
            }

        } while (c != 3);
    }

    // -----------------------------------------
    //              MENU PLATS
    // -----------------------------------------
    public static void menuPlats(Scanner sc, Resturant r) {

        int c;

        do {
            System.out.println("\n---- MENU PLATS ----");
            System.out.println("1. Ajouter plat");
            System.out.println("2. Afficher plats");
            System.out.println("3. Retour");
            System.out.print("Choix : ");
            c = sc.nextInt();

            switch (c) {

                case 1:
                    System.out.print("Nom plat : ");
                    String nom = sc.next();

                    System.out.print("Prix : ");
                    double prix = sc.nextDouble();

                    System.out.print("Est disponible? : ");
                    boolean estDisponible = sc.nextBoolean();
                    r.addPlat(new Plat(nom, prix , estDisponible));
                    break;

                case 2:
                    r.displayPlats();
                    break;

                case 3:
                    break;

                default:
                    System.out.println("Choix invalide !");
            }

        } while (c != 3);
    }

    // -----------------------------------------
    //              MENU SERVEURS
    // -----------------------------------------
    public static void menuServeurs(Scanner sc, Resturant r) {

        int c;

        do {
            System.out.println("\n---- MENU SERVEURS ----");
            System.out.println("1. Ajouter serveur");
            System.out.println("2. Afficher serveurs");
            System.out.println("3. Retour");
            System.out.print("Choix : ");
            c = sc.nextInt();

            switch (c) {

                case 1:
                    System.out.print("Nom serveur : ");
                    String nom = sc.next();
                    r.addServeur(new Serveur(nom));
                    break;

                case 2:
                    r.displayServeurs();
                    break;

                case 3:
                    break;

                default:
                    System.out.println("Choix invalide !");
            }

        } while (c != 3);
    }

    // -----------------------------------------
    //              MENU COMMANDES
    // -----------------------------------------
    public static void menuCommandes(Scanner sc, Resturant r) {

        int c;

        do {
            System.out.println("\n---- MENU COMMANDES ----");
            System.out.println("1. Nouvelle commande");
            System.out.println("2. Afficher commandes");
            System.out.println("3. Retour");
            System.out.print("Choix : ");
            c = sc.nextInt();

            switch (c) {

                case 1:
                    r.getMenu();
                    break;

                case 2:
                    r.displayCommandes();
                    break;

                case 3:
                    break;

                default:
                    System.out.println("Choix invalide !");
            }

        } while (c != 3);




    }
}
