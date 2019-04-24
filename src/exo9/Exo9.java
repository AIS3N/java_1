package exo9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Exo9 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Mark>> array = new ArrayList<>();
        Mark n1 = new Mark(10, "Mat1");
        Mark n2 = new Mark(15, "Mat2");
        Mark n3 = new Mark(12, "Mat3");
        for (int i = 0; i < 3; i++) {
            ArrayList<Mark> row = new ArrayList<>();
            row.add(n1);
            row.add(n2);
            row.add(n3);
            array.add(row);
        }

        Application app = new Application(array);
        app.print();
        System.out.println(app.average(0));
        app.add(0, "Matiere", 18);
        System.out.println(app.average(0));
        System.out.println(app.compute());
        float[] avgs = app.avgs();
        for(int i = 0; i < avgs.length; i++) {
            System.out.println(avgs[i]);
        }

        HashSet<Mark> h = new HashSet<Mark>();
        h.add(n1);
        System.out.println(h);
    }
}
