package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Utils {
    public static int getRandomNumber(int numberBound) {
        Random random = new Random();
        return random.nextInt(numberBound);
    }
    public static int getRandomNumber(int numberBound, int numberBound2) {
        Random random = new Random();
        return random.nextInt(numberBound, numberBound2);
    }
    public static String textScanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static int numberScanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
