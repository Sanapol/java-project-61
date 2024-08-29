package hexlet.code.games;

import hexlet.code.Constants;
import hexlet.code.Engine;

public class Progression {
    public static void gameRun() {
        String[][] questionAnswer = new String[Constants.NUMBER_OF_ROUNDS][Constants.ONE_ROUND];

        for (var i = 0; i < Constants.NUMBER_OF_ROUNDS; i++) {
            int size = Constants.MIN_VALUE_SIZE + (int) (Math.random() * Constants.MAX_VALUE_SIZE);
            int position = Constants.MIN_VALUE + (int) (Math.random() * size);
            int number = Constants.MIN_VALUE + (int) (Math.random() * Constants.MAX_VALUE);
            int step = Constants.MIN_VALUE + (int) (Math.random() * Constants.MAX_VALUE_STEP);
            questionAnswer[i][0] = generateQuestion(size, position, number, step);
            questionAnswer[i][1] = generateAnswer(number);
        }
        String rules = "What number is missing in the progression?";
        Engine.run(rules, questionAnswer);
    }

    public static String generateQuestion(int size, int position, int number, int step) {
        int stepNumber = number;
        String result = "..";

        for (int i = 1; i <= size; i++) {
            if (i < position) {
                result = (stepNumber - step) + " " + result;
                stepNumber = stepNumber - step;
            } else if (i == position) {
                stepNumber = number;
            } else {
                result = result + " " + (stepNumber + step);
                stepNumber = stepNumber + step;
            }
        }
        return result;
    }

    public static String generateAnswer(int number) {
        return String.valueOf(number);
    }
}
