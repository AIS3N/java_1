package tp.exo3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Exo3 {
    public static void main(String[] args) {
        double  total_area = 0;
        double  total_tax = 0;
        int     pool_nbr = 0;
        ArrayList<Building> array = new ArrayList<>();
        array.add(new Villa("Jotaro", "67 rue des immobiliers", 500, 5, true));
        array.add(new Villa("Giorno", "67 rue des venteo", 150, 3, false));
        array.add(new Company("Eren", "mahr", 200, "SNK", 2, 150));

        for (Building item: array) {
            total_area += item.getArea();
            total_tax += item.tax();
            if (item instanceof Villa) {
                if (((Villa) item).isSwimming_pool()) {
                    pool_nbr += 1;
                }
            }
        }
        System.out.println("Total area: "+ total_area + "\n Total Tax: " + total_tax + "\n Pool Nbr: " + pool_nbr);
        Collections.sort(array, (Building o1, Building o2) ->
                (int)(o1.getArea() - o2.getArea())
        );

        System.out.println("\n// Sorted by area //\n");
        for (Building item:array) {
            System.out.println(item);
        }

        System.out.println("\n// Sorted by name //\n");
        Collections.sort(array, Comparator.comparing(Building::getOwner));

        for (Building item:array) {
            System.out.println(item);
        }

    }

}