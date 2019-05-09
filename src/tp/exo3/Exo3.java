package tp.exo3;

import java.util.ArrayList;

public class Exo3 {
    public static void main(String[] args) {
        double  total_area = 0;
        double  total_tax = 0;
        int     pool_nbr = 0;
        ArrayList<Building> array = new ArrayList<>();
        array.add(new Villa("Jotaro", "67 rue des immobiliers", 500, 5, true));
        array.add(new Villa("Giorno", "67 rue des venteo", 150, 3, false));
        array.add(new Company("Eren", "mahr", 1200, "SNK", 2, 150));

        for (Building item: array) {
            total_area += item.getArea();
            total_tax += item.tax();
        }
        System.out.println("Total area: "+ total_area + "\n Total Tax: " + total_tax);
    }

}