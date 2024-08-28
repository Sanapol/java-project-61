package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Constants;

public class Even {
    public static void gameRun() {
        String[][] questionAnswer = new String[Constants.NUMBER_OF_ROUNDS][Constants.ONE_ROUND];
        for (var i = 0; i < Constants.NUMBER_OF_ROUNDS; i++) {
            int random = Constants.MIN_VALUE + (int) (Math.random() * Constants.MAX_VALUE);
            String answer = random % 2 == 0 ? "yes" : "no";
            questionAnswer[i][0] = (String.valueOf(random));
            questionAnswer[i][1] = answer;
        }
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.run(rules, questionAnswer);
    }
}
