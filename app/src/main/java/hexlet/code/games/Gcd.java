package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {
    public static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    public static void gcd() {
        String userName = Engine.greeting();
        System.out.println(DESCRIPTION);

        int count = 0;
        while (count < 3) {
            int[] numbers = {Utils.getRandomNumber(1, 100), Utils.getRandomNumber(1, 100)};
            System.out.println("Question: " + numbers[0] + " " + numbers[1]);
            String rightAnswer = getMaxDivision(numbers);

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
    public static String getMaxDivision(int[] numbers) {
        int maxDivision = 0;
        int maxValue = Math.max(numbers[0], numbers[1]);

        for (int i = 1; i < maxValue; i++) {
            if (((numbers[0] % i) == 0 && (numbers[1] % i) == 0)) {
                maxDivision = i;
            }
        }
        return Integer.toString(maxDivision);
    }
}
