package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static void calc() {
        String userName = Engine.getName();
        System.out.println("What is the result of the expression?");

        String[] value = {"+", "-", "*"};
        Random random = new Random();
        int sum = 0;
        int cout = 0;
        for (int i = 0; i < 3; i++) {
            int[] numbers = {random.nextInt(10), random.nextInt(2), random.nextInt(10)};
            String question = numbers[0] + " " + value[numbers[1]] + " " +  numbers[2];
            System.out.println("Question: " + question);

            if (numbers[1] == 0) {
                sum = numbers[0] + numbers[2];
            } else if (numbers[1] == 1) {
                sum = numbers[0] - numbers[2];
            } else if (numbers[1] == 2) {
                sum = numbers[0] * numbers[2];
            }

            Scanner scanner = new Scanner(System.in);
            int userAnswer = scanner.nextInt();

            if (sum == userAnswer) {
                System.out.println("Correct!");
                cout++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + sum + "'.");
                Engine.getFaild(userName);
                break;
            }
            if (cout == 3) {
                Engine.getCongratulations(userName);
            }
        }
    }

}
