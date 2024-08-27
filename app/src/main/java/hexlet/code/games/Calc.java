package hexlet.code.games;

import hexlet.code.Constants;

public class Calc {
    public static String[][] gameRun() {
        String[][] questionAnswer = new String[Constants.NUMBER_OF_ROUNDS][Constants.ONE_ROUND];
        for (var i = 0; i < Constants.NUMBER_OF_ROUNDS; i++) {
            int number1 = Constants.MIN_VALUE + (int) (Math.random() * Constants.MAX_VALUE);
            int number2 = Constants.MIN_VALUE + (int) (Math.random() * Constants.MAX_VALUE);
            int operations = (int) (Math.random() * Constants.MAX_VALUE_OPERATIONS);
            questionAnswer[i][0] = createQuestion(number1, number2, operations);
            questionAnswer[i][1] = createAnswer(number1, number2, operations);
        }
        return questionAnswer;
    }

    public static String createQuestion(int number1, int number2, int operations) {
        var stringNumber1 = String.valueOf(number1);
        var stringNumber2 = String.valueOf(number2);

        return switch (operations) {
            case 0 -> stringNumber1 + " + " + stringNumber2;
            case 1 -> stringNumber1 + " - " + stringNumber2;
            case 2 -> stringNumber1 + " * " + stringNumber2;
            default -> throw new RuntimeException("wrong operations");
        };
    }

    public static String createAnswer(int number1, int number2, int operations) {
        var result = 0;
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
