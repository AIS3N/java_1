package poo.exo1;

public class CDD extends Salarie {
    int sb;
    int prime;

    public CDD(String nom, String prenom, int sb, int prime) {
        super(nom, prenom);
        this.sb = sb;
        this.prime = prime;
    }

    public int getSb() {
        return sb;
    }

    public void setSb(int sb) {
        this.sb = sb;
    }

    public int getPrime() {
        return prime;
    }

    public void setPrime(int prime) {
        this.prime = prime;
    }

    public int getSalary() {
        return sb + prime;
    }
}
