package hexlet.code;

public class Engine {
    public static final int ROUNDS = 3;
    public static String greeting() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = Utils.textScanner();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }
    public static void getCongratulations(String userName) {
        System.out.println("Congratulations, " + userName + "!");
    }
    public static void nextQuestion(String answer) {
        System.out.println("Your answer: " + answer);
        System.out.println("Correct!");
    }
    public static void gameOver(String userName, String answer, String rightAnswer) {
        System.out.println("Your answer: " + answer);
        System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'.");
        System.out.println("Let's try again, " + userName + "!");
    }
    public static boolean checkingTheResponse(String rightAnswer, String userName) {
        String answer = Utils.textScanner();
        if (answer.equals(rightAnswer)) {
            nextQuestion(answer);
            return true;
        } else {
            gameOver(userName, answer, rightAnswer);
            return false;
        }
    }
}
