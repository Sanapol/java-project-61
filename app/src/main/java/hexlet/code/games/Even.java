package hexlet.code.games;

import hexlet.code.Constants;

public class Even {
    public static String[][] gameRun() {
        String[][] questionAnswer = new String[Constants.NUMBER_OF_ROUNDS][Constants.ONE_ROUND];
        for (var i = 0; i < Constants.NUMBER_OF_ROUNDS; i++) {
            int random = Constants.MIN_VALUE + (int) (Math.random() * Constants.MAX_VALUE);
            var answer = random % 2 == 0 ? "yes" : "no";
            questionAnswer[i][0] = (String.valueOf(random));
            questionAnswer[i][1] = answer;
        }
        return questionAnswer;
    }
}
