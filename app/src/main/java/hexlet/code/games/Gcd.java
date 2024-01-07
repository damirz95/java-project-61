package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {
    public static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    public static final int MAX_VALUE = 100;
    public static final int MIN_VALUE = 1;

    public static void gcd() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];
        int count = 0;

        while (count < Engine.ROUNDS) {
            int number1 = Utils.getRandomNumber(MIN_VALUE, MAX_VALUE);
            int number2 = Utils.getRandomNumber(MIN_VALUE, MAX_VALUE);
            String question = number1 + " " + number2;
            int rightAnswer = gcd(number1, number2);
            questionsAndAnswers[count][0] = question;
            questionsAndAnswers[count][1] = String.valueOf(rightAnswer);
            count++;
        }
        Engine.run(questionsAndAnswers, DESCRIPTION);
    }
    public static int gcd(int number1, int number2) {
        int maxDivision = 0;
        int maxValue = Math.max(number1, number2);

        for (int i = 1; i < maxValue; i++) {
            if (((number1 % i) == 0 && (number2 % i) == 0)) {
                maxDivision = i;
            }
        }
        return maxDivision;
    }
}
