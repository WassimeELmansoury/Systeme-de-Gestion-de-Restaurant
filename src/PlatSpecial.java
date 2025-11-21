public class PlatSpecial extends Plat{
    private String type;

    public PlatSpecial(String nom, double prix, boolean estDisponible, String type) {
        super(nom, prix, estDisponible);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void getPlat(){
        System.out.println(getNom() + " - " + getPrix() + "DH - " + type);
    }
}
