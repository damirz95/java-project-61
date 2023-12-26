package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static final String DESCRIPTION = "What is the result of the expression?";
    public static void calc() {
        String userName = Engine.getName();
        System.out.println(DESCRIPTION);

        String[] value = {"+", "-", "*"};
        int result = 0;
        int count = 0;
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int[] numbers = {Engine.getRandomNumber(100), Engine.getRandomNumber(2), Engine.getRandomNumber(100)};
            String question = numbers[0] + " " + value[numbers[1]] + " " +  numbers[2];
            System.out.println("Question: " + question);

            // TODO: создать отдельный медот
            if (numbers[1] == 0) {
                result = numbers[0] + numbers[2];
            } else if (numbers[1] == 1) {
                result = numbers[0] - numbers[2];
            } else if (numbers[1] == 2) {
                result = numbers[0] * numbers[2];
            }

            int userAnswer = Engine.numbersScanner();

            if (result == userAnswer) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + result + "'.");
                Engine.getFaild(userName);
                break;
            }
            if (count == 3) {
                Engine.getCongratulations(userName);
            }
        }
    }

}
