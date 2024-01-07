package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class EvenOrOdd {
    public static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static final int MAX_VALUE = 100;

    public static void evenOrOdd() {
        int count = 0;
        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];

        while (count < Engine.ROUNDS) {
            int number = Utils.getRandomNumber(MAX_VALUE);
            String question = String.valueOf(number);
            String rightAnswer = isEven(number) ? "yes" : "no";

            questionsAndAnswers[count][0] = question;
            questionsAndAnswers[count][1] = rightAnswer;

            count++;
        }
        Engine.run(questionsAndAnswers, DESCRIPTION);
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
