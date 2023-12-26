package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static final int ROUNDS = 3;

    public static String getName() {
        return Cli.greeting();
    }
    public static void getFaild(String userName) {
        System.out.println("Let's try again, " + userName + "!");
    }
    public static void getCongratulations(String userName) {
        System.out.println("Congratulations, " + userName + "!");
    }
    public static int numbersScanner() {
        Scanner scaner = new Scanner(System.in);
        return scaner.nextInt();
    }
    public static String textScanner() {
        Scanner scaner = new Scanner(System.in);
        return scaner.nextLine();
    }
    public static void getYourChoic(int number) {
        System.out.println("Your choice: " + number + "\n");
    }
}
