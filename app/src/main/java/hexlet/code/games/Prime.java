package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void prime() {
        String userName = Engine.greeting();
        System.out.println(DESCRIPTION);

        int count = 0;
        while (count < 3) {
            int number = Utils.getRandomNumber(1, 100);
            String rightAnswer = checkingTheNumber(number);
            System.out.println("Question: " + number);

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
    public static String checkingTheNumber(int number) {
        if (((number / 1 == number) && (number / number == 1) && (number % 2 != 0)) || number == 2) {
            return "yes";
        } else {
            return "no";
        }
    }
}
