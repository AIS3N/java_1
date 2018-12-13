// Created By Demirel
// Exo 3

package exo3;

import java.io.FileNotFoundException;

public class Exo3 {
    public static void main(String[] args) {
        String[] array = {"2", "2", "bla"};
        try {
            double result = func1(array);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Exception func1");
            System.out.println(e);
        }
    }

    public static double func1(String[] array) {
        int total = 0;
        double average = 0;
        int len = 0;
        for (int i = 0; i < array.length; i++) {
            try {
                total += Integer.parseInt(array[i]);
                len++;
            } catch (Exception e) {
                System.out.println(e);
            }

        }
        System.out.println(len);
        average = total / len;
        return average;
    }
}
