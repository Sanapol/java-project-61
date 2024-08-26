package hexlet.code;

public class Even {
    public static String[][] gameRun() {
        String[][] questionAnswer = new String[3][2];
        for (var i = 0; i < 3; i++) {
            int random = (int) (Math.random() * 100);
            var answer = random % 2 == 0 ? "yes" : "no";
            questionAnswer[i][0] = (String.valueOf(random));
            questionAnswer[i][1] = answer;
        }
        return questionAnswer;
    }
}
