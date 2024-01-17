package hexlet.code;

import java.util.Scanner;
public class Engine {
    public static final int ROUNDS = 3;

    public static void run(String[][] questionsAndAnswers, String description) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();;
        System.out.println("Hello, " + userName + "!");

        System.out.println(description);

        for (String[] questAndAnswer : questionsAndAnswers) {
            System.out.println("Question: " + questAndAnswer[0]);
            String userAnswer =scanner.nextLine();
            System.out.println("Your answer: " + userAnswer);
            if (userAnswer.equals(questAndAnswer[1])) {
                System.out.println("Correct!");
            } else {
                System.out.print("'" + userAnswer + "' is wrong answer ;(. ");
                System.out.println("Correct answer was '" + questAndAnswer[1] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
