package hexlet.code;

import java.util.Random;

public class Utils {
    public static int getRandomNumber(int numberBound) {
        Random random = new Random();
        return random.nextInt(numberBound);
    }
    public static int getRandomNumber(int numberBound, int numberBound2) {
        Random random = new Random();
        return random.nextInt(numberBound, numberBound2);
    }
}
