package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void run(String rules, String[][] questionAnswer) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println(rules);

        for (int i = 0; i < Constants.NUMBER_OF_ROUNDS; i++) {
            System.out.println("Question: " + questionAnswer[i][0] + "\nYour answer: ");
            String userAnswer = scanner.nextLine();
            if (userAnswer.equalsIgnoreCase(questionAnswer[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was "
                        + questionAnswer[i][1] + ".\nLet's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
