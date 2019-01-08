package exo5;

public class Exo5 {
    public static void main(String[] args) {
        String[] words = {"aas", "ace", "alu", "are", "api", "ays", "bec", "bel", "bey", "ben", "boy", "deb", "des", "dom", "dot", "daw", "fax", "fan", "faq", "fob", "hem", "hop", "man", "mao", "mug", "mus", "mie", "sur", "dey", "mur"};
        String[] array = {"2", "2", "bla"};
        func(words, "bel");
    }

    public static void func(String[] array, String arg) {
        String tmp = null;
        for (String item: array) {
            tmp = funcStr(item, arg);
            if (tmp != null) {
                arg = tmp;
            }
        }
    }

    public static boolean funcLimit(String[] array, String arg, String to_find, int nbr) {
        String tmp = null;
        int n = 0;
        for (String item: array) {
            tmp = funcStr(item, arg);
            if (tmp != null) {
                arg = tmp;
            }
            n += 1;
            if (arg == to_find) {
                if (nbr == n)
                    return true;
            }

        }
        return false;
    }

    public static String funcStr(String voisin, String arg) {
        int x = 0;
        for (int i = 0; i < voisin.length(); i++) {
            if (!(arg.contains(String.valueOf(voisin.charAt(i))))){
                x += 1;
            }
        }
        if (x == 1)
            return voisin;
        return null;
    }

}
