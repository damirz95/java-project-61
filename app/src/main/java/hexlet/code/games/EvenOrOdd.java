package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class EvenOrOdd {
    public static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void evenOrOdd() {
        System.out.println(DESCRIPTION);
        String userName = Engine.greeting();

        int count = 0;
        while (count < Engine.ROUNDS) {
            int number = Utils.getRandomNumber(100);
            System.out.println("Question: " + number);
            String rightAnswer = getAnswer(number);
            boolean check = Engine.checkingTheResponse(rightAnswer, userName);
            if (check) {
                count++;
            } else {
                break;
            }
        }
        if (count == 3) {
            Engine.getCongratulations(userName);
        }
    }
    public static String getAnswer(int number) {
        if (number % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }
}
