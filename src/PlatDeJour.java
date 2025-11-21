public class PlatDeJour extends Plat{
    private String day;

    public PlatDeJour(String nom, double prix, boolean estDisponible, String day) {
        super(nom, prix, estDisponible);
        this.day = day;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
