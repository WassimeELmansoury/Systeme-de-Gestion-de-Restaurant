public class Person {
    protected String nom;
    protected int idPerson;

    public Person(String nom, int idPerson) {
        this.nom = nom;
        this.idPerson = idPerson;
    }

    public String getNom() {
        return nom;
    }

    public int getIdPerson() {
        return idPerson;
    }
}
