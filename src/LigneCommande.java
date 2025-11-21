public class LigneCommande {
    private int quantite;
    private Plat plat;

    public LigneCommande(Plat plat, int quantite) {
        this.plat = plat;
        this.quantite = quantite;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Plat getPlat() {
        return plat;
    }

    public void setPlat(Plat plat) {
        this.plat = plat;
    }

    public double getSousTotal(){
        return this.quantite * this.plat.getPrix();
    }

    @Override
    public String toString() {
        return "LigneCommande [quantite=" + quantite + ", plat=" + plat + "]";
    }
}
