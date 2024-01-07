package hexlet.code;

public class Engine {
    public static final int ROUNDS = 3;

    public static void run(String[][] questionsAndAnswers, String description) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = Utils.textScanner();
        System.out.println("Hello, " + userName + "!");

        System.out.println(description);
        int count = 0;

        for (String[] questAndAnswer : questionsAndAnswers) {
            System.out.println("Question: " + questAndAnswer[0]);
            String userAnswer = Utils.textScanner();
            System.out.println("Your answer: " + userAnswer);
            if (userAnswer.equals(questAndAnswer[1])) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.print("'" + userAnswer + "' is wrong answer ;(. ");
                System.out.println("Correct answer was '" + questAndAnswer[1] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }
        if (count == ROUNDS) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
