package hexlet.code;

public class Calc {
    public static void calc() {
        String userName = Engine.getName();
        System.out.println("What is the result of the expression?");

        String[] value = {"+", "-", "*"};
        int sum = 0;
        int count = 0;
        for (int i = 0; i < 3; i++) {
            int[] numbers = {Engine.getRandomNumber(100), Engine.getRandomNumber(2), Engine.getRandomNumber(100)};
            String question = numbers[0] + " " + value[numbers[1]] + " " +  numbers[2];
            System.out.println("Question: " + question);

            if (numbers[1] == 0) {
                sum = numbers[0] + numbers[2];
            } else if (numbers[1] == 1) {
                sum = numbers[0] - numbers[2];
            } else if (numbers[1] == 2) {
                sum = numbers[0] * numbers[2];
            }

            int userAnswer = Engine.numbersScanner();

            if (sum == userAnswer) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + sum + "'.");
                Engine.getFaild(userName);
                break;
            }
            if (count == 3) {
                Engine.getCongratulations(userName);
            }
        }
    }

}
