package hexlet.code.games;

import hexlet.code.Constants;

public class GCD {
    public static String[][] gameRun() {
        String[][] questionAnswer = new String[Constants.NUMBER_OF_ROUNDS][Constants.ONE_ROUND];
        for (var i = 0; i < Constants.NUMBER_OF_ROUNDS; i++) {
            int number1 = (int) (Math.random() * Constants.MAX_VALUE);
            int number2 = (int) (Math.random() * Constants.MAX_VALUE);
            questionAnswer[i][0] = generateQuestion(number1, number2);
            questionAnswer[i][1] = generateAnswer(number1, number2);
        }
        return questionAnswer;
    }

    public static String generateQuestion(int number1, int number2) {
        var stringNumber1 = String.valueOf(number1);
        var stringNumber2 = String.valueOf(number2);
        return stringNumber1 + " " + stringNumber2;
    }

    public static String generateAnswer(int number1, int number2) {
        var biggerNumber = 0;
        var lowerNumber = 0;
        if (number1 >= number2) {
            biggerNumber = number1;
            lowerNumber = number2;
        } else {
            biggerNumber = number2;
            lowerNumber = number1;
        }

        for (var i = biggerNumber; i >= 1; i--) {
            if (biggerNumber % i == 0) {
                for (var x = lowerNumber; x >= 1; x--) {
                    if (lowerNumber % x == 0) {
                        if (i == x) {
                            return String.valueOf(i);
                        }
                    }
                }
            }
        }
        return "wrong operation";
    }
}
