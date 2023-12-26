package hexlet.code.games;

import hexlet.code.Engine;

public class EvenOrOdd {
    public static void evenOrOdd() {
        String userName = Engine.getName();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int count = 0;
        while (count < 3) {
            int number = Engine.getRandomNumber(100);
            System.out.println("Question: " + number);
            int evenOfNumber = number % 2;

            String answer = Engine.textScanner();

            if ((evenOfNumber == 0 && "yes".equals(answer)) || (evenOfNumber > 0 && answer.equals("no"))) {
                System.out.println("Your answer: " + answer);
                System.out.println("Correct!");
                count++;
            } else if ((evenOfNumber == 0 && "no".equals(answer)) || (evenOfNumber > 0 && answer.equals("yes"))) {
                System.out.println("Your answer: " + answer);
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                Engine.getFaild(userName);
                break;
            }
        }
        if (count == 3) {
            Engine.getCongratulations(userName);
        }

    }

}
