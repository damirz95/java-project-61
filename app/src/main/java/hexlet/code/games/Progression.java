package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;

public class Progression {
    public static void progression() {
        String userName = Engine.getName();
        System.out.println("What number is missing in the progression?");
        int count = 0;
        while (count < 3) {
            int beginPrpgress = Engine.getRandomNumber(1, 10);
            int step = Engine.getRandomNumber(1, 10);
            int[] arrayOfProgression = new int[10];
            arrayOfProgression[0] = beginPrpgress;
            for (int i = 1; i < arrayOfProgression.length; i++) {
                arrayOfProgression[i] = arrayOfProgression[i - 1] + step;
            }
            int replaceIndex = Engine.getRandomNumber(9);
            replaceIndex = arrayOfProgression[replaceIndex];
            String array = Arrays.toString(arrayOfProgression);
            String repNumber = Integer.toString(replaceIndex);
            System.out.println("Question:" + array.replaceAll("\\[|]", "").replace(repNumber, ".."));

            int answer = Engine.numbersScanner();
            System.out.println("Your answer: " + answer);
            if (answer == replaceIndex ) {
                System.out.println("Correct!");
                count++;
            }
        }
    }
}
