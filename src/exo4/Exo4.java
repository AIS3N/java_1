// Created By Demirel
// Exo 4

package exo4;

import java.util.Arrays;
import java.util.Scanner;

public class Exo4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = reader.next();
        Scanner reader2 = new Scanner(System.in);
        System.out.println("Enter a verification string: ");
        String str2 = reader2.next();
        int verif = verification(str, str2);
        if (args.length > 0) {
            if (args[0].equals("/a")) {
                Scanner reader3 = new Scanner(System.in);
                System.out.println("Enter a new string: ");
                String str3 = reader3.next();
                anagram(str, str3);
            }
            if (args[0].equals("/o")) {
                Scanner reader4 = new Scanner(System.in);
                System.out.println("Enter a new string: ");
                String str4 = reader4.next();
                outofstring(str, str4);
            }
        }
        if (verif == 1) {
            System.out.println("Error, bad character detected");
            System.exit(1);
        }
        droite(3, str);
    }

    public static int verification(String str, String verif) {
        char a = verif.charAt(0);
        if (Character.isLetter(a)) {
            for (int i = 0; i < str.length(); i++) {
                if (!(Character.isLetter(str.charAt(i)))) {
                    return 1;
                }
            }
        }
        else if (Character.isDigit(a)) {
            for (int i = 0; i < str.length(); i++) {
                if (!(Character.isDigit(str.charAt(i)))) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public static String gauche(int nbr, String str) {
        String res = str.substring(str.length() - nbr);
        str = str.substring(0, str.length() - nbr);
        for (int i = 0; i < str.length(); i++) {
            res += str.charAt(i);
        }
        System.out.println(res);
        return res;
    }

    public static String droite(int nbr, String str) {
        String res = str.substring(0, nbr);
        str = str.substring(str.length() - nbr);
        for (int i = 0; i < res.length(); i++) {
            str += res.charAt(i);
        }
        System.out.println(str);
        return str;
    }

    public static void anagram(String str, String str2) {
        char tmp1[] = str.toCharArray();
        char tmp2[] = str2.toCharArray();
        Arrays.sort(tmp1);
        Arrays.sort(tmp2);
        if (Arrays.equals(tmp1, tmp2)) {
            System.out.println("Is Anagram");
        }
        else {
            System.out.println("Is not anagram");
        }
    }

    public static void outofstring(String str, String str2) {
        if (str.contains(str2)) {
            System.out.println("La suite existe");
            str = str.replace(str2, "");
            System.out.println("After remove: " + str);
        }
        else {
            System.out.println("La suite n'existe pas");
        }
    }
}
