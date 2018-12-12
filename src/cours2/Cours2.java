package cours2;

import java.util.ArrayList;

public class Cours2 {

    public static void main(String[]args) {
        permute();
        construction();
    }
    public static void permute() {
        double[]a = {10, 20, 30};
        double[]b = {40, 50, 60};
        double[]c;

        c = a;
        a = b;
        b = c;
    }

    public static void construction() {
        StringBuilder[]array;
        array = new StringBuilder[10];
        for(int i = 0; i < array.length; i++) {
            array[i] = new StringBuilder("a");
        }
    }

    public static void createArrayList() {
        ArrayList<String> list;
        list = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            list.add("a" + (i + 1));
        }
    }

    public static double sum(double[]array) {
        double value = 0;
        for (double element:array) {
            value+= element;
        }
        return value;
    }
    public static String[] addToArray(String[]array){
        String[] result = new String[array.length + 1];
        for (int i = 0; i < array.length + 1; i++) {
            if (i == array.length + 1)
                result[i] = "null";
            else
                result[i] = array[i];
        }
        return result;
    }
}
