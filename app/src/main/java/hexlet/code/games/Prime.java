package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static final int MAX_VALUE = 100;
    public static final int MIN_VALUE = 1;

    public static void prime() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];
        int count = 0;

        while (count < Engine.ROUNDS) {
            int number = Utils.getRandomNumber(MIN_VALUE, MAX_VALUE);
            String question = String.valueOf(number);
            String rightAnswer = isPrime(number) ? "yes" : "no";


            questionsAndAnswers[count][0] = question;
            questionsAndAnswers[count][1] = rightAnswer;
            count++;
        }
        Engine.run(questionsAndAnswers, DESCRIPTION);
    }
    public static boolean isPrime(int number) {
        int result = 0;
        for (int i = 2; i < number / 2; i++) {
            result = number % i;
            if (result == 0) {
                return false;
            }
        }
        return true;
    }
}
