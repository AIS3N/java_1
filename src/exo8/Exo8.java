// Chap 2 Ex 1
package exo8;

public class Exo8 {
    public static void main(String[] args){
        De de = new De();
        int value;
        int value2;
        int nbr = 0;
        int row;

        if (args.length > 0) {
            nbr = Integer.parseInt(args[0]);
        }
        if (nbr > 0) {
            for (int i = 0; i < nbr; i++) {
                value = de.throwDe();
                value2 = de.throwDe();
                row = i + 1;
                System.out.println("Throw " + row);
                System.out.println("De 1 : "+value+" De 2 : "+value2);
                if (value == value2)
                    System.out.println("Win");
                else
                    System.out.println("Loose");
            }
        }
    }
}
