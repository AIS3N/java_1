package poo.exo1;

public class TP extends Salarie{
    int nbh;
    int tauf;

    public TP(String nom, String prenom, int nbh, int tauf) {
        super(nom, prenom);
        this.nbh = nbh;
        this.tauf = tauf;
    }

    public int getNbh() {
        return nbh;
    }

    public void setNbh(int nbh) {
        this.nbh = nbh;
    }

    public int getTauf() {
        return tauf;
    }

    public void setTauf(int tauf) {
        this.tauf = tauf;
    }

    public int getSalary() {
        return nbh * tauf;
    }
}
