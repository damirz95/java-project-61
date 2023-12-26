package hexlet.code;

public class Gcd {
    public static void gcd() {
        String userName = Engine.getName();
        System.out.println("Find the greatest common divisor of given numbers.");
        int maxDivizion = 0;
        int count = 0;
        while (count < 3) {
            int[] numbers = {Engine.getRandomNumber(100), Engine.getRandomNumber(100)};
            int maxValue = Math.max(numbers[0], numbers[1]);
            System.out.println("Question: " + numbers[0] + " " + numbers[1]);
            if (numbers[0] == 0 && numbers[1] == 0) {
                continue;
            }
            for (int i = 1; i < maxValue; i++) {
                if (((numbers[0] % i) == 0 && (numbers[1] % i) == 0)) {
                    maxDivizion = i;
                }
            }
            int answer = Engine.numbersScanner();
            System.out.println("Your answer: " + answer);
            if (answer == maxDivizion) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + maxDivizion + ".");
                System.out.println("Let's try again, " + userName);
                break;
            }
        }
        if (count == 3) {
            Engine.getCongratulations(userName);
        }
    }
}
