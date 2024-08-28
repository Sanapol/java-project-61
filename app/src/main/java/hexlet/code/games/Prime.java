package hexlet.code.games;

import hexlet.code.Constants;
import hexlet.code.Engine;

public class Prime {
    public static void gameRun() {
        String[][] questionAnswer = new String[Constants.NUMBER_OF_ROUNDS][Constants.ONE_ROUND];
        for (int i = 0; i < Constants.NUMBER_OF_ROUNDS; i++) {
            int number = Constants.MIN_VALUE + (int) (Math.random() * Constants.MAX_VALUE);
            questionAnswer[i][0] = generateQuestion(number);
            questionAnswer[i][1] = generateAnswer(number);
        }
        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.run(rules, questionAnswer);
    }

    public static String generateQuestion(int number) {
        return String.valueOf(number);
    }

    public static String generateAnswer(int number) {
        int halfNumber = number / 2;

        for (int i = 2; i <= halfNumber; i++) {
            if (number % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
