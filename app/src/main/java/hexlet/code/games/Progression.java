package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;



public class Progression {
    public static final String DESCRIPTION = "What number is missing in the progression?";
    public static final int PROGRESSION_LENGTH = 10;
    public static final int MAX_VALUE = 100;
    public static final int MIN_VALUE = 1;

    public static void play() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];
        int count = 0;
        while (count < Engine.ROUNDS) {
            int firstNumber = Utils.getRandomNumber(MIN_VALUE, MAX_VALUE);
            int step = Utils.getRandomNumber(MIN_VALUE, MAX_VALUE);
            String[] progression = makeProgression(firstNumber, step, PROGRESSION_LENGTH);
            int hiddenMemberIndex = Utils.getRandomNumber(progression.length - 1);


            String rightAnswer = progression[hiddenMemberIndex];
            progression[hiddenMemberIndex] = "..";
            String question = String.join(" ", progression);

            questionsAndAnswers[count][0] = question;
            questionsAndAnswers[count][1] = rightAnswer;
            count++;
        }
        Engine.run(questionsAndAnswers, DESCRIPTION);
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
