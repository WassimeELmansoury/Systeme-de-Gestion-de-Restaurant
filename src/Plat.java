public class Plat {
    private String nom;
    private double prix;
    private boolean estDisponible;

    public Plat(String nom, double prix , boolean estDisponible) {
        this.nom = nom;
        this.prix = prix;
        this.estDisponible = estDisponible;
    }

    public boolean isEstDisponible() {
        return estDisponible;
    }

    public void setEstDisponible(boolean estDisponible) {
        this.estDisponible = estDisponible;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
