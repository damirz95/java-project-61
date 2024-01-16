package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static final int MAX_VALUE = 100;
    public static final int MIN_VALUE = 2;

    public static void play() {
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
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i += 1) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
