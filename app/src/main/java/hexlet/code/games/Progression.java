package hexlet.code.games;

import hexlet.code.Constants;

public class Progression {
    public static String[][] gameRun() {
        String[][] questionAnswer = new String[Constants.NUMBER_OF_ROUNDS][Constants.ONE_ROUND];

        for (var i = 0; i < Constants.NUMBER_OF_ROUNDS; i++) {
            int size = Constants.MIN_VALUE_SIZE + (int) (Math.random() * Constants.MAX_VALUE_SIZE);
            int position = Constants.MIN_VALUE + (int) (Math.random() * size);
            int number = (int) (Math.random() * Constants.MAX_VALUE);
            int step = Constants.MIN_VALUE + (int) (Math.random() * Constants.MAX_VALUE_STEP);
            questionAnswer[i][0] = generateQuestion(size, position, number, step);
            questionAnswer[i][1] = generateAnswer(number);
        }
        return questionAnswer;
    }

    public static String generateQuestion(int size, int position, int number, int step) {
        var forwardNumbers = size - position;
        var backwardNumbers = size - forwardNumbers - 1;
        var nextFrontNumber = number;
        var nextbackNumber = number;
        String result = "..";

        for (var i = 0; i < forwardNumbers; i++) {
            var frontNumber = nextFrontNumber + step;
            var stringFrontNumber = String.valueOf(frontNumber);
            result = result + " " + stringFrontNumber;
            nextFrontNumber = frontNumber;
        }
        for (var x = 0; x < backwardNumbers; x++) {
            var backNumber = nextbackNumber - step;
            var stringBackNumber = String.valueOf(backNumber);
            result = stringBackNumber + " " + result;
            nextbackNumber = backNumber;
        }
        return result;
    }

    public static String generateAnswer(int number) {
        var answer = String.valueOf(number);
        return answer;
    }
}
