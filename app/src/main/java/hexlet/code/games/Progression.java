package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;



public class Progression {
    public static final String DESCRIPTION = "What number is missing in the progression?";
    public static final int PROGRESSION_LENGTH = 10;
    public static void progression() {
        String userName = Engine.greeting();
        System.out.println(DESCRIPTION);
        int count = 0;
        while (count < Engine.ROUNDS) {
            int first = Utils.getRandomNumber(1, 10);
            int step = Utils.getRandomNumber(1, 10);
            int hiddenMemberIndex = Utils.getRandomNumber(9);

            String[] progression = makeProgression(first, step, PROGRESSION_LENGTH);
            String correctAnswer = progression[hiddenMemberIndex];
            progression[hiddenMemberIndex] = "..";

            String question = String.join(" ", progression);
            System.out.println("Question: " + question);

            boolean check = Engine.checkingTheResponse(correctAnswer, userName);
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
    public static String[] makeProgression(int first, int step, int progressionLength) {
        String[] progression = new String[progressionLength];
        progression[0] = "" + first;
        for (int i = 1; i < progressionLength; i++) {
            first = first + step;
            progression[i] = "" + first;
        }
        return progression;
    }
}
