package poo.exo1;

public class Main {
    public static void main(String[] args) {
        Salarie[] array = new Salarie[3];
        array[0] = new CDD("Nom1", "Prenom1", 2000, 500);
        array[1] = new CDI("Nom2", "Prenom2", 2500);
        array[2] = new TP("Nom3", "Prenom3", 200, 100);
        // Boucle for et call sur getSalary
    }
}
