package hexlet.code.games;

import hexlet.code.Constants;
import hexlet.code.Engine;

public class GCD {
    public static void gameRun() {
        String[][] questionAnswer = new String[Constants.NUMBER_OF_ROUNDS][Constants.ONE_ROUND];
        for (var i = 0; i < Constants.NUMBER_OF_ROUNDS; i++) {
            int number1 = Constants.MIN_VALUE + (int) (Math.random() * Constants.MAX_VALUE);
            int number2 = Constants.MIN_VALUE + (int) (Math.random() * Constants.MAX_VALUE);
            questionAnswer[i][0] = generateQuestion(number1, number2);
            questionAnswer[i][1] = generateAnswer(number1, number2);
        }
        String rules = "Find the greatest common divisor of given numbers.";
        Engine.run(rules, questionAnswer);
    }

    public static String generateQuestion(int number1, int number2) {
        var stringNumber1 = String.valueOf(number1);
        var stringNumber2 = String.valueOf(number2);
        return stringNumber1 + " " + stringNumber2;
    }

    public static String generateAnswer(int number1, int number2) {
        if (number2 == 0) {
            return String.valueOf(number1);
        }
        return generateAnswer(number2, number1 % number2);
    }
}
