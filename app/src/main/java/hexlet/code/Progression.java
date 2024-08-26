package hexlet.code;

public class Progression {
    public static String[][] gameRun() {
        String[][] questionAnswer = new String[3][2];

        for (var i = 0; i < 3; i++) {
        int size = 5 + (int) (Math.random() * 6);
        int position = 1 + (int) (Math.random() * size);
        int number = (int) (Math.random() * 100);
        int step = 1 + (int) (Math.random() * 10);
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
