package exo8;

import java.util.Random;

public class De {
    int value;
    static Random random = new Random();

    public int throwDe() { ;
        int value;
        value = random.nextInt(6) + 1;
        setValue(value);
        return value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
