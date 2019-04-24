package poo.exo1;

public abstract class Salarie {
    String  nom;
    String  prenom;

    public abstract int getSalary();

    public String getNom() {
        return nom;
    }

    public Salarie(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
