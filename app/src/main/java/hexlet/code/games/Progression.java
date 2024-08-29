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
        String forwardNumbers = "";
        String backwardNumbers = "";
        int stepNumber = number;
        String result = "..";

        for (int i = 1; i <= size; i++) {
            if (i < position) {
                int backNumber = stepNumber - step;
                String stringBackNumber = String.valueOf(backNumber);
                backwardNumbers = stringBackNumber + " " + backwardNumbers;
                stepNumber = backNumber;
            } else if (i == position) {
                stepNumber = number;
            } else {
                int frontNumber = stepNumber + step;
                String stringFrontNumber = String.valueOf(frontNumber);
                forwardNumbers = forwardNumbers + " " + stringFrontNumber;
                stepNumber = frontNumber;
            }
        }
        result = backwardNumbers + result + forwardNumbers;
        return result;
    }

    public static String generateAnswer(int number) {
        return String.valueOf(number);
    }
}
