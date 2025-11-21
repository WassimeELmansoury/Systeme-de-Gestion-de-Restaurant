public class Person {
    protected String nom;
    protected static int idCounter = 1;
    protected int idPerson;

    public Person(String nom) {
        this.nom = nom;
        this.idPerson = idCounter++;
    }

    public String getNom() {
        return nom;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public String getPerson(){
        return nom + " - " + idPerson;
    }
    public void afficherClient(){
        System.out.println(nom + idPerson);
    }
}
