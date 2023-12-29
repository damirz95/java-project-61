package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static final String DESCRIPTION = "What is the result of the expression?";
    public static void calc() {
        String userName = Engine.greeting();
        System.out.println(DESCRIPTION);

        String[] operator = {"+", "-", "*"};

        int count = 0;
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int[] numbers = {Utils.getRandomNumber(100), Utils.getRandomNumber(2), Utils.getRandomNumber(100)};
            String question = numbers[0] + " " + operator[numbers[1]] + " " +  numbers[2];
            System.out.println("Question: " + question);
            String rightAnswer = answerToTheQuestion(numbers);

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
    public static String answerToTheQuestion(int[] numbers) {
        int result = 0;
        if (numbers[1] == 0) {
            result = numbers[0] + numbers[2];
        } else if (numbers[1] == 1) {
            result = numbers[0] - numbers[2];
        } else if (numbers[1] == 2) {
            result = numbers[0] * numbers[2];
        }
        return Integer.toString(result);
    }

}
