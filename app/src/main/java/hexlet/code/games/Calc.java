package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static final String DESCRIPTION = "What is the result of the expression?";
    public static final int MAX_VALUE = 100;
    public static void calc() {
        String[] operators = {"+", "-", "*"};
        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];
        int count = 0;

        while (count < Engine.ROUNDS) {
            int number1 = Utils.getRandomNumber(MAX_VALUE);
            int number2 = Utils.getRandomNumber(MAX_VALUE);
            int index = Utils.getRandomNumber(operators.length - 1);
            String operator = operators[index];

            String question = number1 + " " + operator + " " +  number2;
            int rightAnswer = calculate(number1, number2, operator);

            questionsAndAnswers[count][0] = question;
            questionsAndAnswers[count][1] = String.valueOf(rightAnswer);
            count++;
        }
        Engine.run(questionsAndAnswers, DESCRIPTION);
    }
    public static int calculate(int number1, int number2, String operator) {
        int result = 0;
        if (operator.equals("+")) {
            result = number1 + number2;
        } else if (operator.equals("-")) {
            result = number1 - number2;
        } else if (operator.equals("*")) {
            result = number1 * number2;
        }
        return result;
    }

}
