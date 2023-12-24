package hexlet.code;

import java.util.Random;

public class Engine {
    public static String getName() {
        String userName = Cli.greeting();
        return userName;
    }
    public static int getRandomNumber(int numberBound) {
        Random random = new Random();
        int number = random.nextInt(numberBound);
        return number;
    }
    public static void getFaild(String userName) {
        System.out.println("Let's try again, " + userName + "!");
    }
    public static void getCongratulations(String userName) {
        System.out.println("Congratulations, " + userName + "!");
    }
}
