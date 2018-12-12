// Created By Demirel
// Exo 2

package Exo1;

import java.io.*;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.OptionalDouble;

public class Exo1 {

    public static String getPoints(String str) {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\demir\\IdeaProjects\\test\\src\\Exo1\\data"))) {
            String line;
            String lines[];
            while ((line = reader.readLine()) != null) {
                lines = line.split(":");
                if (lines[0].equals(str)) {
                    return lines[1];
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "not found";
    }

    public static void func1() {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\demir\\IdeaProjects\\test\\src\\Exo1\\data"))) {
            String line;
            String lines[];
            ArrayList<Integer> array = new ArrayList<Integer>();
            while ((line = reader.readLine()) != null) {
                lines = line.split(":");
                array.add(Integer.parseInt(lines[1]));
                System.out.println(lines[1]);
            }
            OptionalDouble average = array
                    .stream()
                    .mapToDouble(a -> a)
                    .average();
            System.out.println(average);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Instant start = Instant.now() ;
        System.out.println(getPoints("demirel.sc@gmail.com"));
        Duration duration = Duration.between(start, Instant.now());
        System.out.println(duration);
    }
}
