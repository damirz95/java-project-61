package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class EvenOrOdd {
    public static void evenOrOdd() {
        String name = Cli.greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int count = 0;
        while (count < 3) {
            Random random = new Random();
            int number = random.nextInt(100);
            System.out.println("Question: " + number);
            int evenOfNumber = number % 2;

            Scanner scaner = new Scanner(System.in);
            String answer = scaner.nextLine();

            if ((evenOfNumber == 0 && "yes".equals(answer)) || (evenOfNumber > 0 && answer.equals("no"))) {
                System.out.println("Your answer: " + answer);
                System.out.println("Correct!");
                count++;
            } else if ((evenOfNumber == 0 && "no".equals(answer)) || (evenOfNumber > 0 && answer.equals("yes"))) {
                System.out.println("Your answer: " + answer);
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        }
        if (count == 3) {
            System.out.println("Congratulations, " + name + "!");
        }

    }

}
