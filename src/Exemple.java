public class Exemple {

    public static void main (String[]args) {
        StringBuilder str = new StringBuilder("test@lala.com");
        for (int i = 0; i < str.length(); i+= 1) {
            if (str.charAt(i) != '@' || str.charAt(i) != '.') {
                str.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            }
        }
        System.out.println(str);
    }
}
