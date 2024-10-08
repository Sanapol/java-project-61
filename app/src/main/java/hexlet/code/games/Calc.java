package hexlet.code.games;

import hexlet.code.Constants;
import hexlet.code.Engine;

public class Calc {
    public static void gameRun() {
        String[][] questionAnswer = new String[Constants.NUMBER_OF_ROUNDS][Constants.ONE_ROUND];
        for (int i = 0; i < Constants.NUMBER_OF_ROUNDS; i++) {
            int number1 = Constants.MIN_VALUE + (int) (Math.random() * Constants.MAX_VALUE);
            int number2 = Constants.MIN_VALUE + (int) (Math.random() * Constants.MAX_VALUE);
            int operations = (int) (Math.random() * Constants.MAX_VALUE_OPERATIONS);
            questionAnswer[i][0] = createQuestion(number1, number2, operations);
            questionAnswer[i][1] = createAnswer(number1, number2, operations);
        }
        String rules = "What is the result of the expression?";
        Engine.run(rules, questionAnswer);
    }

    public static String createQuestion(int number1, int number2, int operations) {
        String stringNumber1 = String.valueOf(number1);
        String stringNumber2 = String.valueOf(number2);

        return switch (operations) {
            case Constants.OPERATOR_PLUS -> stringNumber1 + " + " + stringNumber2;
            case Constants.OPERATOR_MINUS -> stringNumber1 + " - " + stringNumber2;
            case Constants.OPERATOR_MULTIPLY -> stringNumber1 + " * " + stringNumber2;
            default -> throw new RuntimeException("wrong operations");
        };
    }

    public static String createAnswer(int number1, int number2, int operations) {
        int result = 0;
        switch (operations) {
            case 0:
                result = number1 + number2;
                return String.valueOf(result);
            case 1:
                result = number1 - number2;
                return String.valueOf(result);
            case 2:
                result = number1 * number2;
                return String.valueOf(result);
            default:
                throw new RuntimeException("wrong operations");
        }
    }
}
