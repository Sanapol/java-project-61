package hexlet.code.games;

import hexlet.code.Constants;

public class Prime {
    public static String[][] gameRun() {
        var questionAnswer = new String[Constants.NUMBER_OF_ROUNDS][Constants.ONE_ROUND];
        for (var i = 0; i < Constants.NUMBER_OF_ROUNDS; i++) {
            int number = Constants.MIN_VALUE + (int) (Math.random() * Constants.MAX_VALUE);
            questionAnswer[i][0] = generateQuestion(number);
            questionAnswer[i][1] = generateAnswer(number);
        }
        return questionAnswer;
    }

    public static String generateQuestion(int number) {
        var question = String.valueOf(number);
        return question;
    }

    public static String generateAnswer(int number) {
        var halfNumber = number / 2;

        for (var i = 2; i <= halfNumber; i++) {
            if (number % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
