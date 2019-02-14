package exo8;

import java.util.Random;

public class De {
    int value;

    public int throwDe() {
        Random random = new Random();
        int value;
        value = random.nextInt(6 - 1 + 1) + 1;
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
